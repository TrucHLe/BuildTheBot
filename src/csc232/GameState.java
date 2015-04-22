package csc232;

public class GameState {
	
	private Location currentLocation;
	private ContainerItem inventory;
	private int moves;
	
	//All locations
	private Location location0 = new Location( "Entrance Point", "This is the point to enter or exit spaceship. There is a door in front of you. The spaceship's exit is behind you.", true ); //if try to go back from here, fall off and die
	private Location location1 = new Location( "Pool Deck", "A great place to work on your 'tan' and go for a swim. There are corridors in front of and behind you. There is also a door to your right.", true );
	private Location location2 = new Location( "Trash Compactor", "It may not smell the cleanest but this is the start of sustainability. There is an exit to your left and a heavy metal door in front of you.", true );
	private Location location3 = new Location( "Sleeping Quarter", "Sshhh, people are trying to catch some zzz. There is a door to your right.", true );
	private Location location4 = new Location( "Main Hall", "So much activity here all the time! Here is a great place to socialize with friends. There are doors to your left and in front of you, and there are corridors behind you and to your right.", true );
	private Location location5 = new Location( "Food Court", "Smells great in here! This is the most commonly attended place on the ship. There is a door to your left, a locked door to your right, and a heavy metal door behind you.", true );
	private Location location6 = new Location( "Armoury", "This can either be the safest or the most dangerous place on the ship! GO-4, the police robot spotted you coming in without permission and he started chasing you! There is a door to your left.", false );
	private Location location7 = new Location( "Lavatory", "Lavatory, no description needed. There is a door behind you and in front of you.", true );
	private Location location8 = new Location( "Storage", "So sad to see all these broken robot parts :( There is a door behind you and a door to your right.", true );
	private Location location9 = new Location( "Engine Room", "This place keeps the ship running in space. There is a door in front of you and a door to your left.", true );
	private Location location10 = new Location( "Control Center", "Enter at your own risk. There is a door behind you.", false );
			
			
	//All containers
	private ContainerItem container1 = new ContainerItem( "Drowning Person", "A drowning person.", true );
	private ContainerItem container3 = new ContainerItem( "NyQuil Puddle", "A giant puddle of NyQuil that is preventing you from crossing.", true );
	private ContainerItem container4 = new ContainerItem( "Game Chest", "A big wooden game chest.", true );
	private ContainerItem container5a = new ContainerItem( "Vending Machine", "A vending machine that has all of your favorite ice creams.", true );
	private ContainerItem container5b = new ContainerItem( "Table", "A 3D-printed plastic table.", true );
	private ContainerItem container5c = new ContainerItem( "Chairs", "A postmodern lounge chair.", true );
	private ContainerItem container5d = new ContainerItem( "Locked Door", "A locked bulletproof door.", true );
	private ContainerItem container6a = new ContainerItem( "GO-4", "The police robot that combats crime and sometimes delivers coffee to superiors. He keeps chasing you, preventing you from further entering the Armoury.", true );
	private ContainerItem container6b = new ContainerItem( "Weapons", "An assortment of your favorite lethal weapons.", false );
	private ContainerItem container7 = new ContainerItem( "Toilet Explosion", "Water keeps splashing out from this thing!", true );
	private ContainerItem container9 = new ContainerItem( "Guard", "A chubby guard leaning against the entrance of the Control Center. He is resting his foot on an object that looks like a robot leg. The Guard's stomach growls.", true );
	private ContainerItem container10a = new ContainerItem( "AUTO", "The ruthless autopilot that controls this entire spaceship. He tries to attack you!", true );
	private ContainerItem container10b = new ContainerItem( "Magnetic Workspace", "A clean shiny surface.", false );
			
			
	//All items
	private Item location0Item1 = new Item( "Eyes", "A pair of mechanical eyes wabbling in a corner.", "Robot Part", true, true );
			
