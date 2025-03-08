package gayatri;
import java.util.*;
public class cntvowels {

	public static void main(String[] args)
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string");
    String s1=sc.next();
    int c=0;
    int i;
    for(i=0;i<s1.length();i++)
    {
    	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
    	{
    		
    		c++;
    	}
    }
    System.out.println("vowel count="+c);
	}

}
