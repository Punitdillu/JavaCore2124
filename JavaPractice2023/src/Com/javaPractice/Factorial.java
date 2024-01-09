package Com.javaPractice;


public class Factorial {

	public static void main(String[] args) {

		int x=7;
		int y=1;
		for (int i = 1; i < x+1; i++) 
		{
			y=y*i;
			
		}
		int fact=y;
		System.out.print(fact);
	}

}
