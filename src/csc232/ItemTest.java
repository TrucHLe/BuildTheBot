package csc232;

/**
 * The ItemTest class creates two Item objects,
 * prompts the user to set all the fields of these objects,
 * and prints out the values of these objects' fields.
 * 
 * @author Truc Le
 * 
 */

import java.util.Scanner;


public class ItemTest 
{
	public static void main( String[] args )
	{
		Item item1 = new Item();
		Item item2 = new Item();
		
		String name1;
		String name2;
		String type1;
		String type2;
		String description1;
		String description2;
		
		Scanner in = new Scanner( System.in );
		
		
		System.out.print( "Enter name of item 1: " );
		name1 = in.nextLine();
		item1.setShortname( name1 );
		
		System.out.print( "Enter type of item 1: " );
		type1 = in.nextLine();
		item1.setType( type1 );
		
		System.out.print( "Enter description of item 1: " );
		description1 = in.nextLine();
		item1.setDescription( description1 );
		
		
		System.out.print( "Enter name of item 2: " );
		name2 = in.nextLine();
		item2.setShortname( name2 );
		
		System.out.print( "Enter type of item 2: " );
		type2 = in.nextLine();
		item2.setType( type2 );
		
		System.out.print( "Enter description of item 2: " );
		description2 = in.nextLine();
		item2.setDescription( description2 );
		
		
		System.out.println( item1.toString() );
		System.out.println( item2.toString() );
		
		in.close();
	}
}