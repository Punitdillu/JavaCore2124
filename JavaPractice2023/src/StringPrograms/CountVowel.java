package StringPrograms;

public class CountVowel {

	public static void main(String[] args) {
		
		String s= "Education";
		String s1= s.toUpperCase();
		String vowel = "AEIOU";
		
		for (int i = 0; i < vowel.length(); i++)
		{
			int count=0;
			char c= vowel.charAt(i);
			for (int j = 0; j < s1.length(); j++) 
			{
				
				char c1= s1.charAt(j);
				if(c==c1)
				{
					count++;
				}
			}
			System.out.println(c+" is present "+count+" times");
		}
	}
}
