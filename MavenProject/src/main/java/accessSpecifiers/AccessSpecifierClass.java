package accessSpecifiers;

public class AccessSpecifierClass 
{

	public static void main(String[] args) 
	{
		AccessSpecifierClass obj = new AccessSpecifierClass();
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();
	}
	public void publicMethod()
	{
		System.out.println("Public Method");
	}
	private void privateMethod()
	{
		System.out.println("Private Method");
	}
	protected void protectedMethod()
	{
		System.out.println("Protected Method");
	}
	void defaultMethod()
	{
		System.out.println("Default Method");
	}

}
