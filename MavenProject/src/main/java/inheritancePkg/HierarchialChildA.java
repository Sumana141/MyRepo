package inheritancePkg;

public class HierarchialChildA extends HierarchialParentA
{

	public static void main(String[] args) 
	{
		HierarchialChildA obj = new HierarchialChildA();
		obj.print();
		obj.display();
	}
	public void print()
	{
		System.out.println("Hierarchial Child A");
	}

}
