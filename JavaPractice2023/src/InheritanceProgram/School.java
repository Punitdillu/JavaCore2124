package InheritanceProgram;

class Isce 
{
	 public  void m1() 
		{
			System.out.println("School is  closed");
		}
	 
	 
}
class Cbse extends Isce
{
	 public  void m1() 
		{
			System.out.println("School is Not Open");
		}
	 
	 
}
public class School extends Cbse {

	public  void m1() 
	{
		System.out.println("School is Open");
	}
	public static void main(String[] args) 
	 {
		School s = new School();
		Cbse c = new Cbse();
		Isce i = new Isce();
		
		s.m1();
		c.m1();
		i.m1();
	}
}

 
