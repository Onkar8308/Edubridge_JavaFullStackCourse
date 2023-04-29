package JavaElatPrograms;

import java.util.Scanner;

public class ReverseCase {
	public static void main(String[] args) {
	 System.out.println("enter the sentence ");
	 
	 @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	 String ip = sc.next();
	 String op = "";
	 for(int i=0;i<ip.length();i++) {
		 char ch =ip.charAt(i);
		 if(Character.isUpperCase(ch)) {
			 op = op + Character.toLowerCase(ch);
		 }
		 else
			 op = op + Character.toUpperCase(ch);
	 }
	 System.out.println(op);
	}

}
