package exceptionPkg;

public class TryExp 
{

	public static void main(String[] args) 
	{
		int a = 5;
		int b = 0;
		try
		{
			int c = a/b;
		}
		catch(ArithmeticException m)
		{
			//System.out.println("Exception Handled");
			b = 2;
			int i = a/b;
			System.out.println(i);
		}
		finally
		{
			System.out.println("Rest of the code");
		}
		
		
		int ar[] = {1,2,3,4};
		try 
		{
			for(int i=0; i<=4; i++)
			{
				System.out.println(ar[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException j)
		{
			System.out.println("Exception Handled");
		}
	}

}