	private Item location1Item1 = new Item( "Floaties", "A horse-shaped floaties Used to rescue someone drowning.", "Miscellaneous", true, true );
	private Item location1Item2 = new Item( "Towel", "A very absorbant towel.", "Miscellaneous", true, true );
	private Item location1Item3 = new Item( "Robot Leg", "A left track wheel.", "Robot Part", false, false );
			
	private Item location2Item1 = new Item( "Microchip", "A seemingly broken microchip.", "Robot Part", true, true );
	private Item location2Item2 = new Item( "Chips", "An unopen bag of chips.", "Food", true, true );
	private Item location2Item3 = new Item( "M-O", "A germaphobe robot willing to clean.", "Miscellaneous", true, true );
			
	private Item location3Item1 = new Item( "Key", "A rusty key.", "Miscellaneous", false, false );
	
	private Item container4Item1 = new Item( "Monopoly", "A traditional game of Monopoly.", "Miscellaneous", true, true );
	private Item container4Item2 = new Item( "Puzzle", "A one-thousand piece puzzle of Earth.", "Miscellaneous", true, true );
	private Item container4Item3 = new Item( "Change", "Pennies and nickles adding up to 72 cents.", "Miscellaneous", true, true );
	private Item container4Item4 = new Item( "Blue Scarf", "A silk turquoise blue scarf.", "Miscellaneous", true, true );
	private Item container4Item5 = new Item( "Robot Arm", "A left mechanical arm.", "Robot Part", true, true );

	private Item location5Item1 = new Item( "Penny", "A penny.", "Miscellaneous", true, true );
	private Item container5aItem1 = new Item( "Ice Cream", "A chocolate chip cookie dough ice cream bar that costs 73 cents.", "Food", false, true );
			
	private Item location6Item1 = new Item( "Hammer", "A rubber mallet.", "Weapon", false, false );
	private Item location6Item2 = new Item( "Death Laser", "A lethal laser gun.", "Weapon", false, false );

	private Item location7Item1 = new Item( "Robot Arm", "A right mechanical arm.", "Robot Part", false, false );
			
	private Item location8Item1 = new Item( "Box 2.5", "A metal box version 2.5", "Robot Part", true, true ); //this is THE box
	private Item location8Item2 = new Item( "Box 1.0", "A cardboard box version 1.0", "Miscellaneous", true, true );
	private Item location8Item3 = new Item( "Box 3.0", "A cardboard box version 3.0", "Miscellaneous", true, true );
	private Item location8Item4 = new Item( "Box 7.1", "A plastic box version 7.1", "Miscellaneous", true, true );
	private Item location8Item5 = new Item( "Box 7.5.0", "A plastic box version 7.5.0", "Miscellaneous", true, true );
	private Item location8Item6 = new Item( "Box 9", "A styrofoam box version 9", "Miscellaneous", true, true );

	private Item location9Item1 = new Item( "Robot Leg", "A right track wheel.", "Robot Part", false, true );

	private Item location10Item1 = new Item( "Mechanical Tube", "A tube that can be made into a robot's neck.", "Robot Part", false, false );
				
			
			
	public GameState()
	{
		//Add some items to containers
		container4.addItem( container4Item1 );
		container4.addItem( container4Item2 );
		container4.addItem( container4Item3 );
		container4.addItem( container4Item4 );
		container4.addItem( container4Item5 );
		container5a.addItem( container5aItem1 );
		
		
		//Add containers to locations
		location1.addItem( container1 );
		location3.addItem( container3 );
		location4.addItem( container4 );
		location5.addItem( container5a );
		location5.addItem( container5b );
		location5.addItem( container5c );
		location5.addItem( container5d );
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
		location1.addItem( location1Item3 );
		location2.addItem( location2Item1 );
		location2.addItem( location2Item2 );
		location2.addItem( location2Item3 );
		location3.addItem( location3Item1 );
		location5.addItem( location5Item1 );
		location6.addItem( location6Item1 );
		location6.addItem( location6Item2 );
		location7.addItem( location7Item1 );
		location8.addItem( location8Item1 );
		location8.addItem( location8Item2 );
		location8.addItem( location8Item3 );
		location8.addItem( location8Item4 );
		location8.addItem( location8Item5 );
		location8.addItem( location8Item6 );
		location9.addItem( location9Item1 );
		location10.addItem( location10Item1 );
		
		
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
		moves = 0;
	}
	
	
	
