package MathematicalProgram;

public class PelindromeNumber {

	public static void main(String[] args) {

		boolean flag=true;
		int count=0;
		for(int l =1; flag; l++)
		{
		int num=l;
		int temp= num;
		int temp1= num;
		int pow=0;
		int sum=0;
		while(temp!=0)
		{
			int rem=temp%10;
			pow++;
			temp=temp/10;
		}

		int x=0;
		while(temp1!=0)
		{
			int rem1=temp1%10;
			
			for (int i = 1; i < pow; i++) 
			{
				rem1=rem1*10;
			}
			x=x+rem1;
			temp1=temp1/10;
			pow--;
		}

		if(x==num)
		{
			System.out.println(num+" : Number is pelindrome");
			count++;
			if(count==50)
			{
				flag=false;
			}
		}
//		else
//		{
//			System.out.println(num+" : Number is not pelindrome");
//		}
		}
		
	}

}
