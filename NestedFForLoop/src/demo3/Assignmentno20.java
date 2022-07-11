package demo3;
import java.util.Scanner;
public class Assignmentno20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();//5
		for(int i=0;i<r;i++)//
		{
			for(int j=0;j<r;j++)//
//		{
//				if((i+j)<(r-1))
//					System.out.print("1");
//				else
//					System.out.print(i+1);
//				
//			}System.out.println();
//		}System.out.println("done");
			{
				if((i+j)<(r-1))
				{
					System.out.print("1");
				}else
					System.out.print(i+1);
			}System.out.println();
		}
}

}
