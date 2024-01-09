package Encapsulation;

class Demo
{
	static int count=1;
	static Demo de;
	
	public void m1() {
		System.out.println("M1 running");
	}
	
	private Demo()
	{
		System.out.println("Demo Running");
		count++;
	}
	
	public static Demo getDemo() {
		if(count==1)
		{
		 de = new Demo();
		}
		return de;
	}
}
public class SingletonClass {

	public static void main(String[] args) {

		Demo de1 = Demo.getDemo();
		de1.m1();
		Demo de2 = Demo.getDemo();
		de2.m1();
	}

}