	/**
	 * The list of puzzles of the game.
	 * @param item The item that user uses.
	 * @param containerItem The container that user puts the item in.
	 */
	public void puzzle( Item item, ContainerItem container )
	{
		String itemName = item.getName();
		String containerName = "" ;
		if ( container != null )
			containerName = container.getName();
		
		
		
		/* Give Floaties to Drowning Person to reveal Robot Leg in Pool Deck.
		 * Floaties and Drowning Person become hidden after Drowning Person receives Floaties.
		 */
		if ( itemName.equals( "Floaties" ) && containerName.equals( "Drowning Person" ) )
		{
			location1Item3.setTakabilityAndAvailability( true, true );
			item.setTakabilityAndAvailability( false, false );
			container.setAvailability( false );
			System.out.println( "The person thanked you for saving her. She walked away, leaving behind a robot leg that was stuck in her foot and preventing her from getting out of the pool." ); 
		}
		
		
		/* Put Towel to NyQuil Puddle to reveal Key in Sleeping Quarter.
		 * Towel and NyQuil Puddle become hidden after NyQuil receives Towel.
		 */
		else if ( itemName.equals( "Towel" ) && containerName.equals( "NyQuil Puddle" ) )
		{
			location3Item1.setTakabilityAndAvailability( true, true );
			item.setTakabilityAndAvailability( false, false );
			container.setAvailability( false );
			System.out.println( "The towel quickly absorbed the NyQuil Puddle, revealing a rusty key lying on the floor." );
		}
		
		
		/* Put M-O in NyQuil Puddle in Sleeping Quarter, thus waking everyone up. Game Over.
		 * 
		 */
		else if ( itemName.equals( "M-O" ) && containerName.equals( "NyQuil Puddle" ) )
		{
			System.out.println( "Oh no! The sound of M-O's cleaning woke everyone up!!! You are arrested for disturbing the residents' precious zzz :(" );
			System.out.println( "GAME OVER" );
			System.exit( 1 );
		}
		
		
		/* After putting Penny in Vending Machine,
		 * put Change in Vending Machine to retrieve Ice Cream in Food Court.
		 * Change and Penny become hidden after being put to Vending Machine.
		 */
		else if ( itemName.equals( "Change" ) && containerName.equals( "Vending Machine" ) && container.retrieveItem( "Penny" ) != null )
		{
			container5aItem1.setTakability( true );
			container4Item3.setTakabilityAndAvailability( false, false );
			location5Item1.setTakabilityAndAvailability( false, false );
			System.out.println( "The Vending Machine dispenses a ¢73 Ice Cream. Yumm!" );
		}
		
		
		/* After putting Change in Vending Machine,
		 * put Penny in Vending Machine to retrieve Ice Cream in Food Court.
		 * Change and Penny become hidden after being put to Vending Machine.
		 */
		else if ( itemName.equals( "Penny" ) && containerName.equals( "Vending Machine" ) && container.retrieveItem( "Change" ) != null )
		{
			container5aItem1.setTakability( true );
			container4Item3.setTakabilityAndAvailability( false, false );
			location5Item1.setTakabilityAndAvailability( false, false );
			System.out.println( "The Vending Machine dispenses a ¢73 Ice Cream. Yumm!" );
		}
		
		
		/* Put Key to Locked Door in Food Court to gain access to Armoury.
		 * Key and Locked Door become hidden after Locked Door receives Key.
		 */
		else if ( itemName.equals( "Key" ) && containerName.equals( "Locked Door" ) )
		{
			location6.setAccessiblity( true );
			item.setTakabilityAndAvailability( false, false );
			container.setAvailability( false );
			System.out.println( "You turn the rusty key in the door's rusty lock... They click! The door opens up to a dark room. But wait! You see a red light and hear noises coming towards you!" );
		}
		
		
		/* Put Blue Scarf to GO-4 to reveal Hammer, Death Laser, and Weapons.
		 * Blue Scarf and GO-4 become hidden after GO-4 receives Blue Scarf.
		 */
		else if ( itemName.equals( "Blue Scarf" ) && containerName.equals( "GO-4" ) )
		{
			container6b.setAvailability( true );
			location6Item1.setTakabilityAndAvailability( true, true );
			location6Item2.setTakabilityAndAvailability( true, true );
			item.setTakabilityAndAvailability( false, false );
			container.setAvailability( false );
			System.out.println( "You blinded GO-4 with the blue scarf and lured him out of the Armoury. You stepped further inside the Armoury and saw many cool stuff!" );
		}
		
		
		/* Put M-O in Toilet Explosion to reveal Robot Arm in Lavatory.
		 * M-O and Toilet Explosion become hidden after Toilet Explosion receives M-O.
		 */
		else if ( itemName.equals( "M-O" ) && containerName.equals( "Toilet Explosion" ) )
		{
			location7Item1.setTakabilityAndAvailability( true, true );
			item.setTakabilityAndAvailability( false, false );
			container.setAvailability( false );
			System.out.println( "M-O briskly cleaned up the toilet explosion. As the water starts to drain away, a robot arm emerges from the puddles." );
			
		}
		
		
		/* Take Robot Leg from Engine Room without feeding Guard, thus make him angry. Game Over.
		 */
		else if ( itemName.equals( "Robot Leg" ) && containerName.equals( "" ) && container9.isAvailable() )
		{
			System.out.println( "You attempted to sneak the Robot Leg from the Guard but he caught your hand! The Guard got very angry and sent you to the Detention Center." );
			System.out.println( "GAME OVER" );
			System.exit( 1 );
		}
		
		
		/* Give Ice Cream to Guard and find out that he is still hungry.
		 */
		else if ( itemName.equals( "Ice Cream" ) && containerName.equals( "Guard" ) && container.retrieveItem( "Chips" ) == null )
		{
			item.setTakabilityAndAvailability( false, false );
			System.out.println( "The Guard ate the Ice Cream, but he is still hungry..." );
		}
		
		
		/* Give Chips to Guard and find out that he is still hungry.
		 */
		else if ( itemName.equals( "Chips" ) && containerName.equals( "Guard" ) && container.retrieveItem( "Ice Cream" ) == null )
		{
			item.setTakabilityAndAvailability( false, false );
			System.out.println( "The Guard ate the Chips, but he is still hungry..." );
		}
		
		
		/* After giving Chips to Guard,
		 * give Ice Cream to Guard to retrieve Robot Leg and gain access to Control Center.
		 * Chips, Ice Cream, and Guard become hidden after Guard received Chips and Ice Cream.
		 */
		else if ( itemName.equals( "Ice Cream" ) && containerName.equals( "Guard" ) && container.retrieveItem( "Chips" ) != null )
		{
			location9Item1.setTakability( true );
			location10.setAccessiblity( true );
			item.setTakabilityAndAvailability( false, false );
			container.setAvailability( false );
			System.out.println( "The Guard thanked you for the Chips and Ice Cream. He went to take a nap after eating, leaving behind the Robot Leg and exposing the door to the Control Center." );
		}
		
		
		/* After giving Ice Cream to Guard,
		 * give Chips to Guard to retrieve Robot Leg and gain access to Control Center.
		 * Chips, Ice Cream, and Guard become hidden after Guard received Chips and Ice Cream.
		 */
		else if ( itemName.equals( "Chips" ) && containerName.equals( "Guard" ) && container.retrieveItem( "Ice Cream" ) != null )
		{
			location9Item1.setTakability( true );
			location10.setAccessiblity( true );
			item.setTakabilityAndAvailability( false, false );
			container.setAvailability( false );
			System.out.println( "The Guard thanked you for the Chips and Ice Cream. He went to take a nap after eating, leaving behind the Robot Leg and exposing the door to the Control Center." );
		}
		
		
		/* Put Death Laser to AUTO in Control Center and the laser bounces back at you. Game Over. 
		 */
		else if ( itemName.equals( "Death Laser" ) && containerName.equals( "AUTO" ) )
		{
			System.out.println( "You used the Death Laser to fight back AUTO without knowing that AUTO's surface is laser-proof! The laser bounced back at you, uh oh..." );
			System.out.println( "GAME OVER" );
			System.exit( 1 );
		}
		
		
		/* Put Hammer in AUTO to deactivate him, revealing the Mechanical Tube and the Magnetic Workspace
		 * Hammer and AUTO become hidden after AUTO received Hammer.
		 */
		else if ( itemName.equals( "Hammer" ) && containerName.equals( "AUTO" ) )
		{
			container10b.setAvailability( true );
			location10Item1.setTakabilityAndAvailability( true, true );
			item.setTakabilityAndAvailability( false, false );
			container.setAvailability( false );
			System.out.println( "You professionally threw the rubber mallet at AUTO and it hit AUTO's Off Button! AUTO is deactivated so you step further into the room to realize that it has some cool stuff." );
		}
	}
	
	
	
