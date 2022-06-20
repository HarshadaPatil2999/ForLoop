package demoforloop;

import java.util.Scanner;

public class Countnumberofdigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter any no");
		int n = sc.nextInt();
		int count = 0;
		while (n != 0) { 

			n = n/10;
			count++;

		}
		System.out.println("number of digit:" + count);

	}
}
