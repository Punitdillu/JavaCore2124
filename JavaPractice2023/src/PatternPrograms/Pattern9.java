package PatternPrograms;

public class Pattern9 {

	public static void main(String[] args) {

		int space=3;
		int star=1;
		for (int i = 0; i < 7; i++) 
		{
			
			for (int j = 0; j < space; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) 
			{
				System.out.print("*");

			}
			System.out.println();
			if(i<3)
			{
				star+=2;
				space--;
			}
			else
			{
				star-=2;
				space++;
			}
			
		}
	}

}
//op
//   *
//  ***
// *****
//*******
// *****
//  ***
//   *
