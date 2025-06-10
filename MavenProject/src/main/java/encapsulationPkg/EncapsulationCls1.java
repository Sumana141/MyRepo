package encapsulationPkg;

public class EncapsulationCls1
{
	public static void main(String[] args) 
	{
		EncapsulationCls2 obj = new EncapsulationCls2();
		obj.setAge(25);
		obj.setName("Riya");
		int a = obj.getAge();
		System.out.println(a);
		System.out.println(obj.getName());
	}

}
