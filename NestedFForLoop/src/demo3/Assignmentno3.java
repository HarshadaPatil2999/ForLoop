package demo3;
import java.util.Scanner;
public class Assignmentno3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();//5
		for(int i=1;i<=r;i++)//
		{
			for(int j=1;j<=(i*2)-1;j++)//
			{
			System.out.print(j);
			}
			System.out.println();
		}for(int i=r-1;i>=1;i--)//
		{
			for(int j=1;j<=(i*2)-1;j++)//
			{
			System.out.print(j);
			}
			System.out.println();
		}System.out.println("done");
}


}