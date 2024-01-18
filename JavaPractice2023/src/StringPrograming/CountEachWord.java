package StringPrograming;

public class CountEachWord {

	public static void main(String[] args) {
		
		String s="Today is a good day and tomorrow will be also a good day";
		String s1=s.toUpperCase();
		String x[]= s1.split(" ");
		
		for (int i = 0; i < x.length; i++) 
		{
			int count=0;
			for (int j = 0; j < x.length; j++) 
			{
				if(x[i].equals(x[j]) && i>j )
				{
					break;
				}
				if(x[i].equals(x[j]))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(x[i]+ " is present " +count+ " times");
			}
			
		}
	}
}
