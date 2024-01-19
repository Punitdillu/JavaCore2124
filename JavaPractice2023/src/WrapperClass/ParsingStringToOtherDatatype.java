package WrapperClass;

public class ParsingStringToOtherDatatype {

	static String s= "869";
	static int i = Integer.parseInt(s);
	static float f= Float.parseFloat(s);
	
	public static void main(String[] args) {
		
		System.out.println(i);
		System.out.println(f);
	}
}
