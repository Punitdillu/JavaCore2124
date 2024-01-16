package StringPrograms;

public class StringPelindrome {

	public static void main(String[] args) {
		
		String s= "Malayalam";
		String s1= s.toUpperCase();
		String rev="";
		for (int i = s1.length()-1; i >=0 ; i--) {
			
			rev=rev+s1.charAt(i);
		}
		if(rev.equals(s1))
		{
			System.out.println("String is pelindrome");
		}
		else
		{
			System.out.println("String is not pelindrome");
		}
	}
}
