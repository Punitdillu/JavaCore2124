package PatternPrograms;

public class Pattern7 {

	public static void main(String[] args) {

		int space=0;
		int star=5;
		
		for (int i = 1; i <= 5; i++) 
		{
			

			int x=1;
			
			
			for (int j = 1; j <=space; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <=star; k++) 
			{
				System.out.print(x++);
			}
			space++;
			star--;
			System.out.println();
		}
	}

}
//12345
// 1234
//  123
//   12
//    1
