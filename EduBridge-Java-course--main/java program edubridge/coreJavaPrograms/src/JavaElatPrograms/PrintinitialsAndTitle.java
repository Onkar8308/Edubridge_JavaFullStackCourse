package JavaElatPrograms;

public class PrintinitialsAndTitle {
	public static void main(String[] args) {
		String ip = "AJAY PRATAP SING RATHOD";
		printIntials(ip);
		
		
	}
	
	public static void printIntials(String data) {
		int len = data.length();
		String name = data.trim();
		String str = "";
		for(int i=0;i<len;i++) {
			char ch = name.charAt(i);
			if(ch != ' ') {
				str = str+ch;
			}
			else {
			System.out.print(Character.toUpperCase(str.charAt(0))+".");
			str = "";
			}
		}
		String str2 = "";
		for(int j = 0;j<str.length();j++ ) {
			if(j == 0)
				str2 = str2  +Character.toUpperCase(str.charAt(0));
			else
				str2 = str2 +Character.toLowerCase(str.charAt(j));
		}
		
		System.out.println(str2);
	}
}
