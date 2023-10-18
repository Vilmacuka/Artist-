import java.util.StringTokenizer;

public class Artist {
	// Attributes of an artist
	private String Id; // unique identifier for the artist
    private String Address; // unique identifier for the artist
    private String Birthdate; // artist's birthdate in format DD-MM-YYYY
    private String Bio; // short biography of the artist
    private String Occupations; // jobs the artist is known for (singer, songwriter, etc.)
    private String Genres; // musical genres associated with the artist
    private String Awards; // awards received by the artist
	
    // Constructor for the Artist class
    public Artist(String id, String address, String birthdate, String bio, String occupations,
                  String genres, String awards) {
        Id = id;
        Address = address;
        Birthdate = birthdate;
        Bio = bio;
        Occupations = occupations;
        Genres = genres;
        Awards = awards;
    }
    
    public boolean addArtist() {
    	//Ensure ID format is valid (starts with a number 5-9, followed by 5 uppercase letters, and 2 non-word characters)
    	if (!Id.matches("^[5-9]{3}[A-Z]{5}[\\W]{2}$")) {
    		return false;
        }
    	// Ensure birthdate format is valid (DD-MM-YYYY)
        if (!Birthdate.matches("^\\d{2}-\\d{2}-\\d{4}$")) {
            return false;
        }
        // Address should be separated by "|" and have three parts
        StringTokenizer addressTokenizer = new StringTokenizer(Address, "|");
        if (addressTokenizer.countTokens() != 3) {
            return false;
        }
        // Ensure biography word count is between 10 and 30
        int wordCount = new StringTokenizer(Bio).countTokens();
        if (wordCount < 10 || wordCount > 30) {
            return false;
        }
        // Ensure biography word count is between 10 and 30
        String[] occupationArray = Occupations.split(", ");
        if (occupationArray.length < 1 || occupationArray.length > 5) {
            return false;
        }
     // Artist can have at most 3 awards
        String[] awardsArray = Awards.split(", ");
        if (awardsArray.length > 3) {
            return false;
        }
        // Validate award description word count
        for (String award : awardsArray) {
            String[] parts = award.split(", ");
            if (parts.length != 2) return false;
            int wordCountaward = new StringTokenizer(parts[1]).countTokens();
            if (wordCountaward < 4 || wordCountaward > 10) return false;
        }
        // Artist should have between 2 and 5 genres and not both "pop" and "rock"
        String[] genresArray = Genres.split(", ");
        if (genresArray.length < 2 || genresArray.length > 5 || (Genres.contains("pop") && Genres.contains("rock"))) {
            return false;
        }
        return true;
    }

    public boolean updateArtist(Artist updatedArtist) {
    	// Validate the updated artist details
        if (!updatedArtist.addArtist()) {
            return false;
        }
        // If birth year is before 2000, occupations shouldn't change
        int birthYear = Integer.parseInt(updatedArtist.getBirthdate().split("-")[2]);
        if (birthYear < 2000 && !Occupations.equals(updatedArtist.getOccupations())) {
            return false;
        }
        // If award year is before 2000, award details shouldn't change
        for (String award : updatedArtist.getAwards().split(", ")) {
            String[] parts = award.split(", ");
            int awardYear = Integer.parseInt(parts[0]);
            if (awardYear < 2000) {
                for (String oldAward : Awards.split(", ")) {
                    if (oldAward.startsWith(parts[0] + ", ") && !oldAward.equals(award)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // Getters and Setters
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }


    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String birthdate) {
        Birthdate = birthdate;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public String getOccupations() {
        return Occupations;
    }

    public void setOccupations(String occupations) {
        Occupations = occupations;
    }

    public String getGenres() {
        return Genres;
    }

    public void setGenres(String genres) {
        Genres = genres;
    }

    public String getAwards() {
        return Awards;
    }

    public void setAwards(String awards) {
        Awards = awards;
    }

	public Object addartist() {
		 // Unused method, possibly intended for some future functionality
		// TODO Auto-generated method stub
		return null;
	}
}
