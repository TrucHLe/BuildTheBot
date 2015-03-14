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
	public static void main( String[] args )
	{
		Location location1 = new Location();
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		Item item4 = new Item();
		Item item5 = new Item();
		Item item6 = new Item();
		
		location1.setDescription( "A room filled with sunlight" );
		
		item1.setShortname( "Muffin" );
		item1.setType( "Food" );
		item1.setDescription( "A muffin full of happiness" );
		
		item2.setShortname( "Socks" );
		item2.setType( "Clothing" );
		item2.setDescription( "A pair of polka dot socks" );
		
		item3.setShortname( "Eyes" );
		item3.setType( "Robot part" );
		item3.setDescription( "A pair of mechanical eyes" );
		
		item4.setShortname( "Arms" );
		item4.setType( "Robot part" );
		item4.setDescription( "A pair of mechanical arms" );
		
		item5.setShortname( "Box" );
		item5.setType( "Robot part" );
		item5.setDescription( "A hollow box that serves as the body" );
		
		item6.setShortname( "Wheels" );
		item6.setType( "Robot part" );
		item6.setDescription( "Two chained wheels" );
		
		location1.addItem( item1 );
		location1.addItem( item2 );
		location1.addItem( item3 );
		location1.addItem( item4 );
		location1.addItem( item5 );
		location1.addItem( item6 );
		
		Scanner in = new Scanner( System.in );
		String command;
		
		while ( true )
		{
			
			System.out.print( "Enter Command > ");			
			command = in.nextLine();
			command = command.toLowerCase();
			
			
			if ( command.trim().equals( "quit" ) )
			{
				break;
			}
			else if ( command.trim().equals( "look" ) )
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

		in.close();

		
	}
}
