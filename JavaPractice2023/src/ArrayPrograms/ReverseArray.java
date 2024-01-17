package ArrayPrograms;

public class ReverseArray {

	public static void main(String[] args) {
		
		int x[]= {2,8,9,4,6,17};
		int y[]= new int[x.length];
		int Size=x.length;
		for (int i = 0; i < y.length; i++) {
			y[i]=x[Size-1];
			Size--;
			System.out.print(y[i]+",");
		}
	}
}
