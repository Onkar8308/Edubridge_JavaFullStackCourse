package switchCase;

import java.util.Scanner;

public class switchDemo {

	public static void main(String[] args) {
		int value;
		System.out.println("please select number from 1 to 7");
		//@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		value=sc.nextInt();
		// TODO Auto-generated method stub
		switch(value) {
		
		case 1:
			System.out.println("its Sunday");
			break;
		case 2:
			System.out.println("its Monday");
			break;
		case 3:
			System.out.println("its Tuesday");
			break;
			
		case 4:
			System.out.println("its wednesday");
			break;
			
		case 5:
			System.out.println("its thursday");
			break;
			
		case 6:
			System.out.println("its friday");
			break;
			
		case 7:
			System.out.println("its saturday");
			break;
			
		default:
				System.out.println("wrong choice! "+value +" \nplease select number from 1 to 7");
				break;
		
		}
	}

}
