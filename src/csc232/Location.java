package csc232;

/**
 * This class represents a particular location in our adventure game.
 * 
 * It contains the following data fields:
 *   name - The name of the location
 *   description - A description of the location
 *   contents - A list of Items that are in the location
 * 
 * @author Truc Le
 *
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Location
{
	private String name;
	private String description;
	private ArrayList<Item> contents;
	private HashMap<String, Location> map = new HashMap<String, Location>();
	private boolean isAccessible;
	
	/**
	 * The default constructor.
	 */
	public Location()
	{
		name = "Room";
		description = "A room filled with sunlight";
		contents = new ArrayList<Item>();
		isAccessible = true;
	}
	
	
	/**
	 * Constructor with given name and description.
	 * @param n The name of the location
	 * @param d The description of the location
	 */
	public Location( String n, String d, boolean a )
	{
		name = n;
		description = d;
		isAccessible = a;
		contents = new ArrayList<Item>();
	}
	

	/**
	 * Constructor with given name and description.
	 * @param n The name of the location
	 * @param d The description of the location
	 * @param c The contents of the location
	 */
	public Location( String n, String d, ArrayList<Item> c, boolean a )
	{
		name = n;
		description = d;
		contents = c;
		isAccessible = a;
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
	public String getDescription()
	{
		return description;
	}
	
	
	/**
	 * Returns the accessibility of the location.
	 * @return The accessibility of the location.
	 */
	public boolean isAccessible()
	{
		return isAccessible;
	}
	
	
	/**
	 * Set the accessibility of the location.
	 * @param a The accessibility of the location.
	 */
	public void setAccessiblity( boolean a )
	{
		isAccessible = a;
	}
	
	
	/**
	 * Adds the given Item to the contents list of the location.
	 * @param item The item to add to the location.
	 */
	public void addItem( Item item )
	{
		contents.add( item );
	}
	
	
	/**
	 * Removes the given Item from the contents list of the location.
	 * @param it The item to remove from the location.
	 */
	public void removeItem( Item item )
	{
		for ( int i = 0; i < contents.size(); i++ )
		{
			if ( contents.get(i).getName().toLowerCase().equals( item.getName().toLowerCase() ) )
				contents.remove( contents.get(i) );
		}
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
	public int countItems()
	{
		return contents.size();
	}
	
	
	/**
	 * Add a location to the master Location map.
	 */
	public void addDirection( String direction, Location location )
	{
		map.put( direction, location );
	}
	
	
	/**
	 * Prints the direction from the current location.
	 */
	public void getDirection()
	{
		System.out.println( "From here, you can go:");
		for ( HashMap.Entry<String, Location> e : map.entrySet() )
			System.out.println( "  " + e.getKey() );
	}
	
	
	/**
	 * Returns the new current location.
	 * @return The new current location.
	 */
	public Location move( String direction )
	{
			
		for ( HashMap.Entry<String, Location> e : map.entrySet() ) {
			if ( direction.toLowerCase().equals( e.getKey().toLowerCase() ) )
			{
				Location location = map.get( e.getKey() );
				return location;
			}
		}
		return null;
	}
}
