package BlocksPrograms;

public class Block {

	static int x=10;
	{
		{
			{
				x=40;
			}
		}

	}
	public static void main(String[] args) {

		Block b= new Block();
		System.out.print(b.x);
	}
	

}
