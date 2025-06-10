package aggregation;

public class AggregationChild2 
{
	String name;
	int id;
	AggregationParent2 ref2;
	
	public AggregationChild2(String name, int id, AggregationParent2 ref2)
	{
		this.name = name;
		this.id = id;
		this.ref2 = ref2;
	}
	public void display()
	{
		System.out.println(ref2.colour + ref2.num);
		System.out.println(name + id);
	}
	public static void main(String[] args) 
	{
		AggregationParent2 obj1 = new AggregationParent2("Black", 101);
		AggregationChild2 obj = new AggregationChild2("Riya", 75, obj1);
		obj.display();
	}
}
