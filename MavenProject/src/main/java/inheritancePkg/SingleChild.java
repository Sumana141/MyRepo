package inheritancePkg;

public class SingleChild extends SingleParent
{
	public static void main(String args[])
	{
		SingleChild obj = new SingleChild();
		obj.print();
		obj.display();
	}
	public void print()
	{
		System.out.println("Child Class Method");
	}
}
