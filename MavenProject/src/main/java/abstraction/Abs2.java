package abstraction;

public class Abs2 extends AbsParentNew
{

	public static void main(String[] args) 
	{
		AbsParentNew obj = new Abs2(); //abstract class reference.
		obj.display();
		obj.show();
		obj.print();
		//obj.child(); - we cannot call child class method using abstract class reference.
	}

	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.println("Display");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}
	
	public void child()
	{
		System.out.println("Child class method");
	}

}
