import java.util.Scanner;

public class NextPalindroneNumber {
	public static void main(String[] args) {
		PalindroneNum pn = new PalindroneNum();
		int ip =pn.input();
		int num =ip +1;
		while(!pn.isPalindrome(num)) {
			num = num + 1;
		}
		System.out.println("next palindrone number is "+ num);
	}
}
class PalindroneNum{
	public int input() {
		System.out.println("Enter any palindrone number");
		Scanner sc = new Scanner(System.in);
		int ip = sc.nextInt();
		return ip;
	}

	public boolean isPalindrome(int num) {
		int org = num,remainder,rev = 0;
		while(num != 0) {
			remainder = num % 10;
			rev = ( rev *10) + remainder;
			num = num /10;
		}
		if(org == rev)
			return true;
		else
			return false;
		
	
	}
	
	}

