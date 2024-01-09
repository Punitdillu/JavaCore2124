package Com.javaPractice;

public class First50PrimeNumber {

	public static void main(String[] args) {

		boolean flag=true;
		long count = 0;
		
		for (long i = 1; flag; i++) {
			long count1 = 0;

			for (long j = 1; j <= i; j++) {

				if (i % j == 0) {
					count1++;
				}

			}

			if (count1 == 2) {
				System.out.print(i + ",");
				
				count++;
			}
			if (count == 50) {
				flag = false;
			}

		}
	}

}
