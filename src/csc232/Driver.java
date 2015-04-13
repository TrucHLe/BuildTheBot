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
		Location location0 = new Location( "Entrance Point", "This is the point to enter or exit spaceship. There is a door in front of you." ); //if try to go back from here, fall off and die
		Location location1 = new Location( "Pool Deck", "A great place to work on your 'tan' and go for a swim. There is a corridor in front of you and a door to your right." );
		Location location2 = new Location( "Trash Compactor", "It may not smell the cleanest but this is the start of sustainability. There is an exit to your left and a heavy metal door in front of you." );
		Location location3 = new Location( "Sleeping Quarter", "Sshhh, people are trying to catch some zzz. There is a door to your right." );
		Location location4 = new Location( "Main Hall", "So much activity here all the time! Here is a great place to socialize with friends. There are doors to your left and in front of you, and there are corridors behind you and to your right." );
		Location location5 = new Location( "Food Court", "Smells great in here! This is the most commonly attended place on the ship. There is a locked door to your right." );
		Location location6 = new Location( "Armoury", "This can either be the safest or the most dangerous place on the ship." );
		Location location7 = new Location( "Lavatory", "Lavatory, no description needed. There is a door behind you and in front of you." );
		Location location8 = new Location( "Storage", "So sad to see all these broken robot parts :( There is a door behind you and a door to your right." );
		Location location9 = new Location( "Engine Room", "This place keeps the ship running in space. There is a locked door in front of you and a door to your left." );
		Location location10 = new Location( "Control Center", "Enter at your own risk. There is a door behind you." );
		
		
		//All containers
		ContainerItem container1 = new ContainerItem( "Drowning Person", "A drowning person." ); //give Horse-shaped Floaties to retrieve Robot Leg
		ContainerItem container3 = new ContainerItem( "NyQuil Puddle", "A giant puddle of NyQuil that is preventing you from crossing."); //put in Towel to retrieve Key
		ContainerItem container4 = new ContainerItem( "Game Chest", "A big wooden game chest."); //holds stuff
		ContainerItem container5a = new ContainerItem( "Vending Machine", "A vending machine that has all of your favorite ice creams." ); //put in Change and Penny to retrieve Ice Cream
		ContainerItem container5b = new ContainerItem( "Table", "A 3D-printed plastic table." ); //fun useless stuff
		ContainerItem container5c = new ContainerItem( "Chairs", "A postmodern lounge chair." ); //fun useless stuff
		ContainerItem container6a = new ContainerItem( "GO-4", "The police robot that combats crime and sometimes delivers coffee to superiors." ); //put in Blue Scarf to blind him
		ContainerItem container6b = new ContainerItem( "Weapons", "An assortment of your favorite lethal weapons." ); //weapons in general
		ContainerItem container7 = new ContainerItem( "Toilet Explosion", "Water keeps splashing out from this thing." ); //put in Robot M-O to clean up
		ContainerItem container9 = new ContainerItem( "Guard", "A chubby guard leaning against the entrance of the Control Center." ); //put in Ice Cream and Chips to expose Robot Leg. No feeding + Attempting to get Robot Leg = Game Over
		ContainerItem container10a = new ContainerItem( "AUTO", "The ruthless autopilot that controls this entire spaceship." ); //put in to Hammer to deactivate and retrieve Mechanical Tube. Putting in Death Laser = Suicide
		ContainerItem container10b = new ContainerItem( "Magnetic Workspace", "A clean shiny surface." ); //put in 8 Robot Parts to assemble Wall-E
		
		
		//All items
		Item location0Item1 = new Item( "Eyes", "A pair of mechanical eyes wabbling in a corner.", "Robot Part" );
		
		Item location1Item1 = new Item( "Floaties", "A horse-shaped floaties Used to rescue someone drowning.", "Miscellaneous" ); //give to Drowning Person in Pool Deck to get Robot Leg
		Item location1Item2 = new Item( "Towel", "A very absorbant towel.", "Miscellaneous" ); //put in NyQuil in Sleeping Quarter to get Key
		Item container1Item1 = new Item( "Robot Leg", "A left track wheel.", "Robot Part" );
		
		Item location2Item1 = new Item( "Microchip", "A seemingly broken microchip.", "Robot Part" );
		Item location2Item2 = new Item( "Chips", "An unopen bag of chips.", "Food" ); //give Guard in Engine Room together with Ice Cream to get Robot Leg
		Item location2Item3 = new Item( "M-O", "A germaphobe robot willing to clean.", "Miscellaneous" ); //put in Toilet Explosion in Lavatory to get Robot Arm
		
		Item container3Item1 = new Item( "Key", "A rusty key.", "Miscellaneous" ); //use to open Armoury
		
		Item container4Item1 = new Item( "Monopoly", "A traditional game of Monopoly.", "Miscellaneous" ); //fun useless stuff
		Item container4Item2 = new Item( "Puzzle", "A one-thousand piece puzzle of Earth.", "Miscellaneous" ); //fun useless stuff
		Item container4Item3 = new Item( "Change", "Pennies and nickles adding up to 72 cents.", "Miscellaneous" ); //put in Vending Machine in Food Court together with Penny to get Ice Cream
		Item container4Item4 = new Item( "Blue Scarf", "A silk turquoise blue scarf.", "Miscellaneous" ); //put in Robot Go-4 in Armoury to enter Armoury
		Item container4Item5 = new Item( "Robot Arm", "A left mechanical arm.", "Robot Part" );

		Item location5Item1 = new Item( "Penny", "A penny.", "Miscellaneous" ); //put in Vending Machine in Food Court together with Change to get Ice Cream
		Item container5aItem1 = new Item( "Ice Cream", "A chocolate chip cookie dough ice cream bar that costs 73 cents.", "Food" ); //give Guard in Engine Room together with Chips to get Robot Leg
		
		Item location6Item1 = new Item( "Hammer", "A rubber mallet.", "Weapon" ); //put in Auto in Control Center to deactivate it and retrieve Mechanical Tube
		Item location6Item2 = new Item( "Death Laser", "A lethal laser gun.", "Weapon" ); //put in Auto in Control Center to suicide

		Item container7Item1 = new Item( "Robot Arm", "A right mechanical arm.", "Robot Part" ); //retrieve this by putting M-O in Toilet Explosion in Lavatory
		
		Item location8Item1 = new Item( "Box 2.5", "A metal box version 2.5", "Robot Part" ); //this is THE box
		Item location8Item2 = new Item( "Box 1.0", "A cardboard box version 1.0", "Miscellaneous" ); //fun useless stuff
		Item location8Item3 = new Item( "Box 3.0", "A cardboard box version 3.0", "Miscellaneous" ); //fun useless stuff
		Item location8Item4 = new Item( "Box 7.1", "A plastic box version 7.1", "Miscellaneous" ); //fun useless stuff
		Item location8Item5 = new Item( "Box 7.5.0", "A plastic box version 7.5.0", "Miscellaneous" ); //fun useless stuff
		Item location8Item6 = new Item( "Box 9", "A styrofoam box version 9", "Miscellaneous" ); //fun useless stuff

		Item container9Item1 = new Item( "Robot Leg", "A right track wheel.", "Robot Part" ); //retrieve this by giving Chips and Ice Cream to Guard in Engine Room

		Item container10aItem1 = new Item( "Mechanical Tube", "A tube that can be made into a robot's neck.", "Robot Part" ); //retrieve this by putting Hammer in Auto in Control Center

				
		
		//Add some items to containers
		container1.addItem( container1Item1 );
		container3.addItem( container3Item1 );
		container4.addItem( container4Item1 );
		container4.addItem( container4Item2 );
		container4.addItem( container4Item3 );
		container4.addItem( container4Item4 );
		container4.addItem( container4Item5 );
		container5a.addItem( container5aItem1 );
		container7.addItem( container7Item1 );
		container9.addItem( container9Item1 );
		container10a.addItem( container10aItem1 );
		
		
		//Add containers to locations
		location1.addItem( container1 );
		location3.addItem( container3 );
		location4.addItem( container4 );
		location5.addItem( container5a );
		location5.addItem( container5b );
		location5.addItem( container5c );
		location6.addItem( container6a );
		location6.addItem( container6b );
		location7.addItem( container7 );
		location9.addItem( container9 );
		location10.addItem( container10a );
		location10.addItem( container10b );
		
		
		//Add some items to locations
		location0.addItem( location0Item1 );
		location1.addItem( location1Item1 );
		location1.addItem( location1Item2 );
		location2.addItem( location2Item1 );
		location2.addItem( location2Item2 );
		location2.addItem( location2Item3 );
		location5.addItem( location5Item1 );
		location6.addItem( location6Item1 );
		location6.addItem( location6Item2 );
		location8.addItem( location8Item1 );
		location8.addItem( location8Item2 );
		location8.addItem( location8Item3 );
		location8.addItem( location8Item4 );
		location8.addItem( location8Item5 );
		location8.addItem( location8Item6 );
		
		
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
				System.out.println( "You see: " );
				for ( int i = 0; i < currentLocation.countItems(); i++ )
					System.out.println( "  " + currentLocation.retrieveItem( i ) );
				currentLocation.getDirection();
			}
			
			
			
			else if ( 1 < wordsCount && wordsCount < 4 && words[0].equals( "examine" ) )
			{
				String itemName = "";
				
				if (wordsCount == 2)
					itemName = words[1];
				else if (wordsCount == 3)
					itemName = words[1] + " " + words[2];
				
				Item item = currentLocation.retrieveItem( itemName );
				
				if ( item != null )
					System.out.println( item.getDescription() );
				else
					System.out.println( "Object not found." );
			}
			
			
			
			else if ( 1 < wordsCount && wordsCount < 4 && words[0].equals( "take" ) )
			{
				String itemName = "";
				
				if (wordsCount == 2)
					itemName = words[1];
				else if (wordsCount == 3)
					itemName = words[1] + " " + words[2];
				
				Item item = currentLocation.retrieveItem( itemName );
					
				if ( item != null )
				{
					currentLocation.removeItem( item );
					inventory.addItem( item );
					System.out.println( "Took " + item.getName() + " from " + currentLocation.getName() + "." );
				}
				else
					System.out.println( "Object not found." );
			}

		
			
			else if ( 3 < wordsCount && wordsCount < 7 && words[0].equals( "take" ) && command.contains( "from" ) )
			{
				String itemName = "";
				String containerName = "";

				if ( words[2].equals( "from" ))
				{
					itemName = words[1];
					if ( wordsCount == 4 )
						containerName = words[3];
					else if ( wordsCount == 5 )
						containerName = words[3] + " " + words[4];
				}
				else if ( words[3].equals( "from" ))
				{
					itemName = words[1] + " " + words[2];
					if ( wordsCount == 5 )
						containerName = words[4];
					else if ( wordsCount == 6 )
						containerName = words[4] + " " + words[5];
				}
				
				ContainerItem container = ( ContainerItem ) currentLocation.retrieveItem( containerName );
				
				if ( container != null )
				{
					Item item = container.retrieveItem( itemName );
					if ( item != null )
					{		
						container.removeItem( item );
						inventory.addItem( item );
						System.out.println( "Took " + item.getName() + " from " + container.getName() + "." );
					}
					else
						System.out.println( "Object not found." );
				}
				else
					System.out.println( "Container not found." );
			}	

			
			
			else if ( 1 < wordsCount && wordsCount < 4 && words[0].equals( "put" ) )
			{
				String itemName = "";
				
				if (wordsCount == 2)
					itemName = words[1];
				else if (wordsCount == 3)
					itemName = words[1] + " " + words[2];
				
				Item item = inventory.retrieveItem( itemName );
					
				if ( item != null )
				{
					inventory.removeItem( item );
					currentLocation.addItem( item );
					System.out.println( "Put " + item.getName() + " in " + currentLocation.getName() + "." );
				}
				else
					System.out.println( "Object not found." );
			}
		
			
			
			else if ( 3 < wordsCount && wordsCount < 7 && words[0].equals( "put" ) && command.contains( "in" ) )
			{
				String itemName = "";
				String containerName = "";

				if ( words[2].equals( "in" ))
				{
					itemName = words[1];
					if ( wordsCount == 4 )
						containerName = words[3];
					else if ( wordsCount == 5 )
						containerName = words[3] + " " + words[4];
				}
				else if ( words[3].equals( "in" ))
				{
					itemName = words[1] + " " + words[2];
					if ( wordsCount == 5 )
						containerName = words[4];
					else if ( wordsCount == 6 )
						containerName = words[4] + " " + words[5];
				}
				
				ContainerItem container = ( ContainerItem ) currentLocation.retrieveItem( containerName );
				
				
				if ( container != null )
				{
					Item item = inventory.retrieveItem( itemName );
					if ( item != null )
					{		
						inventory.removeItem( item );
						container.addItem( item );
						System.out.println( "Put " + item.getName() + " in " + container.getName() + "." );
					}
					else
						System.out.println( "Object not found." );
				}
				else
					System.out.println( "Container not found." );
			}
			
			
			
			else if ( 3 < wordsCount && wordsCount < 7 && words[0].equals( "give" ) && command.contains( "to" ))
			{
				String itemName = "";
				String containerName = "";

				if ( words[2].equals( "to" ))
				{
					itemName = words[1];
					if ( wordsCount == 4 )
						containerName = words[3];
					else if ( wordsCount == 5 )
						containerName = words[3] + " " + words[4];
				}
				else if ( words[3].equals( "to" ))
				{
					itemName = words[1] + " " + words[2];
					if ( wordsCount == 5 )
						containerName = words[4];
					else if ( wordsCount == 6 )
						containerName = words[4] + " " + words[5];
				}
				
				ContainerItem container = ( ContainerItem ) currentLocation.retrieveItem( containerName );
				
				
				if ( container != null )
				{
					Item item = inventory.retrieveItem( itemName );
					if ( item != null )
					{		
						inventory.removeItem( item );
						container.addItem( item );
						System.out.println( "Gave " + item.getName() + " to " + container.getName() + "." );
					}
					else
						System.out.println( "Object not found." );
				}
				else
					System.out.println( "Receiver not found." );
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
