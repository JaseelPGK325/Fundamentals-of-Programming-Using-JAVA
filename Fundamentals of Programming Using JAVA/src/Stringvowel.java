import java.util.*;
public class Stringvowel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String v=s.nextLine();int i=v.length();
		
		for(i=0;i>0;i++) {char ai=v.charAt(i);
		if( (ai=='a')||(ai=='A')||( ai=='e')||( ai=='i')||(ai=='o')||(ai=='u')||(ai=='E')||(ai=='I')||(ai=='O')||(ai=='U')) {
		int count=0;count++;
		for(int j=0;j<count;j++)
		{	System.out.print("*");}
		System.out.print(ai);
		for(int k=0;k<count;k++) {
			System.out.print("*");}}
		
		else {System.out.print(ai);
		}}
	
		
		
		
		// TODO Auto-generated method stub

	

}}
