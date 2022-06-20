package demoforloop;

import java.util.Scanner;

public class Breakinforloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter any no");
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			int p = n * i;
			{
				if (i == 5)
					break;
			}
			System.out.println(p);
		}

	}

}
