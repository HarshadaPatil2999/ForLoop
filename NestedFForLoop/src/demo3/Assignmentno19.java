package demo3;
import java.util.Scanner;
public class Assignmentno19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r;j++)
			{
				if((i+j)%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}System.out.println();
		}System.out.println("done");

}
}
