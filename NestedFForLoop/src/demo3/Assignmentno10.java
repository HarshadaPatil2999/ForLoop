package demo3;

import java.util.Scanner;

public class Assignmentno10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();

		for (int i = r; i >= 1; i--)

		{
			for (int k = 1; k<=i; k++)
			{
				System.out.print(" ");
			}
			for (int j = i; j <= r; j++) 
			{
				System.out.print(j+"");
			}
			for (int m = r - 1; m >= i; m--) 
			{
				System.out.print(m+"");
			}
			System.out.println();
		}
	}

}
