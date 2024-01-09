package SeriesProgramming;

public class SeriesSum {

	public static void main(String[] args) 
	{
		int sum=0;
		int n=2;
		for (int i = 1; i < 11; i++) 
		{
			sum=sum+((n*n)/i);
			System.out.println(sum);

		}

		System.out.println(sum);
	}

}
