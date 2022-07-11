package demo2;

import java.util.Scanner;

public class Assignmentque4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
		for (int i = 1; i <= r; i++) {
			for (int k = r; k >= i; k--) {
				System.out.print("");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "");
			}
			for (int m = i - 1; m >= 1; m--) {
				System.out.print(m + "");
			}
			System.out.println();
		}

		for (int i = r-1; i >= 1; i--) {
			for (int k = r; k >= i; k--) {
				System.out.print("");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "");
			}
			for (int m = i - 1; m >= 1; m--) {
				System.out.print(m + "");
			}
			System.out.println();
		}

	}

}
