package inheritancePkg;

public class MultilevelChild extends MultilevelIntermediate
{

	public static void main(String[] args) 
	{
		MultilevelChild obj = new MultilevelChild();
		obj.display();
		obj.print();
		obj.show();
	}
	public void display()
	{
		System.out.println("Multilevel Child");
	}

}
