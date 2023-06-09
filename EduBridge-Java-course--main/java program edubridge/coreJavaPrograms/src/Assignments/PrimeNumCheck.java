package Assignments;

import java.util.Scanner;

class PrimeNum{

	public int input() {
		// TODO Auto-generated method stub
		System.out.println("Enter Number");
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	public boolean checkPrime(int num) {
		//checking for corner casses
		if(num <= 1)
			return false;
		//two is even prime num
		else if(num ==2)
			return true;
		else if(num%2  == 0)
			return false; 
		
		for(int i =3;i<=Math.sqrt(num);i+=2) {
			if(num %i ==0)
				return false;
		}
		// TODO Auto-generated method stub
		return true;
		
	}
	
}

public class PrimeNumCheck {
	public static void main(String[] args) {
	PrimeNum p = new PrimeNum();
	//int num = p.input();
	for(int i =0;i<=100;i++)
	if(p.checkPrime(i))
		System.out.println(i);
	}

}
