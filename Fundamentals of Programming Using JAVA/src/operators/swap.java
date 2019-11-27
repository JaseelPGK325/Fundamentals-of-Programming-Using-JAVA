package operators;
import java.util.Scanner;
public class swap {
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int t=0;
		t=n;
		n=m;
		m=t;
		System.out.println(n);
		System.out.println(m);
		
	}
}


