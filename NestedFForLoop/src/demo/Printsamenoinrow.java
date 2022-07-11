package demo;

import java.util.Scanner;

public class Printsamenoinrow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
		for (int i=1; i <= r; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}	
			System.out.println();
		}
		System.out.println("done");

	}

}
