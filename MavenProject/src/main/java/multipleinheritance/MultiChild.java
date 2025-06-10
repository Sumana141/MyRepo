package multipleinheritance;

public class MultiChild implements Interface1, Interface2
{

	public static void main(String[] args) 
	{
		MultiChild obj = new MultiChild();
		obj.show();
		obj.display();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Interface2 method");
	}

	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.println("Interface1 method");
	}

}
