package csc232;

/**
 * The Driver class creates a Location object and add two Item objects to it.
 * 
 * It then creates an infinite loop that prompts the user to enter a command,
 * reads a line from the user, and processes the command:
 * - If the command is “quit”, the loop exits and the program ends.
 * - If the command is “look”, print out the description of the location
 * and the short names of the items found there.
 * - If the command is “examine name”, get the item with the given name
 * from the location and print its description
 * - If the command is something else, print "I don’t know how to do that."
 * 
 * @author Truc Le
 * 
 */

import java.util.Scanner;

public class Driver
{
	public static void main( String[] args )
	{
		Location location1 = new Location();
		Item item1 = new Item();
		Item item2 = new Item();
		
		location1.setDescription( "A room filled with sunlight" );
		
		item1.setShortname( "Muffin" );
		item1.setType( "Food" );
		item1.setDescription( "A muffin full of happiness" );
		
		item2.setShortname( "Socks" );
		item2.setType( "Clothing" );
		item2.setDescription( "A pair of polka dot socks" );
		
		location1.addItem( item1 );
		location1.addItem( item2 );

		
		while ( true )
		{
			Scanner in = new Scanner( System.in );
			String command;
			
			System.out.print( "Enter Command > ");			
			command = in.nextLine();
			command = command.toLowerCase();
			
			
			if ( command.equals( "quit" ) )
			{
				in.close();
				break;
			}
			else if ( command.equals( "look" ) )
			{
				System.out.println( location1.getDescription() );
				for (int i = 0; i < location1.numberOfItems(); i ++ )
					System.out.println( location1.retrieveItemFromIndex( i ).getDescription() );
			}
			else if ( command.startsWith( "examine " ) )
			{
				String thing = command.substring( 8 );
				if ( location1.retrieveItemFromName( thing ) != null )
					System.out.println( location1.retrieveItemFromName( thing ).getDescription() );
				else
					System.out.println( "I don't know how to do that" );
			}
			else
			{
				System.out.println( "I don't know how to do that" );
			}	
		}
		
	}
}
