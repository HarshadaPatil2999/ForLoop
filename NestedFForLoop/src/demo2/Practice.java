package demo2;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the r value");
		int r = sc.nextInt();
		int i,j;
		System.out.println("*");
		for(i=1;i<=r;i++)
		{ 
			System.out.print("*");
		     for( j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
		    System.out.print("*");
		    System.out.println();
		}
		System.out.println("done");
	}
}
