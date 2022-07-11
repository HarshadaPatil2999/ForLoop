package demo2;
import java.util.Scanner;
public class Diamondnumberpatternwithstarboarder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
		System.out.println("*");
		for (int i = 1; i <= r; i++) 
		{
			System.out.print("*");
			for (int j = 1; j <= i; j++)
			{
				
			 System.out.print(j+"");
			}
			for (int m = i - 1; m >= 1; m--)
			{
				System.out.print(m+"");
			}
				System.out.print("*");
			    System.out.println();
		}

		for (int i = r-1; i >= 1; i--)
		{
			System.out.print("*");
			for (int j = 1; j <= i; j++)
			{
				
					
				System.out.print(j+"");
			}
			for (int m = i - 1; m >= 1; m--)
			{
				System.out.print(m+"");
			}
			System.out.print("*");
			System.out.println();
		}		
}
}
