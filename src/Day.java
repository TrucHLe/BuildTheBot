
/**
 * This is a class to represent a particular day in history.
 * 
 * @author Scott Thede
 */

public class Day 
{
	private int year;
	private int month;
	private int date;

	
	/**
	 * Constructs a day with the given year, month, and day.
	 * @param aYear Should be a year not equal to 0.
	 * @param aMonth Should be a month between 1 and 12.
	 * @param aDate Should be a day between 1 and 31.
	 */
	public Day( int aYear, int aMonth, int aDate )
	{
		year = aYear;
		month = aMonth;
		date = aDate;
	}

	/**
	 * Returns the year of this day.
	 * @return The year.
	 */
	public int getYear( )
	{
		return year;
	}

	/**
	 * Returns the month of this day.
	 * @return The month.
	 */
	public int getMonth( )
	{
		return month;
	}

	/**
	 * Returns the date of this day.
	 * @return The date.
	 */
	public int getDate( )
	{
		return date;
	}
	
	/**
	 * Returns a String representation of this object.
	 * @return The String.
	 */
	public String toString()
	{
		String output = new String();
		output = output + year + "-" + month + "-" + date;
		return output;
	}
	
	/**
	 * Returns a Day representing the current Day after
	 * adding n days.
	 * @param n The number of days to add.
	 * @return The new Day object.
	 */
	
	public Day addDays( int n )
	{
		Day d = new Day( year, month, date );
		
		for ( int i = 0; i < n; i++ )
		{
			d = d.nextDay();
		}
		
		return d;
	}
	
	/**
	 * Return a day that is the day after this day.
	 * @return The day after this day.
	 */
	private Day nextDay( )
	{
		int y = year;
		int m = month;
		int d = date;
		
		if ( !lastDayOfMonth( y, m, d ) )
			d++;
		else if ( m != 12 )
		{
			m++;
			d = 1;
		}
		else
		{
			y++;
			m = 1;
			d = 1;
		}

		return new Day( y, m, d );
	}
	
	/**
	 * Tells us if the year, month, and date represent
	 * the last day of the month.
	 * @return True if it is the last day of the month.
	 */
	private boolean lastDayOfMonth( int y, int m, int d )
	{
		if ( d <= 27 )
			return false;
		else if ( ( d == 31 ) && 
				  ( ( m == 1 ) || ( m == 3 ) ||
				    ( m == 5 ) || ( m == 7 ) ||
				    ( m == 8 ) || ( m == 10 ) ||
				    ( m == 12 ) ) )
			return true;
		else if ( ( d == 30 ) &&
				  ( ( m == 4 ) || ( m == 6 ) ||
				    ( m == 9 ) || ( m == 11 ) ) )
			return true;
		else if ( leapYear( y ) && ( d == 29 ) && ( m == 2 ) )
			return true;
		else if ( !leapYear( y ) && ( d == 28 ) && ( m == 2 ) )
			return true;
		else
			return false;	
	}
	
	/**
	 * Returns true if the year y is a leap year.
	 * @return True if year is a leap year.
	 */
	private boolean leapYear( int y )
	{
		if ( ( y % 4 ) != 0 )
			return false;
		else if ( ( y % 100 ) != 0 )
			return true;
		else if ( ( y % 400 ) != 0 )
			return false;
		else
			return true;
	}
	
	public void setMonth( int aMonth )
	{
		month = aMonth;
	}
	
}
