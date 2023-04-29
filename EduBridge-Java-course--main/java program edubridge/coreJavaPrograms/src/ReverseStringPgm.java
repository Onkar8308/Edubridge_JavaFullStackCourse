
public class ReverseStringPgm {
	public static void main(String[] args) {
		String name="Onkar";
		System.out.println("Original String = "+name);
		for(int i=name.length()-1;i>=0;i--) {
		char ch=name.charAt(i);
		System.out.print(ch);
		}
	}

}
