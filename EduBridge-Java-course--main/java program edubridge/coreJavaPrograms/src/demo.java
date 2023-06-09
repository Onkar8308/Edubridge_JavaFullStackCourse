import java.util.Scanner;

interface validate{
	boolean isValid(String firstName,String lastname);
}
public class demo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		String password = sc.next();
		System.out.println(demo.demo1(username,password));
	}
	static boolean demo1(String username,String password) {
		validate v = (firstName,lastName) ->{
			return firstName.equals("ABC") && lastName.equals("DEF");
		};
		return v.isValid(username, password);
	}


}
