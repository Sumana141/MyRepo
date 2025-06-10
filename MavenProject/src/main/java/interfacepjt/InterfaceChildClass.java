package interfacepjt;

public class InterfaceChildClass implements Interface1
{

	public static void main(String[] args) 
	{
		InterfaceChildClass obj = new InterfaceChildClass();
		obj.display();
		System.out.println(obj.a);
		obj.show();
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
