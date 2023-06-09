import java.util.Scanner;

public class ReverseStringPgm {
	public static void main(String[] args) {
		System.out.println("Enter String : ");
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		System.out.println("Original String = "+name);
		System.out.print("reverse String is :");
		for(int i=name.length()-1;i>=0;i--) {
		char ch=name.charAt(i);
		System.out.print(ch);
		}
	}

}
