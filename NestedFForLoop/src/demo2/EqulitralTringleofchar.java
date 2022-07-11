package demo2;

import java.util.Scanner;

public class EqulitralTringleofchar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		char r = sc.next().charAt(0);

		for (char i = 'A'; i <= r; i++)
		{
			for (char k =r; k >=i; k--)
			{
				System.out.print(" ");
			}

			for (char j = 'A'; j <= i; j++)
			{
				System.out.print(j +" ");

			}
			System.out.println();
		}
	}

}
