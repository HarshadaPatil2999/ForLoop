package demo3;
import java.util.Scanner;
public class Assignmentno21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
		for(int i=0;i<=r;i++)
		{
			for(int j=0;j<=r;j++)
			{
				if(i==j)
					System.out.print(i+"");
				else
					System.out.print("0");
			}System.out.println( );
		}System.out.println("done");

}

}
