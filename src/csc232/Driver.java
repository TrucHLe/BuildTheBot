package csc232;

/**
 *  This class runs the main program.
 * 
 * @author Truc Le
 * 
 */

import java.util.Scanner;

public class Driver 
{
	private Location currentLocation;
	private ContainerItem inventory;

	
	public Driver( )
	{	
		//All locations
		Location location0 = new Location( "Entrance Point", "This is the point to enter or exit spaceship. There is a door in front of you." );
		Location location1 = new Location( "Pool Deck", "A great place to work on your 'tan' and go for a swim. There is a corridor in front of you and a door to your right." );
		Location location2 = new Location( "Trash Compactor", "It may not smell the cleanest but this is the start of sustainability. There is an exit to your left and a heavy metal door in front of you." );
		Location location3 = new Location( "Sleeping Quarter", "Sshhh, people are trying to catch some zzz. There is a door to your right." );
		Location location4 = new Location( "Main Hall", "So much activity here all the time! Here is a great place to socialize with friends. There are doors to your left and in front of you, and there are corridors behind you and to your right." );
		Location location5 = new Location( "Food Court", "Smells great in here! This is the most commonly attended place on the ship. There is a locked door to your right." );
		Location location6 = new Location( "Armoury", "This can either be the safest or the most dangerous place on the ship. The door to your left locked when you came in." );
		Location location7 = new Location( "Laboratories", "Laboratories, no description needed. There is a door behind you and in front of you." );
		Location location8 = new Location( "Storage", "So sad to see all these broken robot parts :( There is a door behind you and a door to your right." );
		Location location9 = new Location( "Engine Room", "This place keeps the ship running in space. There is a locked door in front of you and a door to your left." );
		Location location10 = new Location( "Control Center", "Enter at your own risk. There is a door behind you." );
		
		
		//All items escape pods
		Item item0a = new Item( "Eyes", "A pair of mechanical eyes.", "Robot Part" );
		Item item0b = new Item( "Arms", "A pair of mechanical arms.", "Robot Part" );
		Item item0c = new Item( "Box", "A hollow box that serves as the body.", "Robot Part" );
		Item item0d = new Item( "Wheels", "Two chained wheels.", "Robot Part" );
		Item item1a = new Item( "Item1a", "Test description please ignore.", "Test type please ignore" );
		Item item1b = new Item( "Item1b", "Test description please ignore.", "Test type please ignore" );
		Item item2a = new Item( "Item2a", "Test description please ignore.", "Test type please ignore" );
		Item item2b = new Item( "Item2b", "Test description please ignore.", "Test type please ignore" );
		Item item3a = new Item( "Item3a", "Test description please ignore.", "Test type please ignore" );
		Item item3b = new Item( "Item3b", "Test description please ignore.", "Test type please ignore" );
		Item item4a = new Item( "Item4a", "Test description please ignore.", "Test type please ignore" );
		Item item4b = new Item( "Item4b", "Test description please ignore.", "Test type please ignore" );
		Item item5a = new Item( "Item5a", "Test description please ignore.", "Test type please ignore" );
		Item item5b = new Item( "Item5b", "Test description please ignore.", "Test type please ignore" );
		Item item6a = new Item( "Item6a", "Test description please ignore.", "Test type please ignore" );
		Item item6b = new Item( "Item6b", "Test description please ignore.", "Test type please ignore" );
		Item item7a = new Item( "Item7a", "Test description please ignore.", "Test type please ignore" );
		Item item7b = new Item( "Item7b", "Test description please ignore.", "Test type please ignore" );
		Item item8a = new Item( "Item8a", "Test description please ignore.", "Test type please ignore" );
		Item item8b = new Item( "Item8b", "Test description please ignore.", "Test type please ignore" );
		Item item9a = new Item( "Item9a", "Test description please ignore.", "Test type please ignore" );
		Item item9b = new Item( "Item9b", "Test description please ignore.", "Test type please ignore" );
		Item item10a = new Item( "Item10a", "Test description please ignore.", "Test type please ignore" );
		Item item10b = new Item( "Item10b", "Test description please ignore.", "Test type please ignore" );

				
		//All containers
		ContainerItem container0a = new ContainerItem( "Closet" );
		ContainerItem container0b = new ContainerItem( "Cabinet" );
		ContainerItem container1 = new ContainerItem( "Container1" );
		ContainerItem container2 = new ContainerItem( "Container2" );
		ContainerItem container3 = new ContainerItem( "Container3" );
		ContainerItem container4 = new ContainerItem( "Container4" );
		ContainerItem container5 = new ContainerItem( "Container5" );
		ContainerItem container6 = new ContainerItem( "Container6" );
		ContainerItem container7 = new ContainerItem( "Container7" );
		ContainerItem container8 = new ContainerItem( "Container8" );
		ContainerItem container9 = new ContainerItem( "Container9" );
		ContainerItem container10 = new ContainerItem( "Container10" );	
		
		
	
		//Add some items to containers
		container0a.addItem( item0c );
		container0b.addItem( item0d );
		container1.addItem( item1b );
		container2.addItem( item2b );
		container3.addItem( item3b );
		container4.addItem( item4b );
		container5.addItem( item5b );
		container6.addItem( item6b );
		container7.addItem( item7b );
		container8.addItem( item8b );
		container9.addItem( item9b );
		container10.addItem( item10b );
		
		
		//Add containers to locations
		location0.addItem( container0a );
		location0.addItem( container0b );
		location1.addItem( container1 );
		location2.addItem( container2 );
		location3.addItem( container3 );
		location4.addItem( container4 );
		location5.addItem( container5 );
		location6.addItem( container6 );
		location7.addItem( container7 );
		location8.addItem( container8 );
		location9.addItem( container9 );
		location10.addItem( container10 );
		
		
		//Add some items to locations
		location0.addItem( item0a );
		location0.addItem( item0b );
		location1.addItem( item1a );
		location2.addItem( item2a );
		location3.addItem( item3a );
		location4.addItem( item4a );
		location5.addItem( item5a );
		location6.addItem( item6a );
		location7.addItem( item7a );
		location8.addItem( item8a );
		location9.addItem( item9a );
		location10.addItem( item10a );		
		
		
		//Add all locations to Map
		location0.addDirection( "Front", location1 );
		location1.addDirection( "Front", location4 );
		location1.addDirection( "Back", location0 );
		location1.addDirection( "Right", location2 );
		location2.addDirection( "Front", location5 );
		location2.addDirection( "Left", location1);
		location3.addDirection( "Right", location4 );
		location4.addDirection( "Front", location7 );
		location4.addDirection( "Back", location1 );
		location4.addDirection( "Left", location3 );
		location4.addDirection( "Right", location5 );
		location5.addDirection( "Back", location2 );
		location5.addDirection( "Left", location4 );
		location5.addDirection( "Right", location6 );
		location6.addDirection( "Left", location5 );
		location7.addDirection( "Front", location8 );
		location7.addDirection( "Back", location4 );
		location8.addDirection( "Back", location7 );
		location8.addDirection( "Right", location9 );
		location9.addDirection( "Front", location10 );
		location9.addDirection( "Left", location8 );
		location10.addDirection( "Back", location9 );
		
		
		
		
		
		
		//The bones
		currentLocation = location0;
		inventory = new ContainerItem( "Inventory" );

	}

	
	public static void main( String[] args )
	{
		Driver program = new Driver( );
		
		program.run();
	}

	
	public void run( )
	{
		Scanner in = new Scanner( System.in );
		String command = null;
		String words[] = null;
		int wordsCount = 0;
		
		while ( true )
		{
			System.out.print( "[" + currentLocation.getName() + "] > " );
			command = in.nextLine().trim().toLowerCase();
			words = command.split( " " );
			wordsCount = words.length;
			
			
			
			if ( wordsCount == 1 && words[0].equals( "quit" ) )
			{
				System.out.println( "Quitting..." );
				break;
			}
			
			

			else if ( wordsCount == 1 && words[0].equals( "look" ) )
			{
				System.out.println( currentLocation.getName( ) );
				System.out.println( currentLocation.getDescription( ) );
				System.out.println( "Items here: " );
				for ( int i = 0; i < currentLocation.countItems(); i++ )
					System.out.println( "  " + currentLocation.retrieveItem( i ) );
				currentLocation.getDirection();
			}
			
			
			
			else if ( wordsCount == 2 && words[0].equals( "examine" ) )
			{
				String itemName = words[1];
				Item item = currentLocation.retrieveItem( itemName );
				
				if ( item != null )
					System.out.println( item.getDescription() );
				else
					System.out.println( "Object not found." );
			}
			
			
			
			else if ( wordsCount == 2 && words[0].equals( "take" ) )
			{
				String itemName = words[1];
				Item item = currentLocation.retrieveItem( itemName );
					
				if ( item != null )
				{
					currentLocation.removeItem( item );
					inventory.addItem( item );
					System.out.println( "Took " + itemName + " from " + currentLocation.getName() + "." );
				}
				else
					System.out.println( "Object not found." );
			}

		
			
			else if ( wordsCount == 4 && words[0].equals( "take" ) )
			{
				String itemName = words[1];
				String containerName = words[3];
				ContainerItem container = ( ContainerItem ) currentLocation.retrieveItem( containerName );
				
				if ( container != null )
				{
					Item item = container.retrieveItem( itemName );
					if ( item != null )
					{		
						container.removeItem( item );
						inventory.addItem( item );
						System.out.println( "Took " + itemName + " from " + containerName + "." );
					}
					else
						System.out.println( "Object not found." );
				}
				else
					System.out.println( "Container not found." );
			}	

			
			
			else if ( wordsCount == 2 && words[0].equals( "put" ) )
			{
				String itemName = words[1];
				Item item = inventory.retrieveItem( itemName );
					
				if ( item != null )
				{
					inventory.removeItem( item );
					currentLocation.addItem( item );
					System.out.println( "Put " + itemName + " in " + currentLocation.getName() + "." );
				}
				else
					System.out.println( "Object not found." );
			}
		
			
			
			else if ( wordsCount == 4 && words[0].equals( "put" ) )
			{
				String itemName = words[1];
				String containerName = words[3];
				ContainerItem container = ( ContainerItem ) currentLocation.retrieveItem( containerName );
				
				
				if ( container != null )
				{
					Item item = inventory.retrieveItem( itemName );
					if ( item != null )
					{		
						inventory.removeItem( item );
						container.addItem( item );
						System.out.println( "Put " + itemName + " in " + containerName + "." );
					}
					else
						System.out.println( "Object not found." );
				}
				else
					System.out.println( "Container not found." );
			}

			
			
			else if ( wordsCount == 1 && words[0].equals( "inventory" ) )
			{
				System.out.println( inventory.getDescription() );
			}
			
			
			
			else if ( wordsCount == 2 && words[0].equals( "go" ) )
			{
				String direction = words[1];
				if ( currentLocation.move( direction ) != null )
				{
					currentLocation = currentLocation.move( direction );
					System.out.println( "Moving..." );
				}
				else
					System.out.println( "Can't go that way." );
			}
			
			
			
			else if ( wordsCount == 1 && words[0].equals( "help" ) )
			{
				System.out.println( "  \"Quit\" to quit the game." );
				System.out.println( "  \"Look\" to check out your current location." );
				System.out.println( "  \"Examine 'object'\" to learn more about an object.");
				System.out.println( "  \"Take 'object'\" to take an object from the current location and put it in your inventory." );
				System.out.println( "  \"Take 'object' from 'container'\" to take an object from the specified container and put it in your inventory." );
				System.out.println( "  \"Put 'object'\" to take an object from your inventory and put it in the current location." );
				System.out.println( "  \"Put 'object' in 'container'\" to take an object from your inventory and put it in the specified container." );
				System.out.println( "  \"Go 'direction'\" to move around." );
				System.out.println();
				currentLocation.getDirection();
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
