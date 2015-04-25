package csc232;

import java.io.Serializable;

/**
 * This class represents an item in our adventure game.
 * 
 * The Item class will contain the following data fields:
 *   String name : represents the "short" name for the item.
 *   String description : a description of the item.
 *   String type : represents the "type" of the item.
 * 
 * @author Truc H. Le
 *
 */

public class Item implements Serializable
{
	
	//Serial version number for Item class
	private static final long serialVersionUID = 2142178391537993256L;
	
	private String name;
	private String description;
	private String type;
	private boolean isTakable;
	private boolean isAvailable;

	/**
	 * The default constructor, creates a default item.
	 */
	public Item()
	{
		name = "thingy";
		description = "This is a thingy.";
		type = "thing";
		isTakable = true;
		isAvailable = true;
	}
	
	
	/**
	 * Constructor with given name.
	 * @param n The name of the item
	 * @param tk The takability of the item.
	 * @param a The availability of the item.
	 */
	public Item( String n, boolean tk, boolean a )
	{
		name = n;
		isTakable = tk;
		isAvailable = a;
	}
	
	
	/**
	 * Constructor with given name and description.
	 * 
	 * @param n The name of the item.
	 * @param d The description of the item.
	 * @param tk The takability of the item.
	 * @param a The availability of the item.
	 */
	public Item( String n, String d, boolean tk, boolean a )
	{
		name = n;
		description = d;
		isTakable = tk;
		isAvailable = a;
	}
	
	
	/**
	 * Constructor with the item completely described.
	 * 
	 * @param n The name of the item.
	 * @param d The description of the item.
	 * @param t The type of the item.
	 * @param tk The takability of the item.
	 * @param a The availability of the item.
	 */
	public Item( String n, String d, String t, boolean tk, boolean a )
	{
		name = n;
		description = d;
		type = t;
		isTakable = tk;
		isAvailable = a;
	}
	
	
	/**
	 * Set the name of the item.
	 * @param n The new name of the item.
	 */
	public void setName( String n )
	{
		name = n;
	}
	
	
	/**
	 * Set the description of the item.
	 * @param n The new description of the item.
	 */
	public void setDescription( String d )
	{
		description = d;
	}
	
	
	/**
	 * Set the type of the item.
	 * @param n The new type of the item.
	 */
	public void setType( String t )
	{
		type = t;
	}
	
	
	/**
	 * Set the takability of the item.
	 * @param tk The takability of the item.
	 */
	public void setTakability( boolean tk )
	{
		isTakable = tk;
	}
	
	/**
	 * Set the availability of the item.
	 * @param a The availability of the item.
	 */
	public void setAvailability( boolean a )
	{
		isAvailable = a;
	}
	
	
	/**
	 * Set the takability and the availability of the item.
	 * @param tk The takability of the item.
	 * @param a The availability of the item.
	 */
	public void setTakabilityAndAvailability( boolean tk, boolean a )
	{
		isTakable = tk;
		isAvailable = a;
	}
	
	
	/**
	 * Returns the name of the item.
	 * @return The name of the item.
	 */
	public String getName( )
	{
		return name;
	}
	
	
	/**
	 * Returns the description of the item.
	 * @return The description of the item.
	 */
	public String getDescription( )
	{
		return description;
	}
	
	
	/**
	 * Returns the type of the item.
	 * @return The type of the item.
	 */
	public String getType( )
	{
		return type;
	}
	
	
	/**
	 * Returns whether the item is takable.
	 * @return The takability of the Item.
	 */
	public boolean isTakable()
	{
		return isTakable;
	}
	
	
	/**
	 * Returns whether the item is available.
	 * @return The availability of the item.
	 */
	public boolean isAvailable()
	{
		return isAvailable;
	}
	
	
	
	/**
	 * Returns a string representation of the item.
	 * @return A string representation of the item.
	 */
	public String toString( )
	{
		return name;	
	}
}