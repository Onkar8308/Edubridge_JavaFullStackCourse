package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EvenOddPgm {
	public static void main(String[] args) {
		
		int size,even=0,odd=0;;
		
		System.out.println("enter the size of arraylist");
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		
		System.out.println("enter the numbers");
		ArrayList<Integer> list =new ArrayList<>();
		
		for(int i=0;i<size;i++) {
		int ip=sc.nextInt();
		list.add(ip);
		
		}
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			int i=it.next();
			if(i%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		
		System.out.println("number of even "+even);
		System.out.println("\nnumber of odd "+odd);
	}

}
