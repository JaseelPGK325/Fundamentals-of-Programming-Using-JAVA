package decisionmaking;

import java.util.Scanner;

public class ifelse {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter purchase amount");
	int amount=s.nextInt();
	if(amount>=2000)
	{
		System.out.println("you have 20% discount");
	}
			else
			
			{
				System.out.println("you are not eligible for discount");
			}
		}
	
}
	


