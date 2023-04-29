
public class NumberOfWords {
	public static void main(String[] args) {
		String s1="heyy he";
		int count=0;
			for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch==' ') {
				count++;
			}
			
		}
		if(s1.length()>0)
			System.out.println(count+1);
		else
			System.out.println(count);
	}

}
