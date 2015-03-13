package csc232;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest {

	@Test
	public void test() {
		Location locationTest = new Location();
		
		locationTest.setName( "Julian" );
		locationTest.setDescription( "An old building that needs more windows" );
		
		assertEquals(locationTest.getName(), "Julian");
		assertEquals(locationTest.getDescription(), "An old building that needs more windows");	
	}

}
