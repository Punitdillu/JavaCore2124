package Com.javaPractice;

public class Inheritance {
	int x=10;
	static int y=20;

	public void Sum()
	{
		int z =30;
		
		System.out.println(y+z+x);
	}
	
	
}
 class Child1 extends Inheritance
{
	public static void main(String[] args) 
	{
		Child1 ob= new Child1();
		System.out.println(y+ob.x);
		ob.Sum();
	}

}
