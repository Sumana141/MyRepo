package encapsulationPkg;

public class EncpNew2 
{

	public static void main(String[] args) 
	{
		EncpNew1 obj = new EncpNew1();
		obj.setPassword(123);
		obj.setUsername("Riya");
		System.out.println(obj.getPassword());
		System.out.println(obj.getUsername());
	}

}
