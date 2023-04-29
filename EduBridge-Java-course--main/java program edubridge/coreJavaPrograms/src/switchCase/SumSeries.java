package switchCase;

public class SumSeries {
	public static void main(String[] args) {
		float sum=0;
		int d=2;
		int i=1;
		while(i<=10) {
			if(i%2==0)
				sum-=((float)1/d); //3
			else
				sum+=((float)1/d);
			i++;
			d=d+2;
		}

		System.out.println("sum="+sum);
	}

}
