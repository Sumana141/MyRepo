package interfacepjt;

public class IntChildClass2 implements Interface2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Interface2 obj = new IntChildClass2(); //reference of interface, but using this we cannot call child call method.
		obj.display();
	}

	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.println("display");
	}

	public void show()
	{
		System.out.println("show");
	}
}
