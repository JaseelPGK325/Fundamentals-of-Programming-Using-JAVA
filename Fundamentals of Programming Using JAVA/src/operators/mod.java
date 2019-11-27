package operators;
import java.util.Scanner;
public class mod
{
	public static void main(String[]arg)
	{
		//Scanner =new Scanner(System.in);
		int n=253;
		int a=n%10;
		int b=a*a;
		int c=n/100;
		int d=c*a;
		int m=b*d;
		System.out.printf("%d%d",b,d);
		System.out.println(m);
		
		}
}

