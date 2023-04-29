import java.util.Scanner;

public class ValidationDemo {
	public static void main(String[] args) {
		String username,password;	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username and password"
				+ "\nusername:");
		username=sc.next();
		System.out.println("password:");
		password=sc.next();
		sc.close();
		if(username.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("admin123")) {
			System.out.println("log in succesfull!!");
		}
		else {
			System.out.println("sorry wrong credintial!!");
		}
		
		
	}

}
