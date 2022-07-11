package demo2;
import java.util.Scanner;
public class Assignmentno15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
		for (int i = 1; i <= r ; i++) {
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(" ");
			}
			for (int j = i; j <= r; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = r-1; i >= 1; i--) {
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(" ");
			}
			
			for (int j = i; j <= r; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
