package StreamAPI;
 interface PrintCharInterface{
	String printChar(String s);
}

public class SampleQ {
	public static void main(String[] args) {
		String b[] = {};
		PrintCharInterface p = (s1)->{
			String str="";
			for(int i=0;i<s1.length();i++) {
				 str =str +s1.charAt(i)+ " ";
			}
			return str;
		};
		System.out.println(p.printChar("capgemini"));
		
		
		
		}
}
