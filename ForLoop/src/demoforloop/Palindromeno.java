package demoforloop;

import java.util.Scanner;

public class Palindromeno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter any no");
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		while (n != 0) {// 1221//122//12//1

			int r = n % 10;// r=1//r=2//2//1
			rev = rev * 10 + r;// 1//12//122//1221
			n = n / 10;// 122//12//1//0

		}
		n = temp;
		if (temp == rev)
			System.out.println("number is palindrome");
		else
			System.out.println("number is not palindrome");
	}

}
