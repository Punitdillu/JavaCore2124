package ConstructorProgram;

public class ConsTruck {

	ConsTruck()
	{
		this(10);
		System.out.println("Without Argument");
	}
	ConsTruck(int i)
	{
		this(10,2);
		System.out.println(i);
	}
	ConsTruck(int i, int y)
	{
		this("Ram");
		System.out.println(i+y);
	}
	ConsTruck(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args) {

		ConsTruck con = new ConsTruck();
	}

}
