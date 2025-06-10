package exceptionPkg;

public class CstmExp2 
{

	public static void main(String[] args) throws InvalidException 
	{
		int age = 28;
		if(age<=25)
		{
			System.out.println("Eligible for registration");
		}
		else
		{
			throw new InvalidException("Not eligible for registration");
		}
	}

}
