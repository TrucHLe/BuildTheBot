package csc232;

/**
 * The Item class manages the fields of each Item object.
 * It has methods that can set and return each item's shortname, type, and description.
 * 
 * @author Truc Le
 *
 */

public class Item
{
	private String shortname;
	private String type;
	private String description;
	
	
	public Item()
	{
		
	}
	
	
	public void setShortname( String newShortname )
	{
		shortname = newShortname;
	}
	
	
	public void setType( String newType )
	{
		type = newType;
	}
	
	
	public void setDescription( String newDescription )
	{
		description = newDescription;
	}
	
	
	public String getShortname()
	{
		return shortname;
	}
	
	
	public String getDescription()
	{
		return description;
	}
	
	
	public String toString()
	{
		String output = new String();
		
		output = output + "Item:" + "\n";
		output = output + "   " + "shortname: " + shortname + "\n";
		output = output + "   " + "type: " + type + "\n";
		output = output + "   " + "description: " + description;
		
		return output;
	}
}