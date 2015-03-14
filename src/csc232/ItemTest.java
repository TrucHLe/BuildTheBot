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
		Item item3 = new Item();
		Item item4 = new Item();
		Item item5 = new Item();
		Item item6 = new Item();
		
		String name1;
		String name2;
		String name3;
		String name4;
		String name5;
		String name6;
		String type1;
		String type2;
		String type3;
		String type4;
		String type5;
		String type6;
		String description1;
		String description2;
		String description3;
		String description4;
		String description5;
		String description6;
		
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
		
		System.out.print( "Enter name of item 3: " );
		name3 = in.nextLine();
		item3.setShortname( name3 );
		
		System.out.print( "Enter type of item 3: " );
		type3 = in.nextLine();
		item3.setType( type3 );
		
		System.out.print( "Enter description of item 3: " );
		description3 = in.nextLine();
		item3.setDescription( description3 );
		
		System.out.print( "Enter name of item 4: " );
		name4 = in.nextLine();
		item4.setShortname( name4 );
		
		System.out.print( "Enter type of item 4: " );
		type4 = in.nextLine();
		item4.setType( type4 );
		
		System.out.print( "Enter description of item 4: " );
		description4 = in.nextLine();
		item4.setDescription( description4 );
		
		
		System.out.print( "Enter name of item 5: " );
		name5 = in.nextLine();
		item5.setShortname( name5 );
		
		System.out.print( "Enter type of item 5: " );
		type5 = in.nextLine();
		item5.setType( type5 );
		
		System.out.print( "Enter description of item 5: " );
		description5 = in.nextLine();
		item5.setDescription( description5 );
		
		
		System.out.print( "Enter name of item 6: " );
		name6 = in.nextLine();
		item6.setShortname( name6 );
		
		System.out.print( "Enter type of item 6: " );
		type6 = in.nextLine();
		item6.setType( type6 );
		
		System.out.print( "Enter description of item 6: " );
		description6 = in.nextLine();
		item6.setDescription( description6 );
		
		
		System.out.println( item1.toString() );
		System.out.println( item2.toString() );
		System.out.println( item3.toString() );
		System.out.println( item4.toString() );
		System.out.println( item5.toString() );
		System.out.println( item6.toString() );
		
		in.close();
	}
}