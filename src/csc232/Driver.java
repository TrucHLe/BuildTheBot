package csc232;

/**
 * The Driver class creates a Location object and add two Item objects to it.
 * 
 * It then creates an infinite loop that prompts the user to enter a command,
 * reads a line from the user, and processes the command:
 * - If the command is â€œquitâ€�, the loop exits and the program ends.
 * - If the command is â€œlookâ€�, print out the description of the location
 * and the short names of the items found there.
 * - If the command is â€œexamine nameâ€�, get the item with the given name
 * from the location and print its description
 * - If the command is something else, print "I donâ€™t know how to do that."
 * 
 * @author Truc Le
 * 
 */

import java.util.Scanner;

public class Driver
{
	private Location location1;
	private Item item1;
	private Item item2;
	private Item item3;
	private Item item4;
	
	
	
	public Driver( ) 
	{
		location1 = new Location( "Bedroom", "A room filled with sunlight" );
		item1 = new Item( "Eyes", "A pair of mechanical eyes", "Robot Part" );
		item2 = new Item( "Arms", "A pair of mechanical arms", "Robot Part" );
		item3 = new Item( "Box", "A hollow box that serves as the body", "Robot Part" );
		item4 = new Item( "Wheels", "Two chained wheels", "Robot Part" );

		location1.addItem( item1 );
		location1.addItem( item2 );
		location1.addItem( item3 );
		location1.addItem( item4 );
		
	}
	
	
	
	public static void main( String[] args )
	{
		Driver program = new Driver( );
		
		program.run( );
	}
	
	
	
	public void run( ) 
	{
		Scanner in = new Scanner( System.in );
		String command = null;
		
		while ( true )
		{
			
			System.out.print( "Enter Command > ");			
			command = in.nextLine( ).trim( ).toLowerCase( );
			

			if ( command.equals( "quit" ) )
			{
				System.out.println( "Quitting..." );
				break;
			}
			else if ( command.equals( "look" ) )
			{
				System.out.println( location1.getName( ) );
				System.out.println( location1.getDescription( ) );
				System.out.println( "Items here: " );
				
				for (int i = 0; i < location1.countItems(); i ++ )
					System.out.println( location1.retrieveItem( i ) );
			}
			else if ( command.startsWith( "examine " ) )
			{
				String itemName = command.substring( 8 );
				Item item = location1.retrieveItem( itemName );
				
				if ( item != null )
					System.out.println( item.getDescription( ) );
				else
					System.out.println( "Object not found." );
			}
			else
			{
				System.out.println( "Unknown command." );
			}	
			
			System.out.println( );
			
		}

		in.close();

		
	}
}
