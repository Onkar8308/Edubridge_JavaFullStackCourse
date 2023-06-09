package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArrangeSent{

	public List<String> arrangedSent(String line) {
		// TODO Auto-generated method stub
			List<String> list = new ArrayList<>();
			String str = " ";
			for(int i = 0;i<line.length();i++) {
				while(line.charAt(i) !=' ' )
					str = str + line.charAt(i);
				System.out.println(str);
			
				
			}
			list.add(str);
			return list;
	}
	
}

public class SentenceArrange {
	public static void main(String[] args) {
		System.out.println("Enter the line");
		Scanner sc = new Scanner(System.in);
		String line = sc.next();	
		
		
		ArrangeSent obj = new ArrangeSent();
		System.out.println(obj.arrangedSent(line));
		
	}

}
