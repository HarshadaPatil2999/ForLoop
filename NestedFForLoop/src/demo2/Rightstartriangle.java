package demo2;
import java.util.Scanner;
public class Rightstartriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print( "* ");
			}
			System.out.println();
		}
		for (int i = r ; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print( "* ");
			}
			System.out.println();
		}
		System.out.println("done");
		
	}


}
