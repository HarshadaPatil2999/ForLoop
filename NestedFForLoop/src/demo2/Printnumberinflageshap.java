package demo2;

import java.util.Scanner;

public class Printnumberinflageshap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
		for (int i = 1; i <= r; i++) {
			for (int j = i; j <= r; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 1; i<=r-1; i++) {
			for (int j = r - i; j <= r; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
