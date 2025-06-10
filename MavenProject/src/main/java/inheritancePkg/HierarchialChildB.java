package inheritancePkg;

public class HierarchialChildB extends HierarchialParentA
{

	public static void main(String[] args) 
	{
		HierarchialChildB obj1 = new HierarchialChildB();
		obj1.show();
		obj1.display();
	}
	public void show()
	{
		System.out.println("Hierarchial Child B");
	}

}
