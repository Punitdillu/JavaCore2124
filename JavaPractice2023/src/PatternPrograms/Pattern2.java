package PatternPrograms;

public class Pattern2 {

	public static void main(String[] args) {

		int k=5;
		for (int i = 0; i < 5; i++) 
		{
			int k1=5;
			for (int j = 0; j < k; j++) 
			{
				
				System.out.print(k1);
				k1--;
			}
			System.out.println();
			k--;
		}
	}

}
//Output
//54321
//5432
//543
//54
//5