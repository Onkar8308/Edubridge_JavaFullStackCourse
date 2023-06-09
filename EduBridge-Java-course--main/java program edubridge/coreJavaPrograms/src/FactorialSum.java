
public class FactorialSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=10;
		int i=1;
		double fact=1;
		double res=0;
		while(i<=N) {
			fact=fact*i;
			res=res+(double)(i/fact);
			i++;
		}
		System.out.println("sum :"+fact);
	}	

}
