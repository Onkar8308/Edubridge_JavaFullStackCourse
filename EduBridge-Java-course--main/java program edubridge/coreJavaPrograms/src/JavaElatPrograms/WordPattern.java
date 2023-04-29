package JavaElatPrograms;

import java.util.Scanner;

public class WordPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = "TRIAL";
		printPattern(word);
	}

	private static void printPattern(String word) {
		// TODO Auto-generated method stub
		for(int i =word.length()-1;i>=0;i--) {
			
			for(int j=i;j<word.length();j++) {	
				char ch = word.charAt(j);
				System.out.print(ch);
		
			}
			System.out.println();
		}
		
	}
}
	



