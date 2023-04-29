import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		int count=1;
		PrimeNumber pn = new PrimeNumber();
		Set<Integer> set = new TreeSet<Integer>();
		for(int i =100;i>=0;i--) {
			if(count<=5) {               
			if(pn.isPrime(i)) {
				set.add(i);
				count++;
				}
			}
		}
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
		
	}

}

class PrimeNumber{
	public boolean isPrime(int n){
		if ( n <= 1)
            return false;
 
   
        else if (n == 2)
            return true;
 
        else if (n % 2 == 0)
            return false;
 
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
		
		
	}
}
