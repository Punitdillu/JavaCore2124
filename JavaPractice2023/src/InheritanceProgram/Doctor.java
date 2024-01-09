package InheritanceProgram;

class OrthoPadic
{
	static float Bonus =9000;
	static{
		System.out.println("EFGH");

	}
}
class Surgeon extends OrthoPadic
{
	static float Salary = 50000 + Bonus;
	static 
	{
		System.out.println("ABCD");

	}
}
public class Doctor extends Surgeon {

	
	public static void main(String[] args) {

		
		System.out.println(Salary);
		System.out.println(Bonus);

	}
	static 
	{
		System.out.println("XYZ");

	}

}
