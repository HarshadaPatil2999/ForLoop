package demoforloop;

import java.util.Scanner;

public class Productofdigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter any no");
		int n = sc.nextInt();
		int product = 1;

		while (n != 0) {//1234//123//12//1

			int r = n % 10;//r=4//r=3//2//1
			product = product * r;//4//12//24//24
			n = n / 10;//123//12//1//0

		}
		System.out.println("product of digit:" + product);
	}

}
