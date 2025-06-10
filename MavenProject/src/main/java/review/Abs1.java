package review;

public class Abs1 extends AbstractParent1
{

	public static void main(String[] args) 
	{
		Abs1 obj = new Abs1();
		obj.print();
		obj.employee("Nikhitha", 102);
	}

	@Override
	public void print() 
	{
			// TODO Auto-generated method stub
		String m = "Riya";
		int n = 35;
		int i = 85;
		System.out.println("Name: "+m);
		System.out.println("Roll No: "+n);
		System.out.println("Mark: "+i);
	}

}
