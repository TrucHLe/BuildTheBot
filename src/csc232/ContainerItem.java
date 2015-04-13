package csc232;

import java.util.ArrayList;

/**
 * ContainerItem is a subclass of Item.
 * It contains a collection of Items, and provide methods to 
 * add, remove, and query the collection as needed.
 *  
 * @author Truc Le
 *
 */
public class ContainerItem extends Item {

	private ArrayList<Item> contents;

	
	/**
	 * The default constructor.
	 */
	public ContainerItem()
	{
		super( "container" );
		contents = new ArrayList<Item>();
	}
	
	
	/**
	 * Constructor with given name.
	 * @param n The name of the container
	 */
	public ContainerItem( String n )
	{
		super( n );
		contents = new ArrayList<Item>();
	}
	
	
	/**
	 * Constructor with given name and container.
	 * @param n The name of the container
	 * @param c The contents of the container
	 */
	public ContainerItem( String n, ArrayList<Item> c )
	{
		super( n );
		contents = c;
	}
	
	
	/**
	 * Constructor with given name and description.
	 * @param n The name of the container
	 */
	public ContainerItem( String n, String d )
	{
		super( n, d );
		contents = new ArrayList<Item>();
	}
	
	
	/**
	 * Adds the given Item to the contents list of the container.
	 * @param it The item to add to the container.
	 */
	public void addItem( Item item )
	{
		contents.add( item );
	}
	
	
	/**
	 * Removes the given Item from the contents list of the container.
	 * @param it The item to remove from the container.
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
	 * Returns the item with the given name in the container.
	 * @param name The name of the item to find.
	 * @return The item with the given name, or null if that item doesn't exist.
	 */
	public Item retrieveItem( String name )
	{
		for ( Item item : contents )
		{
			if ( item.getName().toLowerCase().equals( name ) )
				return item;
		}
		return null;
	}
	
	
	/**
	 * Returns the item in position i from the contents list of the container.
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
	 * Returns the number of items found in the container.
	 * @return The number of items found in the container.
	 */
	public int countItems()
	{
		return contents.size();
	}
	
	
	/**
	 * Returns the description of the container.
	 * @return The description of the container.
	 */
	public String getDescription()
	{
		String output = super.getName() + ": " + super.getDescription() + "\n" + "You see: \n";
		
		for ( Item item : contents )
			output = output + "  " + item.getName() + ": " + item.getDescription() + "\n";
		
		return output;
	}
	
	/**
	 * Returns the name of the container.
	 * @return The name of the container.
	 */
	public String getName( )
	{
		return super.getName();
	}
}
