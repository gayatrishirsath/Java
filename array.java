package gayatri;

public class array {

	public static void main(String[] args) {

		try
		{
			int a[]=new int[5];
			System.out.println("Array created succ....!!!");
			a[0]=1;
			a[1]=10;
			a[2]=4;
			System.out.println("Value insert succ....!!!");
			System.out.println("Value ="+a[6]);
		}catch(Exception e)
		{
			System.out.println("Error=!"+e);	
		}

	}
}


