package superKeyword;

public class SuperChild extends SuperInstance
{
	String b = "blue";

	public static void main(String[] args) 
	{
		SuperChild obj = new SuperChild();
		obj.display();
	}
	public void display()
	{
		System.out.println(b);
		System.out.println(super.a);
	}

}
