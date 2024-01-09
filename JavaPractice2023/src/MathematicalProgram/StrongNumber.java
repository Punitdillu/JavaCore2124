package MathematicalProgram;

public class StrongNumber {

	public static void main(String[] args) {

		int count=0;
		boolean flag=true;
		for (int l = 1; flag; l++) 
		{
			
		
		int num=l;
		int temp=num;
		
		int result=0;
		while (temp!=0) 
		{
			int r= temp%10;
			int fact=1;
			for (int i = 1; i <= r; i++) 
			{
				fact=fact*i;
			}
			result=result+fact;
			temp=temp/10;
		}
		if(result==num)
		{
			System.out.println(num+" : Number is strong");
			count++;
			if(count==4)
			{
				flag=false;
			}
		}
//		else
//		{
//			System.out.println(num+" : Number is not strong");
//		}
		
		}
		
	}

}
