package MathematicalProgram;

public class SumOfDigitsSquare {

	public static void main(String[] args) {

		int x=222;
		int sum=0;
		while (x!=0) 
		{
			int rem= x%10;
			
			sum=sum+(rem*rem);
			x=x/10;
		}
		System.out.println(sum);
	}

}
