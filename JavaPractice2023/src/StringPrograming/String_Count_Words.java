package StringPrograming;

public class String_Count_Words {

	public static void main(String[] args) 
	{
		String str1="Every Day is a Good Day And Good Day is Not a Normal Day";
		String str2=str1.toLowerCase();
		String[] str3=str2.split(" ");

		for (int i = 0; i < str3.length; i++) 
		{
		String word=str3[i];
		int count=0;
		for (int j = 0; j < str3.length; j++) 
		{
			if(str3[j].equals(word))
			{
				count++;
			}
		}
		System.out.println(word+" is present "+count);
		}
		
	}

}
/*
 * every is present 1 day is present 4 is is present 2 a is present 2 good is
 * present 2 day is present 4 and is present 1 good is present 2 day is present
 * 4 is is present 2 not is present 1 a is present 2 normal is present 1 day is
 * present 4
 */
