
//Program for find the vowel in the String
public class FindVowelInString {
	public static void main(String[] args) {
		String S="hello world";
		System.out.println("length ="+S.length());
		for(int i=0;i<S.length();i++) {
			char ch=S.charAt(i);
			if(ch=='i'||ch=='o'||ch=='u'||ch=='a'||ch=='e') {
				System.out.println(ch);
			}
		}
	}

}
