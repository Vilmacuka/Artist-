import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestArtist {
	@Test
	void testAddArtist_testCase1() {
		// Test Case 1: Check the function with Artist ID < 10 characters long.
		
		//Test Case 1_Test Data 1
		Artist artisttestCase1Data1 = new Artist ("678EEEEM*", "07-12-1981", "Melbourne|Victoria|Australia", "This artist surely has a truly unique voice and remarkable history.", "Composer, Producer", "2021, Best Album Of The Year", "classical, jazz, blues");
		//assertEquals ("The artist information cannot be added",artisttestCase1Data1.AddArtist());
		assertFalse(artisttestCase1Data1.addArtist());
		//Test Case 1_Test Data 2
		Artist artisttestCase1Data2 = new Artist ("678EEEE*", "07-12-1981", " Melbourne|Victoria|Australia", "This artist surely has a truly unique voice and remarkable history.", "Composer, Producer", "2021, Best Album Of The Year", "classical, jazz, blues");
		//assertEquals ("The artist information cannot be added",artisttestCase1Data2.AddArtist());
		assertFalse(artisttestCase1Data2.addArtist());
		
    }
	@Test
	void testAddArtist_testCase2() {
		// Test Case 2: Checking the function with valid format of the birth date.
		//Test Case 2_Test Data 1
		Artist artisttestCase2Data1 = new Artist ("678EEEEM$*", "07-12-1981", " Melbourne|Victoria|Australia", "This artist surely has a truly unique voice and remarkable history.", "Composer, Producer", "2021, Best Album Of The Year", "classical, jazz, blues");
		//assertEquals ("The artist information can be added",artisttestCase2Data1.AddArtist());
		assertFalse(artisttestCase2Data1.addArtist());
		//Test Case 2_Test Data 2
		Artist artisttestCase2Data2 = new Artist ("876ABCBE_!", "25-12-1993", " Melbourne|Victoria|Australia", "Indeed, his compositions always remain timeless for many generations now.", "Singer, Composer", "2022, Best Album Of The Year", "classical, jazz");
		//assertEquals ("The artist information can be added",artisttestCase2Data2.AddArtist());
		assertFalse(artisttestCase2Data2.addArtist());
		
    }			
	@Test
	void testAddArtist_testCase3() {
		// Test Case 3: Checking the function with invalid address format.
		//Test Case 3_Test Data 1
		Artist artisttestCase3Data1 = new Artist ("678EEEEM$*", "07-12-1981", " Melbourne", "This artist surely has a truly unique voice and remarkable history.", "Composer, Producer", "2021, Best Album Of The Year", "classical, jazz, blues");
		//assertEquals ("The artist information cannot be added",artisttestCase3Data1.AddArtist());
		assertFalse(artisttestCase3Data1.addArtist());
		//Test Case 3_Test Data 2
		Artist artisttestCase3Data2 = new Artist ("678EEEEM$*", "07-12-1981", " Victoria, Melbourne", "This artist surely has a truly unique voice and remarkable history.", "Composer, Producer", "2021, Best Album Of The Year", "classical, jazz, blues");
		//assertEquals ("The artist information cannot be added",artisttestCase3Data2.AddArtist());
		assertFalse(artisttestCase3Data2.addArtist());
	
    }	
	@Test
	void testAddArtist_testCase4() {
		// Test Case 4: Checking the function with artist bio < 10 words.
		//Test Case 4_Test Data 1
		Artist artisttestCase4Data1 = new Artist ("678EEEEM$*", "07-12-1981", " Melbourne|Victoria|Australia", "This artist surely has a truly unique voice.", "Composer, Producer", "2021, Best Album Of The Year", "classical, jazz, blues");
		//assertEquals ("The artist information cannot be added",artisttestCase4Data1.AddArtist());
		assertFalse(artisttestCase4Data1.addArtist());
		//Test Case 4_Test Data 2
		Artist artisttestCase4Data2 = new Artist ("876ABCBE_!", "25-12-1993", " Melbourne|Victoria|Australia", "His compositions always remain timeless for many generations now.", "Singer, Composer ", "2022, Best Album Of The Year", "classical, jazz");
		//assertEquals ("The artist information cannot be added",artisttestCase4Data2.AddArtist());
		assertFalse(artisttestCase4Data2.addArtist());
		
	}	
	@Test
	void testAddArtist_testCase5() {
		// Test Case 5: Checking the function with title of award too short.
		//Test Case 5_Test Data 1
		Artist artisttestCase5Data1 = new Artist ("678EEEEM$*", "07-12-1981", " Melbourne|Victoria|Australia", "This artist surely has a truly unique voice and remarkable history.", "Composer, Producer", "2021, Best Album", "classical, jazz, blues");
		//assertEquals ("The artist information cannot be added",artisttestCase5Data1.AddArtist());
		assertFalse(artisttestCase5Data1.addArtist());
		//Test Case 5_Test Data 2
		Artist artisttestCase5Data2 = new Artist ("876ABCBE_!", "25-12-1993", " Melbourne|Victoria|Australia", "Indeed, his compositions always remain timeless for many generations now.", "Singer, Composer", "2022, Best ", "classical, jazz");
		//assertEquals ("The artist information cannot be added",artisttestCase5Data2.AddArtist());
		assertFalse(artisttestCase5Data2.addArtist());
		
	}	
	@Test
	void testAddArtist_testCase6() {
		// Test Case 6: Checking the function with 1 music genre.
		//Test Case 6_Test Data 1
		Artist artisttestCase6Data1 = new Artist ("678EEEEM$*", "07-12-1981", " Melbourne|Victoria|Australia", "This artist surely has a truly unique voice and remarkable history.", "Composer, Producer", "2021, Best Album Of The Year", "jazz");
		//assertEquals ("The artist information cannot be added",artisttestCase6Data1.AddArtist());
		assertFalse(artisttestCase6Data1.addArtist());
		//Test Case 6_Test Data 2
		Artist artisttestCase6Data2 = new Artist ("876ABCBE_!", "25-12-1993", " Melbourne|Victoria|Australia", "Indeed, his compositions always remain timeless for many generations now.", "Singer, Composer", "2022, Best Album Of The Year", "pop");
		//assertEquals ("The artist information cannot be added",artisttestCase6Data2.AddArtist());
		assertFalse(artisttestCase6Data2.addArtist());
		
	}
	@Test
	void testUpdateArtist_testCase1() {
		// Test Case: Check the function with invalid Artist ID and format of the birth date.
			
		//Test Case 1_Test Data 1
		Artist artisttestCase1Data1 = new Artist ("67876DMM&^", "1994-05-25", "Melbourne|Victoria|Australia", " This artist mixes beats that resonate with diverse global audiences.", "DJ, Producer", "2020, Best DJ Set Of The Year", "techno, jazz, blues");
		//assertEquals ("The artist information cannot be updated",artisttestCase1Data1.UpdateArtist());
		assertFalse(artisttestCase1Data1.updateArtist(artisttestCase1Data1));	
		//Test Case 1_Test Data 2
		Artist artisttestCase1Data2 = new Artist ("ABCMMMEE*#", "06,11,1990", " Melbourne|Victoria|Australia", " As a producer, he crafts soundscapes that resonate across diverse audiences.", "Composer, Producer", "2015, Best Album Of The Year; 2014, Top Song ", "house, electro, ambient");
		//assertEquals ("The artist information cannot be updated",artisttestCase1Data2.UpdateArtist());
		assertFalse(artisttestCase1Data2.updateArtist(artisttestCase1Data2));
		
		
	}
	@Test
	void testUpdateArtist_testCase2() {
		// Test Case 2: Check the function with valid Artist ID and format of the birth date.
		//Test Case 2_Test Data 1
		Artist artisttestCase2Data1 = new Artist ("678BCDMM&^", "25-05-1994", "Melbourne|Victoria|Australia", " This artist mixes beats that resonate with diverse global audiences.", "DJ, Producer", "2020, Best DJ Set Of The Year", "techno, jazz, blues");
		//assertEquals ("The artist information can be updated",artisttestCase2Data1.UpdateArtist());
		assertFalse(artisttestCase2Data1.updateArtist(artisttestCase2Data1));	
		//Test Case 2_Test Data 2
		Artist artisttestCase2Data2 = new Artist ("789MMMEE*#", "06-11-1990", " Melbourne|Victoria|Australia", " As a producer, he crafts soundscapes that resonate across diverse audiences.", "Composer, Producer", "2015, Best Album Of The Year; 2014, Top Song ", "house, electro, ambient");
		//assertEquals ("The artist information can be updated",artisttestCase2Data2.UpdateArtist());
		assertFalse(artisttestCase2Data2.updateArtist(artisttestCase2Data2));
			
    }			
	@Test
	void testUpdateArtist_testCase3() {
		// Test Case 3: Checking the function with invalid address format, Artist ID and format of the birth date.
		//Test Case 3_Test Data 1
		Artist artisttestCase3Data1 = new Artist ("678BCDMM23", "25/05/1994", "Melbourne,Victoria,Australia", " This artist mixes beats that resonate with diverse global audiences.", "DJ, Producer", "2020, Best DJ Set Of The Year", "techno, jazz, blues");
		//assertEquals ("The artist information cannot be updated",artisttestCase3Data1.UpdateArtist());
		assertFalse(artisttestCase3Data1.updateArtist(artisttestCase3Data1));
		//Test Case 3_Test Data 2
		Artist artisttestCase3Data2 = new Artist ("789MMM34*#", "06 November 1990", "Victoria|Australia", " As a producer, he crafts soundscapes that resonate across diverse audiences.", "Composer, Producer", "2015, Best Album Of The Year; 2014, Top Song ", "house, electro, ambient");
		//assertEquals ("The artist information cannot be updated",artisttestCase3Data2.UpdateArtist());
		assertFalse(artisttestCase3Data2.updateArtist(artisttestCase3Data2));
		
    }	
	@Test
	void testUpdateArtist_testCase4() {
		// Test Case 4: Checking the function with artist bio < 10 words.
		//Test Case 4_Test Data 1
		Artist artisttestCase4Data1 = new Artist ("678BCDMM&^", "25-05-1994", "Melbourne|Victoria|Australia", "Artist mixes beats resonating with global diverse audiences.", "DJ, Producer", "2020, Best DJ Set Of The Year", "techno, jazz, blues");
		//assertEquals ("The artist information cannot be updated",artisttestCase4Data1.UpdateArtist());
		assertFalse(artisttestCase4Data1.updateArtist(artisttestCase4Data1));
		//Test Case 4_Test Data 2
		Artist artisttestCase4Data2 = new Artist ("789MMMEE*#", "06-11-1990", " Melbourne|Victoria|Australia", " This artist crafts soundscapes that resonate across diverse audiences.", "Composer, Producer", "2015, Best Album Of The Year; 2014, Top Song ", "house, electro, ambient");
		//assertEquals ("The artist information cannot be updated",artisttestCase4Data2.UpdateArtist());
		assertFalse(artisttestCase4Data2.updateArtist(artisttestCase4Data2));
		
	}	
	@Test
	void testUpdateArtist_testCase5() {
		// Test Case 5: Checking the function with artist born before 2000 and changed occupation.
		//Test Case 5_Test Data 1
		Artist artisttestCase5Data1 = new Artist ("678BCDMM&^", "25-05-1994", "Melbourne|Victoria|Australia", " This artist mixes beats that resonate with diverse global audiences.", "Original occupation DJ, updated to Composer", "2020, Best DJ Set Of The Year", "techno, jazz, blues");
		//assertEquals ("The artist information cannot be updated",artisttestCase5Data1.UpdatedArtist());
		assertFalse(artisttestCase5Data1.updateArtist(artisttestCase5Data1));
		//Test Case 5_Test Data 2
		Artist artisttestCase5Data2 = new Artist ("789MMMEE*#", "06-11-1990", " Melbourne|Victoria|Australia", " As a producer, he crafts soundscapes that resonate across diverse audiences.", " Original occupation Composer, updated to Singer", "2015, Best Album Of The Year; 2014, Top Song ", "house, electro, ambient");
		//assertEquals ("The artist information cannot be updated",artisttestCase5Data2.UpdateArtist());
		assertFalse(artisttestCase5Data2.updateArtist(artisttestCase5Data2));
			
	}	
	@Test
	void testUpdateArtist_testCase6() {
		// Test Case 6: Checking the function with update award title given after 2000.
		//Test Case 6_Test Data 1
		Artist artisttestCase6Data1 = new Artist ("678BCDMM&^", "25-05-1994", "Melbourne|Victoria|Australia", " This artist mixes beats that resonate with diverse global audiences.", "DJ, Producer", " Original Award: 2020, Best DJ Set Of The Year, Updated Award: 2014, Best Artist Of The Year ", "techno, jazz, blues");
		//assertEquals ("The artist information can be updated",artisttestCase6Data1.UpdateArtist());
		assertFalse(artisttestCase6Data1.updateArtist(artisttestCase6Data1));
		//Test Case 6_Test Data 2
		Artist artisttestCase6Data2 = new Artist ("789MMMEE*#", "06-11-1990", " Melbourne|Victoria|Australia", " As a producer, he crafts soundscapes that resonate across diverse audiences.", "Composer, Producer", " Original Award: 2015, Best Album Of The Year; 2020, Top Song, Updated Award: 2015, Best Artist Of The Year; 2013", "house, electro, ambient");
		//assertEquals ("The artist information can be updated",artisttestCase6Data2.UpdateArtist());
		assertFalse(artisttestCase6Data2.updateArtist(artisttestCase6Data2));
		
    }
}


