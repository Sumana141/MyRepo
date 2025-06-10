package aggregation;

public class AggregationChild 
{
	String sub;
	int mark;
	AggregationParent ref;
	
	public AggregationChild(String sub, int mark, AggregationParent ref)
	{
		this.sub = sub;
		this.mark = mark;
		this.ref = ref;
	}
	public void display()
	{
		System.out.println(ref.name + ref.age);
		System.out.println(sub + mark);
	}
	public static void main(String[] args) 
	{
		AggregationParent obj1 = new AggregationParent("Sumana", 28);
		AggregationChild obj = new AggregationChild("Maths", 80, obj1);
		obj.display();
	}

}
