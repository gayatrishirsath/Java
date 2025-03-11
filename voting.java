package gayatri;
import java.util.*;
class InvalidAgeException extends Exception
{
   public String toString()
   {
   	return "INVALID AGE";
   }
}

public class voting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter age=");
			int age=Sc.nextInt();
			if(age<=17)
			{
				throw new InvalidAgeException();
			}
			System.out.println("AGE="+age);
		}
		catch(Exception e)
		{
		System.out.println("Error="+e);
		}
	}
}