	/**
	 * Return current location's name.
	 * @return The current location's name.
	 */
	public String currentLocationName()
	{
		return currentLocation.getName();
	}
	
	
	
	/**
	 * Print the current location's name, description, non-hidden Items,
	 * and the number of moves that user has made.
	 */
	public void look()
	{
		System.out.println( currentLocation.getName( ) );
		System.out.println( currentLocation.getDescription( ) );
		System.out.println( "You see: " );
		for ( int i = 0; i < currentLocation.countItems(); i++ )
		{
			if ( currentLocation.retrieveItem( i ).isAvailable() )
				System.out.println( "  " + currentLocation.retrieveItem( i ) );
		}
		currentLocation.getDirection();
		System.out.println( "Moves that you've made so far: " + moves );
	}
	
	
	
	/**
	 * Print the specified Item's description. 
	 */
	public void examine( String itemName )
	{
		Item item = currentLocation.retrieveItem( itemName );
		
		if ( item != null && item.isAvailable() )
			System.out.println( item.getDescription() );
		else
			System.out.println( "Object not found." );
	}
	
	
	
	/**
	 * Take the specified Item from the current location
	 * and put it in user's inventory.
	 * @param itemName
	 */
	public void take( String itemName )
	{
		Item item = currentLocation.retrieveItem( itemName );
		
		if ( item != null && item.isTakable() )
		{
			currentLocation.removeItem( item );
			inventory.addItem( item );
			System.out.println( "Took " + item.getName() + " from " + currentLocation.getName() + "." );
		}
		else if ( item != null && !item.isTakable() && item.isAvailable() )
		{
			puzzle( item, null );
			System.out.println( "Cannot take this." );
		}
		else
			System.out.println( "Object not found." );
	}
	
	
	
