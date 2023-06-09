import java.util.Scanner;

public class NextPrimeNum {
	public static void main(String[] args) {
		Prime p = new Prime();
		int ipData = (p.inputData()+1);
		while(!p.isPrime(ipData)) {
			ipData = ipData + 1;
		}
		System.out.println("next prime number is "+ ipData);
	}

}
class Prime{

	public int inputData() {
		System.out.println("Enter Prime number");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ip = sc.nextInt();
		return ip;
	}

	public boolean isPrime(int ip) {
		int count = 0;
		// TODO Auto-generated method stub
		for(int i=1;i<=ip;i++) {
			if(ip%i==0) {
				count++;
			}	
		}
		if(count==2) 
			return true;
		else
			return false;
			
	}
	
}
