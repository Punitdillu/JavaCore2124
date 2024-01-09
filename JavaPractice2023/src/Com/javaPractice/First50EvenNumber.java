package Com.javaPractice;


public class First50EvenNumber {

	public static void main(String[] args) {
		boolean flag = true;
		int count=0;
		
		for (int i = 0;  flag; i++) 
		{
			if(i%2==0)
			{
				System.out.print(i+",");
				count++;
			}
			if(count==50)
			{
				flag=false;
			}
		}
	}

}
