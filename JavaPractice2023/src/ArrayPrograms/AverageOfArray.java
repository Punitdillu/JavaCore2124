package ArrayPrograms;

public class AverageOfArray {

	public static void main(String[] args) {
		
		int x[]= {2,5,6,2,5};
		int sum=0;
		int TotalNo =0;
		float average;
		for (int i = 0; i < x.length; i++) 
		{
			
			sum=sum+x[i];
			TotalNo++;
		}
		average=sum/TotalNo;
		System.out.println(average);
	}
}
