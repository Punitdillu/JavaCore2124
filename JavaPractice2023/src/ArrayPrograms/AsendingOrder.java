package ArrayPrograms;

public class AsendingOrder {

	public static void main(String[] args) {
		
		int a[]= {2,3,8,4,0,1,13,10};
		int temp;
		for (int i = 0; i < a.length; i++) 
		{
			
			for (int j = i+1; j < a.length; j++) 
			{
				//Descending order ascending(if(a[i]>a[j]))
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}

			}
			System.out.print(a[i]+",");

		}
	}
}
