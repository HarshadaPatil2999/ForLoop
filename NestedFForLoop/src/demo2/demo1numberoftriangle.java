package demo2;

import java.util.Scanner;

public class demo1numberoftriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
		for (int i = 1; i <= r;i++)
		{
			for(int a=1;a<=r-i;a++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++)
			{
				System.out.print(j+" ");
			}System.out.println();
		}
		

		
	}

}
