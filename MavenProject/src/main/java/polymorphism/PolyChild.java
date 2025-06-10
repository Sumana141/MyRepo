package polymorphism;

public class PolyChild extends PolyParent
{
	public void display(int a, int b)
	{
		super.display(3, 3);
		int c = a-b;
		System.out.println(c);
		super.display2("Riya");
	}
	public static void main(String[] args) 
	{
		PolyChild obj = new PolyChild();
		obj.display(6, 5);

	}

}
