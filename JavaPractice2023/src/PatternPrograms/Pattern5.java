package PatternPrograms;

public class Pattern5 {

	public static void main(String[] args) {

		int y;
		for (int i = 1; i <= 5; i++) 
		{
			y=i;
			int x=4;
			for (int j = 1; j <= i; j++) 
			{
				
				System.out.print(y+" ");
				y+=x;
				x--;
			}
			System.out.println();
		}
	}

}

//op
//1 
//2 6 
//3 7 10 
//4 8 11 13 
//5 9 12 14 15 
