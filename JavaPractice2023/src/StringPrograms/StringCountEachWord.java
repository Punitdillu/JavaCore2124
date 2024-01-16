package StringPrograms;

public class StringCountEachWord {

	public static void main(String[] args) {
		
		String s="Mahabharat";
		String s1=s.toUpperCase();
		for(int i=0; i< s1.length(); i++ )
		{
			char c=s1.charAt(i);
			int count = 0;
			for (int j = 0; j < s1.length(); j++) 
			{
				char c1= s1.charAt(j);
				if(c1==c && i>j)
				{
					break;
				}
				else if(c1==c)
				{
					count++;
				}
				
			}
			if(count>0)
			{
			System.out.println(c + " : Is present "+count+" times");
			}
		}
	}
}
