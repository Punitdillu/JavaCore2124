package ConstructorProgram;

import java.util.Scanner;

public class Construck1 {

	int num;
	Construck1(int num)
	{
		this.num=num;
		
	}
	public void name(int num) 
	{
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(num+this.num);

		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value");
		int x = s.nextInt();
		Construck1 c= new Construck1(x);
		Construck1 c1= new Construck1(30);
		Construck1 c2= new Construck1(40);
		c.name(30);
		c.name(40);
		c.name(50);

	}

}