	/**
	 * Take the specified Item from the specified ContainerItem
	 * and put it in user's inventory.
	 * @param itemName
	 * @param containerName
	 */
	public void takeFrom( String itemName, String containerName )
	{
		ContainerItem container = ( ContainerItem ) currentLocation.retrieveItem( containerName );
		
		if ( container != null && container.isAvailable() )
		{
			Item item = container.retrieveItem( itemName );
			if ( item != null && item.isTakable() )
			{		
				container.removeItem( item );
				inventory.addItem( item );
				System.out.println( "Took " + item.getName() + " from " + container.getName() + "." );
			}
			else if ( item != null && !item.isTakable() && item.isAvailable())
				System.out.println( "Cannot take this." );
			else
				System.out.println( "Object not found." );
		}
		else
			System.out.println( "Container not found." );
	}
	
	
	
	/**
	 * Take the specified Item from user's inventory,
	 * and put it in the current location.
	 * @param itemName
	 */
	public void put( String itemName )
	{
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
	
	
	
	/**
	 * Take the specified Item from user's inventory,
	 * and put it in the specified ContainerItem.
	 * @param itemName
	 * @param containerName
	 */
	public void putIn( String itemName, String containerName )
	{
		ContainerItem container = ( ContainerItem ) currentLocation.retrieveItem( containerName );
		
		
		if ( container != null && container.isAvailable() )
		{
			Item item = inventory.retrieveItem( itemName );
			if ( item != null )
			{		
				inventory.removeItem( item );
				container.addItem( item );
				System.out.println( "Put " + item.getName() + " in " + container.getName() + "." );
				
				
				/* If the Magnetic Workspace has all the robot parts, user wins!
				 * Otherwise, check to see if user solved any puzzle.
				 */
				if ( container.equals( container10b ) && container.getContents().contains( location0Item1 ) 
						&& container.getContents().contains( location1Item3 ) 
						&& container.getContents().contains( location2Item1 )
						&& container.getContents().contains( container4Item5 )
						&& container.getContents().contains( location7Item1 )
						&& container.getContents().contains( location8Item1 )
						&& container.getContents().contains( location9Item1 )
						&& container.getContents().contains( location10Item1 )
						)
				{
					System.out.println( "You put all the collected robot parts on the Magnetic Workspace, and whoop, the Magnetic Workspace automatically assembled the robot for you!" );
					System.out.println( "You speechlessly stare at the robot and realize that it is WALL-E!!! Congratulations! YOU WON!!!" );
					System.exit( 1 );
				}
				else
					puzzle( item, container );
			}
			else
				System.out.println( "Object not found." );
		}
		else
			System.out.println( "Receiver not found." );
	}
	
	
	
	/**
	 * Take the specified Item from user's inventory,
	 * and give it to the specified ContainerItem.
	 * @param itemName
	 * @param containerName
	 */
	public void giveTo( String itemName, String containerName )
	{
		ContainerItem container = ( ContainerItem ) currentLocation.retrieveItem( containerName );
		
		
		if ( container != null && container.isAvailable() )
		{
			Item item = inventory.retrieveItem( itemName );
			if ( item != null )
			{		
				inventory.removeItem( item );
				container.addItem( item );
				System.out.println( "Gave " + item.getName() + " to " + container.getName() + "." );
				puzzle( item, container );
			}
			else
				System.out.println( "Object not found." );
		}
		else
			System.out.println( "Receiver not found." );
	}
	
	
	
	/**
	 * Print user's inventory.
	 */
	public void inventory()
	{
		System.out.println( inventory.getInventory() );
	}
	
	
	
	/**
	 * Go towards the specified direction.
	 * @param direction
	 */
	public void go( String direction )
	{
		if ( currentLocation.equals( location0 ) && direction.toLowerCase().equals( "south" ) )
		{
			System.out.println( "LOL you fell off the spaceship!");
			System.out.println( "GAME OVER" );
			System.exit( 1 );
		}
		
		if ( currentLocation.move( direction ) != null )
		{
			if ( currentLocation.move( direction ).isAccessible() )
			{
				currentLocation = currentLocation.move( direction );
				System.out.println( "Moving..." );
			}
			else
				System.out.println( "There is an obstacle that is preventing you from going " + direction + "." );
		}
		else
			System.out.println( "Can't go that way." );
	}
	
	
	
	/**
	 * Print helps.
	 */
	public void help()
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
	
	
	
	/**
	 * Increment the number of moves by one after each user's command.
	 */
	public void addMove()
	{
		moves++;
	}
	
	
}
