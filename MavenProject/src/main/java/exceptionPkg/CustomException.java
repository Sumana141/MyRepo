package exceptionPkg;

public class CustomException 
{

	public static void main(String[] args) throws VotingException 
	{
		int age = 10;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new VotingException("Not eligible");
		}
	}

}
