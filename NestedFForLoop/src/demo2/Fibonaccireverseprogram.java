package demo2;
import java.util.Scanner;
public class Fibonaccireverseprogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the r value");
		int r = sc.nextInt();
int a=0,b=1;
for(int i=r;i>=1;i--)
{
	for(int j=1;j<=i;j++) 
	{
		System.out.print(a+" ");
		int c=a+b;
		a=b;
		b=c;
	}System.out.println();
}
}

}
