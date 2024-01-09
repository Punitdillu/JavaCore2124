package InheritanceProgram;

class Rupee
{
	public static void m1() {
		System.out.println("Rupee");
	}
}



public class Money extends Rupee {

	public static void m1() 
	{
		System.out.println("Money");
	}
	
	public static void main(String[] args) {

		m1();
	}

}
class Dollar extends Money {

	
	public static void main(String[] args) {

		m1();
	}
	

}

 
