package exceptionPkg;

public class ThrowEg 
{

	public static void main(String[] args) 
	{
		int age = 10;
		if(age>=18)
		{
			System.out.println("Elegible for voting");
		}
		else
		{
			throw new ArithmeticException("Age under 18");
		}
	}

}
