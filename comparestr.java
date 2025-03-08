package gayatri;

import java.util.Scanner;

public class comparestr {		

	public static void main(String[] args)
				{
			    Scanner sc=new Scanner(System.in);
			    System.out.println("Enter First string");
			    String s1=sc.next();
			    System.out.println("Enter Second string");
			    String s2=sc.next();
			    int k=s1.compareTo(s2);
			    	if(k==0)
			    	{
			    		 System.out.println("strings are same");
			    	}
			    	if(k>0)
			    	{
			    		 System.out.println("string first is grater..!");
			    	}
			    	if(k<0)
			    	{
			    		 System.out.println("string second is grater..!");
			    	}
				}
}
