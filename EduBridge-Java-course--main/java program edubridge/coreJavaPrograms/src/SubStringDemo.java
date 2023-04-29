
public class SubStringDemo {
	public static void main(String[] args) {
		String demo="good morning";
		for(int i=0;i<demo.length();i++) {
			//count=count+i;
			System.out.println(demo.substring(0,i+1));	
		}
	}

}
