/**
 * This class manages the fields of each Item object.
 * This class' methods set and return the fields' values.
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