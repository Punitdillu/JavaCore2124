package StringPrograming;

public class StringCountAlpabet {

	public static void main(String[] args) {
		String str1="My Name Is Punit Ranjan";
		String str2= str1.toLowerCase();
		for (int i = 0; i < str1.length(); i++) 
		{
			char alpha = str2.charAt(i);
			int count=0;
			for (int j = 0; j < str1.length(); j++) 
			{
				char alpha2 = str2.charAt(j);
				if( alpha2 == alpha)
				{
					count++;
				}
			}
			System.out.println(alpha+" is present "+count+" Times in "+str2);

		}

	}

}
