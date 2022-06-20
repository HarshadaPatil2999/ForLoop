package demoforloop;
import java.util.Scanner;
public class pelidromedemo1 {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);

			int first,mid,second,last;
			
			
	for (int i = 100; i <=500; i++)
	
	
			{
	        first=i%10;
	         mid=i/10;
	        second=mid%10;
	         last=mid/10;
	         if(first==last)
	  	   {
	  		   System.out.println(i+" ");
	  	   }
	  	
		    }
	  
	
	}

}
