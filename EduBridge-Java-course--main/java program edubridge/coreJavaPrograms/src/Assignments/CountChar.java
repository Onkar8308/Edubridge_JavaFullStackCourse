package Assignments;

import java.util.Scanner;

class Source2{

	public void countChars(char[] ch) {
		for(int i=0;i<ch.length;i++) {
			//counter;	
		}
//		for(int i =0;i<ch.length;i++) {
//			for(int j  =0;j<=i;j++) {
//				
//			}
//		}
		// TODO Auto-generated method stub
		
	}
	
}

public class CountChar {
	public static void main(String[] args) {
		Source2 s = new Source2();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string");
		String s1= sc.next();
		char[] ch = s1.toCharArray();
		System.out.println( s1.length());;
	}

}
