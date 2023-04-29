import java.util.Scanner;

public class PerfectSquarePgm {
	boolean result;
	public static void main(String[] args) {
		PerfectSquarePgm psp=new PerfectSquarePgm();
		int arr[]=psp.input();
		psp.display(arr);
		if(psp.isPerfectSquarre(arr)) {
			System.out.println("array is perfect square array");
		}
		else
			System.out.println("aarray is not perfect square array");
	}
	
	private boolean isPerfectSquarre(int arr[]) {
		for(int i=0;i<arr.length;i++) {
				int sr=(int) Math.sqrt(arr[i]);
				int square=sr*sr;
				result=true;
				if(square!=arr[i]) {
					result=false;
					break;
		}
				 
		}
		return result;
		// TODO Auto-generated method stub
		
	}

	public  int[] input() {
		System.out.println("enter the size of array");
		
		Scanner sc= new  Scanner(System.in);
		int size=sc.nextInt();
		int arr[]= new int[size];
		
		System.out.println("eneter element of array");
		for(int ip=0;ip<arr.length;ip++) {
			arr[ip]=sc.nextInt();
			}
		sc.close();
		return arr;	
	}
	
	public  void display(int arr[]) {
		System.out.println("array elements are");
		for(int i:arr) {
			System.out.println(i);
		}	
	}
	
	

}
