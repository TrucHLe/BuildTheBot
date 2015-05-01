package csc232;

/**
 *  This class runs the main program.
 * 
 * @author Truc H. Le
 * 
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Driver 
{
	private GameState gameState = new GameState();
	
	public Driver()
	{	
	}

	
	public static void main( String[] args )
	{
		Driver program = new Driver();
		
		program.run();
	}

	
	public void run()
	{
		Scanner in = new Scanner( System.in );
		String command = null;
		String words[] = null;
		int wordsCount = 0;
		
		System.out.println( "========== BUILD-THE-BOT ==========" );
		
		System.out.println();
		System.out.println( "You're outside of a massive space station. You can't remember much, but the vague memory of an important robot comes to mind.");
		System.out.println("Your eyes are bleary and your head aches, but you know you have a mission to complete." );
		System.out.println( "If you're feeling lost, try entering the word 'help'." );
		System.out.println();
		
		while ( true )
		{
			System.out.print( "[" + gameState.currentLocationName() + "] > " );
			command = in.nextLine().trim().toLowerCase();
			words = command.split( " " );
			wordsCount = words.length;
			
			
			
			if ( wordsCount == 1 && words[0].equals( "quit" ) )
			{
				System.out.println( "Quitting..." );
				break;
			}
			
			

			else if ( wordsCount == 1 && words[0].equals( "look" ) )
				gameState.look();
			
			
			
			else if ( 1 < wordsCount && wordsCount < 4 && words[0].equals( "examine" ) )
			{
				String itemName = "";
				
				if (wordsCount == 2)
					itemName = words[1];
				else if (wordsCount == 3)
					itemName = words[1] + " " + words[2];
				
				gameState.examine( itemName );
			}
			
			
			
			else if ( 1 < wordsCount && wordsCount < 4 && words[0].equals( "take" ) )
			{
				String itemName = "";
				
				if (wordsCount == 2)
					itemName = words[1];
				else if (wordsCount == 3)
					itemName = words[1] + " " + words[2];
				
				gameState.take( itemName );
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
				
				gameState.takeFrom( itemName , containerName);
			}	

			
			
			else if ( 1 < wordsCount && wordsCount < 4 && words[0].equals( "put" ) )
			{
				String itemName = "";
				
				if (wordsCount == 2)
					itemName = words[1];
				else if (wordsCount == 3)
					itemName = words[1] + " " + words[2];
				
				gameState.put( itemName );
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
				
				gameState.putIn( itemName, containerName );
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
				
				gameState.giveTo(itemName, containerName);
			}

			
			
			else if ( wordsCount == 1 && words[0].equals( "inventory" ) )
				gameState.inventory();
			
			
			
			else if ( wordsCount == 2 && words[0].equals( "go" ) )
			{
				String direction = words[1];
				gameState.go( direction );
			}
			
			
			
			else if ( wordsCount == 1 && words[0].equals( "help" ) )
				gameState.help();
			
			
			
			else if ( wordsCount == 1 && words[0].equals( "save" ) )
			{
				try
				{
					gameState.saveDate();
					ObjectOutputStream fileOut = new ObjectOutputStream(
							new FileOutputStream( "savedGameState.dat" ));
					fileOut.writeObject( gameState );
					fileOut.close();
				}
				catch ( Exception e )
				{
					e.printStackTrace();
				}
			}
			
			
			
			else if ( wordsCount == 1 && words[0].equals( "load" ) )
			{
				try
				{
					ObjectInputStream fileIn = new ObjectInputStream(
							new FileInputStream( "savedGameState.dat" ));
					GameState savedGameState = ( GameState ) fileIn.readObject();
					fileIn.close();
					gameState = savedGameState;
					gameState.loadSavedDate();
				}
				catch ( Exception e )
				{
					e.printStackTrace();
				}
			}
			
			
			
			else
			{
				System.out.println( "Unknown command." );
			}
			
			System.out.println();
			gameState.addMove();
		}
		
		in.close();
	}
}

