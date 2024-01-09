package PatternPrograms;

public class Pattern4 {

	public static void main(String[] args) {

		int k=0;
		int x;
		for (int i = 1; i <= 5; i++) 
		{
			k=k+i;
			x=k;
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(x+" ");
				x--;
			}
			
			
			System.out.println();
		}
	}

}
//output
//1 
//3 2 
//6 5 4 
//10 9 8 7 
//15 14 13 12 11 
