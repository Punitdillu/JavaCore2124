package MathematicalProgram;

public class First50PrimeNumber {

	public static void main(String[] args) {

		boolean flag = true;
		int count=0;
		for (int i = 1; flag; i++) 
		{
			int count1 = 0;
			int num = i;
		 for (int j = 1; j <=num; j++) 
		 {
			if(num%j==0)
			{
				count1++;
			}
		 }
		 if(count1==2)
		 {
			 System.out.println(num+" : Is a prime number");
			 count++;
			 if(count==50)
			 {
				 flag=false;
				 
			 }
		 }
		 
		}
	}

}
