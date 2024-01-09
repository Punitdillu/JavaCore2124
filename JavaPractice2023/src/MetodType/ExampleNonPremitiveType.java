package MetodType;

public class ExampleNonPremitiveType {

	int x=4;
	public void m1() 
	{
		
		System.out.println("M1 is running");
		
	} 

	public static ExampleNonPremitiveType getObject() 
	{
		ExampleNonPremitiveType e= new ExampleNonPremitiveType();
		return e;
	}
}

class Test
{
	public static void main(String[] args) 
	{
		ExampleNonPremitiveType e1= ExampleNonPremitiveType.getObject();
		e1.m1();
		System.out.println(e1.x);
	}
}
