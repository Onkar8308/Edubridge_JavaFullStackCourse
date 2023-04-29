package switchCase;

import java.util.Scanner;

public class OddEvenUsing {
	public static void main(String[] args) {
		int num;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		switch(num%2) {
		case 0:
			System.out.println(num +" is even");
			break;

		case 1:
			System.out.println(num +" is odd");
			
		}
	}

}
	