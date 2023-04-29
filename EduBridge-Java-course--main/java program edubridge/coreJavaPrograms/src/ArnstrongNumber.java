import java.util.Scanner;

public class ArnstrongNumber {
	public static void main(String[] args) {
		System.out.println("enter number to check it is armstrong number or not");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int temp,sum=0,org=num;
		while(num>0) {
			temp=num%10;
			sum=sum+temp*temp*temp;
			num=num/10;
		}
		if(org==sum) {
			System.out.println(org +" is armstrong number");
		}
		else
		System.out.println(org +" is not armstrong number");
	}
}
