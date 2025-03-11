package gayatri;
import java.util.Scanner;
class InvalidNumException extends Exception
{
   public String toString()
   {
   	return "NUMBER OUT OF RANGE";
   }
}
public class sum {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int sum=0,digit;
		try 
		{
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter number=");
			int num=Sc.nextInt();
			if(num>100)
			{
				throw new InvalidNumException();
			}
			while(num!=0)
			{
				digit=num%10;
				sum+=digit;
				num/=10;
			}
			System.out.println("sum of digit="+sum);
		}
		catch(Exception e)
		{
		System.out.println("Error="+e);
		}

	}
}
