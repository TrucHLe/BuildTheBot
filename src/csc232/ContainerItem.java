package csc232;

import java.util.ArrayList;

/**
 * ContainerItem is a subclass of Item.
 * It contains a collection of Items, and provide methods to 
 * add, remove, and query the collection as needed.
 *  
 * @author Truc H. Le
 *
 */
public class ContainerItem extends Item {

	//Serial version number for ContainerItem class
	private static final long serialVersionUID = 2316381534490525532L;
	
	private ArrayList<Item> contents;

	
	/**
	 * The default constructor.
	 */
	public ContainerItem()
	{
		super( "container", false, true );
		contents = new ArrayList<Item>();
	}
	
	
	/**
	 * Constructor with given name.
	 * @param n The name of the container
	 */
	public ContainerItem( String n )
	{
		super( n, false, true );
		contents = new ArrayList<Item>();
	}
	
	
	/**
	 * Constructor with given name, description, and availability.
	 * @param n The name of the container.
	 * @param d The description of the container.
	 * @param a The availability of the container.
	 */
	public ContainerItem( String n, String d, boolean a )
	{
		super( n, d, false, a );
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
		String output = super.getName() + ": " + super.getDescription() + "\n";
		
		for ( Item item : contents )
		{
			if ( item.isAvailable() )
				output = output + "  " + item.getName() + ": " + item.getDescription() + "\n";
		}
		
		return output;
	}
	
	
	
	/**
	 * Returns the description of the inventory container.
	 * @return The description of the container container.
	 */
	public String getInventory()
	{
		String output = super.getName() + ": \n";
		
		for ( Item item : contents )
			output = output + "  " + item.getName() + ": " + item.getDescription() + "\n";
		
		return output;
	}
}
