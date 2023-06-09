package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMapEx {
	
	public static void main(String[] args) {
			List<String> lst = new ArrayList<>();
			String str;
			lst.add("onkar ");
			lst.add("Anannya");
			lst.add("ash");
			
			String str2 = "";
			
			System.out.println(lst);
//			
//			for(String i: lst) {
//				i.toUpperCase();
//			}
			
			List<String> ulist = new ArrayList<>();
			
			ulist = lst.stream().map(uname->uname.toUpperCase()).collect(Collectors.toList());
			

			List<String> ulst = new ArrayList<>();
			ulst= lst.stream().filter(name->(name.length())>4).map(uname->uname.toUpperCase()).collect(Collectors.toList());
			
			
			//ulist.stream().forEach(name->System.out.println(name));
			
			System.out.println(ulst +"\n" 
					+ "total number of name with size greater than 4 is " + ulist.size());
	}
	

}
