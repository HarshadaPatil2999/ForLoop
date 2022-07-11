package demo;

import java.util.Scanner;

public class Characterindifferentshape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		char r = sc.next().charAt(0);
		for (char i = r; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (char i = 'a'; i <= r; i++) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
