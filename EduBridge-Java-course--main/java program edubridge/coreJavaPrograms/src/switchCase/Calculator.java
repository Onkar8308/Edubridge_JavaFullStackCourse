package switchCase;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int num1,num2,choice;
		System.out.println("enter two numbers");
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		while(true) {
			System.out.println("enter your choice"
					+ "1:addition\\t"
					+ "2:substraction\t"
					+ "3:multiplication\t"
					+ "4:division\t"
					+ "5:exit");
			
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("addition of "+ num1 +"&"+ num2+ "is " +(num1+num2));
				break;
			case 2:

				System.out.println("substraction of "+ num1 +"&"+ num2+ "is " +(num1-num2));
				break;
			case 3:

				System.out.println("multiplication of "+ num1 +"&"+ num2+ "is " +(num1*num2));
				break;
			case 4:

				System.out.println("division of "+ num1 +"&"+ num2+ "is " +(num1/num2));
				break;
			case 5:
				System.out.println("Program is terminatd !!");
				System.exit(0);
				
			}
			
		}
	}

}
