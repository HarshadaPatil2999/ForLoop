package demo;

import java.util.Scanner;

public class Printalbhabates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		char r = sc.next().charAt(0);
//		for (char i = 'a'; i <= r; i++) {
//			for (char j = 'a'; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("done");
		for (char i = 'A'; i <= r; i++) {
		for (char j = r; j >= i; j--) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
	System.out.println("done");
	}

}
