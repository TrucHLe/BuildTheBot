package csc232;

/**
 *  This class runs the main program.
 * 
 * @author Truc Le
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Driver 
{
	private Location location;
	private Item item1;
	private Item item2;
	private Item item3;
	private Item item4;
	private ContainerItem inventory;
	private ArrayList<ContainerItem> containers;
	private ContainerItem container1;
	private ContainerItem container2;

	
	public Driver( )
	{	
		location = new Location( "Bedroom", "A room filled with sunlight" );
		item1 = new Item( "Eyes", "A pair of mechanical eyes", "Robot Part" );
		item2 = new Item( "Arms", "A pair of mechanical arms", "Robot Part" );
		item3 = new Item( "Box", "A hollow box that serves as the body", "Robot Part" );
		item4 = new Item( "Wheels", "Two chained wheels", "Robot Part" );
		inventory = new ContainerItem( "Inventory" );
		containers = new ArrayList<ContainerItem>();
		container1 = new ContainerItem( "Closet" );
		container2 = new ContainerItem( "Cabinet" );

		
		location.addItem( item1 );
		location.addItem( item2 );
		
		
		container1.addItem( item3 );
		container1.addItem( item4 );
		containers.add( container1 );
		containers.add( container2 );
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
		
		while ( true )
		{
			System.out.print( "Enter command > " );
			command = in.nextLine().trim().toLowerCase();
			
			if ( command.equals( "quit" ) )
			{
				System.out.println( "Quitting..." );
				break;
			}
			
			
			else if ( command.equals( "look" ) )
			{
				System.out.println( location.getName( ) );
				System.out.println( location.getDescription( ) );
				System.out.println( "Items here: " );
				for ( int i = 0; i < location.countItems(); i++ )
					System.out.println( "  " + location.retrieveItem( i ) );
			}
			
			
			else if ( command.startsWith( "examine " ) )
			{
				String itemName = command.substring( 8 );
				Item item = location.retrieveItem( itemName );
				
				if ( item != null )
					System.out.println( item.getDescription() );
				else
					System.out.println( "Object not found." );
			}
			
			
			else if ( command.startsWith( "take " ) &&  command.contains( "from" ) )
			{
					
				String itemName = command.substring( 5, command.indexOf( "from" ) - 1 );
				String containerName = command.substring( command.indexOf( "from" ) + 5 );
				ContainerItem tempContainer = null;			
				
				for ( ContainerItem container : containers )
				{
					if ( container.getName().toLowerCase().equals( containerName ) )
					{
						tempContainer = container;
						Item containerItem = container.retrieveItem( itemName );

						if ( containerItem != null )
						{		
							container.removeItem( containerItem );
							inventory.addItem( containerItem );
							System.out.println( "Took " + containerItem.getName() + " from " + container.getName() + "." );
						}
						else
							System.out.println( "Object not found." );
					}
				}
				if ( tempContainer == null )
					System.out.println( "Container not found." );

			}
			
			
			else if ( command.startsWith( "take ") )
			{
				String itemName = command.substring( 5 );
				Item locationItem = location.retrieveItem( itemName );
					
				if ( locationItem != null )
				{
					location.removeItem( locationItem );
					inventory.addItem( locationItem );
					System.out.println( "Took " + locationItem.getName() + " from " + location.getName() + "." );
				}
				else
					System.out.println( "Object not found." );
			}
			
			
			else if ( command.startsWith( "put " ) &&  command.contains( "in" ) )
			{
				String itemName = command.substring( 4, command.indexOf( "in" ) - 1 );
				String containerName = command.substring( command.indexOf( "in" ) + 3 );
				ContainerItem tempContainer = null;
				
				for ( ContainerItem container : containers )
				{
					if ( container.getName().toLowerCase().equals( containerName ) )
					{
						tempContainer = container;
						Item inventoryItem = inventory.retrieveItem( itemName );

						if ( inventoryItem != null )
						{		
							inventory.removeItem( inventoryItem );
							container.addItem( inventoryItem );
							System.out.println( "Put " + inventoryItem.getName() + " in " + container.getName() + "." );
						}
						else
							System.out.println( "Object not found." );
					}
				}
				if ( tempContainer == null )
					System.out.println( "Container not found." );

			}
			
			
			else if ( command.startsWith( "put ") )
			{
				String itemName = command.substring( 4 );
				Item inventoryItem = inventory.retrieveItem( itemName );
					
				if ( inventoryItem != null )
				{
					inventory.removeItem( inventoryItem );
					location.addItem( inventoryItem );
					System.out.println( "Put " + inventoryItem.getName() + " in " + location.getName() + "." );
				}
				else
					System.out.println( "Object not found." );
			}
			
			
			else if ( command.equals( "inventory" ))
			{
				System.out.println( inventory.getDescription() );
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
