package Com.javaPractice;

public class Static_NonStatic_local_Var {

	int x=10;
	static int y=20;

	public void Sum()
	{
		int z =30;
		
		System.out.println(y+z+x);
	}
	
	
}
 class Child extends Static_NonStatic_local_Var
{
	public static void main(String[] args) 
	{
		Child ob= new Child();
		System.out.println(y+ob.x);
		ob.Sum();
	}
}