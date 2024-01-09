package MathematicalProgram;

public class Math123_TenPower_is3 {

	public static void main(String[] args) {

		boolean flag=true;
		int count =0;
		for (int l = 1; flag ; l++) 
		{
			
		
		int num= l;
		int temp= num;
		int x= num;

		int sum=0;
		int pow=0;
		while (x!=0) 
		{
			int rem = x%10;
			pow++;
			x=x/10;
			
		}
		while(num!=0)
		{
		int rem1=num%10;
		int y=1;
		for (int i = 1; i <=pow; i++) 
		{
			y=y*rem1;

		}
		sum=sum+y;
		num=num/10;
		}
		//System.out.println(sum);
		if(sum==temp)
		{
			System.out.println(temp+" : Number is Armstrong");
			count++;
			if(count==20)
			{
				flag=false;
			}
		}
//		else		
//		{
//			System.out.println(temp+" : Number is Not Armstrong");
//		}
		
	}
	}

}

// Question : If number = 1234 then output = 1^4+2^4+3^4+4^4 = 354
