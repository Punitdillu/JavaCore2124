package SeriesProgramming;

public class Series0_1_1_2_3_5_8 {

	public static void main(String[] args) {

		int x=0;
		int y=1;
		int l=0;
		for (int i = 0; i < 10; i++) 
		{
			
			if(i==0)
			{
			System.out.print(x +",");
			}
			
			
			else
			{
				y=x+y;
				System.out.print(y+",");
				x=l;
				l=y;
				
				
			}
			
		}
		
	}

}
