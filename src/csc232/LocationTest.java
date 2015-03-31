package csc232;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Truc Le
 *
 */
public class LocationTest {

	Location location;
	Item item1;
	Item item2;
	
	public LocationTest()
	{
		location = new Location( "Beach", "This is a beach." );
		item1 = new Item( "sword", "A sharp sword", "weapon" );
		item2 = new Item( "sandwich", "A PB&J", "food" );
		location.addItem( item1 );
		location.addItem( item2 );
	}
	
	@Test
	public void testGetName() 
	{
		assertEquals( "Beach", location.getName() );
	}

	@Test
	public void testGetDescription() 
	{
		assertEquals( "This is a beach.", location.getDescription() );
	}
		
	@Test
	public void testRetrieveItem1() 
	{
		assertEquals( item1, location.retrieveItem( "sword" ) );
	}

	@Test
	public void testRetrieveItem2() 
	{
		assertEquals( null, location.retrieveItem( "pineapple" ) );
	}
	
	@Test
	public void testRetrieveItem3() 
	{
		assertEquals( item2, location.retrieveItem( 1 ) );
	}
	
	@Test
	public void testRetrieveItem4() 
	{
		assertEquals( null, location.retrieveItem( 5 ) );
	}

	@Test
	public void testCountItems() 
	{
		assertEquals( 2, location.countItems() );
	}

	@Test
	public void testAddItem() 
	{
		location.addItem( new Item() );
		assertEquals( 3, location.countItems() );
	}

}
