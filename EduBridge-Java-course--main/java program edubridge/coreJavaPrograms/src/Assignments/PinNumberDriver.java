package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PinNumberDriver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PinNumber pn = new PinNumber();
		 pn.input();
		
		//System.out.println(num);	
	}

}

class PinNumber{
	int num2;
	public void  input() {
		List<Integer> list = new ArrayList<>();
		int totalNumbers;
		int[] num;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the total numbers of pin numbers");
		totalNumbers = sc.nextInt();
			if(totalNumbers>0) {
				System.out.println("enter the pin numbers");
			 	num = new int[totalNumbers];
			 	for(int i = 0;i<num.length;i++) {
			 		num[i]=sc.nextInt();
			 	}
			 	
			 	
			 	for(int j = 0 ; j<num.length;j++) {
			 		
			 		if(num[j]>=1000 && num[j]<=9999) {
			 			
			 			int[] number = intToArray(num[j]);
			 			if((number[0])%2!=0 &&  number[1]%2==0 && isPrime(number[2]) && isComposite(number[3]))  {
			 						//System.out.println(num[j] + " is valid pin number");
			 						list.add(num[j]);
			 			}
			 		
			 			
			 	}
			 	else	
			 			System.out.println(num[j] + " is invalid number");	
			 	}	
			}
			else
				System.out.println(totalNumbers + " is invalid pin numbers");
		
			
			if(list.size()>0) {
				System.out.println("valid Pin numbers are"
						+ "");
				for(int value :list) {
					System.out.println(value);
				}
				
			}
			else
				System.out.println("all the PIN numbers are invalid");
			
			
			
			
		 	
	}	
	private boolean isComposite(int n) {
		int count =0;
		for(int i = 1; i <= n; i++) {
	         if (n % i == 0)
	            count++;
	      }
	      if (count>=3)
	         return true;
	      else
	         return false;
	 
	}
	private static int[] intToArray(int n) { 
			int j = 0; 
			int len = Integer.toString(n).length(); 
			int[] arr = new int[len]; 
			while(n!=0) 
			{ 
				arr[len-j-1] = n%10; 
				n=n/10; 
				j++; 
			} 
			return arr; 

	}
	private static boolean isPrime(int n) {
		// TODO Auto-generated method 
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
