package demo2;
import java.util.Scanner;
public class Fibonacciprogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
int a=0,b=1;
for(int i=1;i<=r;i++)
{
	for(int j=1;j<=i;j++) 
	{
		System.out.print(a+" ");
		int c=a+b;
		a=b;
		b=c;
    }
System.out.println();
}
//		int r=10;
//		int a=0,b=1;
//	for(int i=1;i<=r;i++)
//		{
//			System.out.print(a+" ");
//			int c=a+b;
//			a=b;
//			b=c;
//		}System.out.println();
}
}
