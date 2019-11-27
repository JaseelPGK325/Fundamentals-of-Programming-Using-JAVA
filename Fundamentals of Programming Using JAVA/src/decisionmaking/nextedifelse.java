package decisionmaking;

import java.util.Scanner;

public class nextedifelse {
public static void main(String arg[])
{   String s1="HP";int RAM=16,HD=2;
	Scanner s=new Scanner(System.in);
	String a=s.next();
	int b=s.nextInt();
	int c=s.nextInt();
	if(a=="HP")
	{ 
		if(b==RAM)
		{ 
			if(c==HD)
			{
				System.out.printf("all are satisfied" +a,+b,+c);
			}
			else
			{
				System.out.println("none of these satisfied");
			}
		}
		else {
			System.out.println("not a 16 gb ram");
		}
	}
		else
		{
			System.out.println("not an hp lap");
		}
		
			
			}
			}
		

