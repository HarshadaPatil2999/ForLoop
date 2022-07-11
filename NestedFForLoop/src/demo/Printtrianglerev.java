package demo;

import java.util.Scanner;

public class Printtrianglerev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
		for (int i = r; i>=1; i--)
		{ 
			for (int k = r; k>i; k--)
		{
			System.out.print(" ");
		}
			
              for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			} 
             

			System.out.println( );

		}
		System.out.println("done");

	}

}
