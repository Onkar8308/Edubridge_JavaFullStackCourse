package StringChallange;

public class MixedCase {
	public static void main(String[] args) {
		 	String str = "Computer Science";
		 	str = str.trim();
		 	String lowstr ="";
		 	String upStr = "";
		 	for(int i =0;i<str.length();i++) {
		 		char ch = str.charAt(i);
		 		if(Character.isLowerCase(ch)) {
		 			lowstr = lowstr +ch;
		 		}
		 		else if(Character.isUpperCase(ch)){
		 		upStr = upStr +ch;
		 		}
		
		 	}
		 	System.out.println(lowstr + upStr);
	}

}
