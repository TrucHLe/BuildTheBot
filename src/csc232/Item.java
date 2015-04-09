package csc232;

/**
 * This class represents an item in our adventure game.
 * 
 * The Item class will contain the following data fields:
 *   String name : represents the "short" name for the item.
 *   String description : a description of the item.
 *   String type : represents the "type" of the item.
 * 
 * @author Truc Le
 *
 */

public class Item
{
	private String name;
	private String description;
	private String type;

	/**
	 * The default constructor, creates a default item.
	 */
	public Item()
	{
		name = "thingy";
		description = "This is a thingy.";
		type = "thing";
	}
	
	
	/**
	 * Constructor with given name and description.
	 * @param n The name of the item
	 */
	public Item( String n )
	{
		name = n;
	}
	
	
	/**
	 * Constructor with the item completely described.
	 * 
	 * @param n The name of the item.
	 * @param d The description of the item.
	 * @param t The type of the item.
	 */
	public Item( String n, String d, String t )
	{
		name = n;
		description = d;
		type = t;
	}
	
	
	/**
	 * Set the name of the object.
	 * @param n The new name of the object.
	 */
	public void setName( String n )
	{
		name = n;
	}
	
	
	/**
	 * Set the description of the object.
	 * @param n The new description of the object.
	 */
	public void setDescription( String d )
	{
		description = d;
	}
	
	
	/**
	 * Set the type of the object.
	 * @param n The new type of the object.
	 */
	public void setType( String t )
	{
		type = t;
	}
	
	
	/**
	 * Returns the name of the object.
	 * @return The name of the object.
	 */
	public String getName( )
	{
		return name;
	}
	
	
	/**
	 * Returns the description of the object.
	 * @return The description of the object.
	 */
	public String getDescription( )
	{
		return description;
	}
	
	
	/**
	 * Returns the type of the object.
	 * @return The type of the object.
	 */
	public String getType( )
	{
		return type;
	}
	
	
	/**
	 * Returns a String representation of the Item.
	 * @return A String representation of the Item.
	 */
	public String toString( )
	{
		return name;	
	}
}