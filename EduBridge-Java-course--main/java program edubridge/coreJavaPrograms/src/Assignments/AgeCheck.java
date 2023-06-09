package Assignments;

import java.util.Scanner;

class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}

class Source{

	public void checkAge(int age) throws MyException {
		// TODO Auto-generated method stub
		if(age<15) {
			throw new MyException("age of person should be abpove 15");
		}
		else
			System.out.println("valid");
		
	}
	
}

public class AgeCheck {
	public static void main(String[] args) throws MyException {
		System.out.print("enter age :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		Source s = new Source();
		s.checkAge(age);
		
	}

}
