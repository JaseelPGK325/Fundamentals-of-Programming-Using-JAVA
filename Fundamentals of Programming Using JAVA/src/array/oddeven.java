package array;

import java.util.Scanner;

public class oddeven 
{
	public static void main(String arg[]) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the index");
		int size=s.nextInt();
		int[]values=new int[size];
		int sum=0;
		int sum1=0;
		int b=0;
		int c=0;
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the first array");
			values[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(values[i]%2==0)
			{
				System.out.println(values[i]);
				sum=sum+values[i];
				b++;
			}
			for(int i1=0;i1<size;i1++)
			{
				if(values[i1]%2==0)
				{
					System.out.println(values[i1]);
					sum1=sum1+values[i1];
					c++;
				}
				int e=sum/b;
				int o=sum1/c;
				System.out.println(o);
				System.out.println(e);
			}
		}
				}
			
		}
	


 