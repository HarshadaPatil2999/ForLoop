package demo;

import java.util.Scanner;

public class Demo1numberis0and1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0)
					System.out.print("0"+" ");
				else
					System.out.print("1"+" ");
			}
			System.out.println( );
		}
		System.out.println("done");

	}
}
