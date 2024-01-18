package TryCatch;

public class Test {

	public static void main(String[] args) {
		
		int x=24;
		int y=0;
		int z=0;
		int a=1;
		try
		{
		z=x/y;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Exception handled");
		}
		finally {
			System.out.println(x);
		}
	}
}
