package superKeyword;

public class SprChildMtd extends SprParentMtd
{

	public static void main(String[] args) 
	{
		SprChildMtd obj = new SprChildMtd();
		obj.show();
		//obj.display();
	}
	public void show()
	{
		System.out.println("Super Child Method");
		super.display();
		super.print();
	}

}
