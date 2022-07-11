package demo;
import java.util.Scanner;
public class Printasamecharinrow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		char r = sc.next().charAt(0);
		for (char i='a'; i <= r; i++) {
			for (char j='a'; j<=i; j++) {
				System.out.print(i+" ");
			}	
			System.out.println();
		}
		System.out.println("done");

	}

}
