package csc232;

/**
 * The Location class manages the fields of each Location object.
 * It has methods that can:
 * - set and get the name and description of a location,
 * - add items to an ArrayList of items of that location,
 * - retrieve an item's description by passing in the item's name or its index,
 * - retrieve the size of the ArrayList of items
 * 
 * @author Truc Le
 *
 */

import java.util.ArrayList;

public class Location 
{
	private String name;
	private String description;
	private ArrayList<Item> contents = new ArrayList<Item>();
	
	
	/**
	 * The default constructor.
	 */
	public Location( )
	{
		name = "Bedroom";
		description = "A room filled with sunlight";
		contents = new ArrayList<Item>();
	}
	
	
	/**
	 * Constructor with given name and description.
	 * @param n The name of the location
	 * @param d The description of the location
	 */
	public Location( String n, String d )
	{
		name = n;
		description = d;
		contents = new ArrayList<Item>();
	}
	
	
	/**
	 * Constructor with given name and description.
	 * @param n The name of the location
	 * @param d The description of the location
	 * @param c The contents of the location
	 */
	public Location( String n, String d, ArrayList<Item> c )
	{
		name = n;
		description = d;
		contents = c;
	}
	
	
	/**
	 * Returns the name of the location.
	 * @return The name of the location.
	 */
	public String getName()
	{
		return name;
	}
	
	
	/**
	 * Returns the description of the location.
	 * @return The description of the location.
	 */
	public String getDescription( )
	{
		return description;
	}
	
	
	/**
	 * Adds the given Item to the contents list of the location.
	 * @param it The item to add to the location.
	 */
	public void addItem( Item item )
	{
		contents.add( item );
	}
	
	
	/**
	 * Returns the item with the given name in the location.
	 * @param name The name of the item to find.
	 * @return The item with the given name, or null if that item doesn't exist.
	 */
	public Item retrieveItem( String name )
	{
		for ( Item item : contents )
		{
			if ( item.getName().toLowerCase().equals( name.toLowerCase() ) )
				return item;
		}
		return null;
	}
	
	
	/**
	 * Returns the item in position i from the contents list of the location.
	 * @param i The position of the item
	 * @return The item from the list, or null if position does not exist.
	 */
	public Item retrieveItem( int i )
	{
		if ( ( i >= 0 ) && ( i < contents.size() ) )
			return contents.get( i );
		else
			return null;
	}
	
	
	/**
	 * Returns the number of items found in the location.
	 * @return The number of items found in the location.
	 */
	public int countItems( )
	{
		return contents.size();
	}

}
