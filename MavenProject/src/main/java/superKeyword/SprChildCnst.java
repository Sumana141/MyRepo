package superKeyword;

public class SprChildCnst extends SprParentCnst
{
	public SprChildCnst()
	{
		super(4,5);
		System.out.println("Child Constructor");
	}
	public SprChildCnst(String m)
	{
		super(10);
		System.out.println(m);
	}
	public static void main(String[] args) 
	{
		SprChildCnst obj = new SprChildCnst();
		SprChildCnst obj1 = new SprChildCnst("hello");
	}

}
