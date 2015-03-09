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
	private ArrayList<Item> collectionOfItems = new ArrayList<Item>();
	
	
	public Location()
	{
		
	}
	
	
	public void setName( String newName )
	{
		name = newName;
	}
	
	
	public void setDescription( String newDescription )
	{
		description = newDescription;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	
	public String getDescription()
	{
		return description;
	}
	
	
	public void addItem( Item newItem )
	{
		collectionOfItems.add( newItem );
	}
	
	
	public Item retrieveItemFromName( String shortname )
	{
		for( int i = 0; i < collectionOfItems.size(); i++ )
		{
			if ( collectionOfItems.get(i).getShortname().toLowerCase().equals( shortname.toLowerCase() ) )
				return collectionOfItems.get(i);
		}
		
		return null;
	}
	
	
	public Item retrieveItemFromIndex( int index )
	{
		return collectionOfItems.get(index);
	}
	
	
	public int numberOfItems()
	{
		return collectionOfItems.size();
	}

}
