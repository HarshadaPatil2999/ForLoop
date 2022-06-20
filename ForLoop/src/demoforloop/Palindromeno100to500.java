package demoforloop;

import java.util.Scanner;

public class Palindromeno100to500 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rev = 0;
		int i = 100;
		int temp=i;
for (i = 100; i <= 500; i++)
	
              {
            	   int r = i % 10;
					rev = rev * 10 + r;
					i = i / 10;
			 }
              i=temp;
               if (rev ==i)
	System.out.println(i+ "  ");
		

	}
}
