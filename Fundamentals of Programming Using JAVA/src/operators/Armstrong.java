package operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Armstrong {
	public static void main(String arg[]) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b=a;
		int r;
		int c=a;
		double sum=0;
		int count=0;
		while(c!=0);
		{
			count++;
			c=c/10;
		}
		while(a!=0)
			{
			r=a%10;
			sum=sum+Math.pow(r, count);
			a=a/10;
			
			}
			System.out.println(+sum);
			if(sum==b) {
				System.out.println("number is armstrong");
	}
	else
	{
		System.out.println("number is not armstrong");
		
				
			}
		}
	}

