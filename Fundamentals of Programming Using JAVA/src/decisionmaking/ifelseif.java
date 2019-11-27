package decisionmaking;

import java.util.Scanner;

public class ifelseif {
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter salary");
int salary=s.nextInt();
if(salary<=75000&&salary>=50000)
{
	System.out.print("tax is 15%");
}
else if(salary>=30000&&salary<50000)
{
	System.out.print ("tax is 13%");
}
else
{
	System.out.print("tax is nil");
}
}
}





