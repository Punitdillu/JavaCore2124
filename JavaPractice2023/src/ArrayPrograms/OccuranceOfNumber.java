package ArrayPrograms;

public class OccuranceOfNumber {

	public static void main(String[] args) {
		
		int x[]= {3,7,8,2,4,3,9,2,4,10};
		for (int i = 0; i < x.length; i++) 
		{
			int count=0;
			int j;
			for ( j = 0; j < x.length; j++) 
			{
				if(x[i]==x[j] && i>j)
				{
					break;
				}
				 if(x[i]==x[j])
				{
					count++;
				}
			}
			if(count>0) {
			System.out.println(x[i]+" is present "+ count+" times");
			}
			
		}
	}
}
