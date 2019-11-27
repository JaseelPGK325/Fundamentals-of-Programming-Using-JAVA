package decisionmaking;

public class reversepattern {


public static void printStars(int n) 
{ 
    int i, j; 

    
    for(i=0; i<4; i--) 
    { 
    	    
        for(j=0; j<=i; j++) 
        { 
            
            System.out.print("* "); 
        } 

       
        System.out.println(); 
    } 
} 

 
public static void main(String args[]) 
{ 
    int n = 5; 
    printStars(n); 
} 
} 
    


