package demo2;

import java.util.Scanner;

public class Assignmentque9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
		for (int i = r; i >= 1; i--) {
			for (int k = 1; k <= r - i; k++) {
				System.out.print(" ");
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
