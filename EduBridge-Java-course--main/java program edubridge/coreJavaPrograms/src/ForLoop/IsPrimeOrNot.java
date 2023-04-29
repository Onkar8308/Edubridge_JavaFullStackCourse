
package ForLoop;

import java.util.Scanner;

public class IsPrimeOrNot {
	public static void main(String[] args) {
		int count=0;
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int ip=sc.nextInt();
		for(int i=1;i<=ip;i++) {
			if(ip%i==0) {
				count++;
			}	
		}
		if(count==2) 
			System.out.println(ip + " is prime number");
		else
			System.out.println(ip + " is not prime number");
			
	}
}
