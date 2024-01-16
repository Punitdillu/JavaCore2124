package InterfacePractice;


interface Test{
	
	String NAME= "Punit Ranjan";
	
	 void m1();
	 default   void m2()
	 {
		 
	 }

		
}

public class InerFaceImplementationClass implements Test {

	public static void main(String[] args) {

		Test t = new InerFaceImplementationClass();
		t.m1();
		System.out.println(NAME);
	}

	@Override
	public void m1() {
		System.out.println("Hello interface");
	}

}
