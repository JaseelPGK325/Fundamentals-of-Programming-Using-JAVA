package decisionmaking;

import java.util.Scanner;

public class nestedswitch {
public static void main (String arg[])
{
	char branch='E';
	Scanner s=new Scanner(System.in);
	System.out.println("enter a year");
	int collegeyear=s.nextInt();
	switch(collegeyear) 
	{
	
	case 1:
	System.out.println("english,maths,science");
	break;
	case 2:
	switch(branch)
	{
	case'E':
	System.out.println("micro processor,logic switching,macros");
	break;
	case'C':
	System.out.println("c,data structures,cobol");
	break;
	case'M':
	System.out.println("metallurgy,manufacturing,AMS");
	break;
	default:
	System.out.println("not in branch");
	break;
	}
	}
}
}
