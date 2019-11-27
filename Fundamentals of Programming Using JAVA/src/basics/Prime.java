package basics;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 int b=0;
		{
			b++;
		 if(a%b==0)
		 {
			 System.out.println(a);
		 }
		 else
		 {
			int n=a/b;
			 System.out.println(a*n);
		 } }
sc.close();
}
}