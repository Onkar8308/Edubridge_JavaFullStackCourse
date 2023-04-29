package switchCase;

import java.util.Scanner;

public class CheckVowelOrConsonent {
	public static void main(String[] args) {
		char input;
		System.out.println("enter character from a-z");
		Scanner sc = new Scanner(System.in);
		input=sc.next().charAt(0);
		
		switch(input) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(input+" is vowel");
			break;

		default:
			System.out.println("character "+input +" is consonant");
			}
		
	}

}
