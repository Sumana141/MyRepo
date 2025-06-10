package abstraction;

public class Abstraction1 extends AbstractionParent
{

	public static void main(String[] args) 
	{
		Abstraction1 obj = new Abstraction1();
		obj.display();
		obj.show();
		obj.print();
		obj.childdisplay();

	}

	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.println("body");
	}

	@Override
	public void show() 
	{
		// TODO Auto-generated method stub
		System.out.println("show");
	}
	
	public void childdisplay()
	{
		System.out.println("Child class method");
	}

}
