
public class ArmstrongNumber1_100 {
public static void main(String[] args) {
	int temp,sum=0,b,i=1;
	for(i=1;i<=1000;i++) {
		b=i;
		while(b>0) {
			temp=b%10;
			sum=sum+temp*temp*temp;
			b=i/10;
			
			b++;
			if(sum==i) {
				System.out.println(i);
			}
			
		}
		
	}
	
}
}
