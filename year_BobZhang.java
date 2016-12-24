import java.io.*;
import java.util.*;

class year_BobZhang
{
    public static void main (String[] args)
    {
	int yr = 0;
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	try
	{
	    yr = Integer.parseInt(br.readLine ());
	}
	catch (IOException e)
	{
	}
	int leap = 0;
	if (yr % 4 == 0)
	{
	    leap = 1;
	}
	if (yr % 100 == 0)
	{
	    leap = 0;
	}
	if (yr % 400 == 0)
	{
	    leap = 1;
	}
	yr = yr - 1;
	int day = 37 + yr + (yr / 4) - (yr / 100) + (yr / 400);
	yr = yr + 1;
	day = day % 7;
	if (day == 0)
	{
	    day = 7;
	}
	for (int e = 1 ; e < 13 ; e++)
	{
	    System.out.println("MONTH : " + e);
	    System.out.println ("S\tM\tT\tW\tT\tF\tS");
	    for (int x = 1 ; x < day ; x++)
	    {
		System.out.print ("\t");
	    }
	    if (e == 1 || e == 3 || e == 5 || e == 7 || e == 8 || e == 10 || e == 12)
	    {
		for (int a = 1 ; a < 32 ; a++)
		{
		    System.out.print (a + "\t");
		    day = day + 1;
		    if (day == 8)
		    {
			day = 1;
			System.out.print ("\n\n");
		    }
		}
	    }
	    if (e == 9 || e == 4 || e == 6 || e == 11)
	    {
		for (int a = 1 ; a < 31 ; a++)
		{
		    System.out.print (a + "\t");
		    day = day + 1;
		    if (day == 8)
		    {
			day = 1;
			System.out.print ("\n\n");
		    }
		}
	    }
	    if (e == 2)
	    {
		for (int a = 1 ; a < 29+leap ; a++)
		{
		    System.out.print (a + "\t");
		    day = day + 1;
		    if (day == 8)
		    {
			day = 1;
			System.out.print ("\n\n");
		    }
		}
	    }
	    System.out.print ("\n\n");
	}
    }
}

