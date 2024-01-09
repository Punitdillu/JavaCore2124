package StringPrograming;

public class String_Reverse_Each_Word {

	public static void main(String[] args) {

		String str1="MyFull Name Is Punit Ranjan";
		String[] str2=str1.split(" ");
		for (int i = 0 ; i<str2.length ; i++) 
		{
			
			String word= str2[i];
		if(i==0)
		{
			for (int j = word.length()-1; j >=0 ; j--) 
			{
				System.out.print(word.charAt(j));
			}
			System.out.print(" ");
		}
		else {
			for (int j = 0; j <=word.length()-1 ; j++) 
			{
				System.out.print(word.charAt(j));
			}
			System.out.print(" ");
		}

		}
	}
//op : yM emaN sI tinuP najnaR
}
