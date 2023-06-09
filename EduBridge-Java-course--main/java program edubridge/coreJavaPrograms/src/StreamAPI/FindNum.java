//Program to find number greater than 5

package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNum {
	public static void main(String[] args) {
		List<Integer> lst =new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			lst.add(i);
		
		System.out.println(lst);
		
		
		List<Integer> evenlist = new ArrayList<>();
		//Stream<Integer> stm = lst.stream().filter(i->i>5);
		evenlist = lst.stream().filter(i->i%2==0).collect(Collectors.toList());
		long size = lst.stream().filter(i->i%2==0).count();
		System.out.println("even num "+evenlist);
		System.out.println("total number of even number is " + size);
	}

}
