package demo;

import java.util.Scanner;

public class Printstarrightside {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
		for (int i = 1; i <= r; i++) {
			for (int k = 1; k <= (r - i); k++)
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