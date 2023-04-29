import java.util.Scanner;

public class ArrayOperations {
	public static void main(String[] args) {
		System.out.println("enter the size of array");
		
		Scanner sc= new  Scanner(System.in);
		int size=sc.nextInt();
		int arr[]= new int[size];
		
		System.out.println("eneter element of array");
		for(int ip=0;ip<arr.length;ip++) {
			arr[ip]=sc.nextInt();
			}
		sc.close();
		
		System.out.println("array elements are");
		for(int i:arr) {
			System.out.println(i);
		}
		
		int sum=0;
		for(int i:arr) {
			sum=sum+i;
		}
		System.out.println("sum of all element of array is " +sum);
		
		System.out.println("average of element ="+((float)sum/size));
		
		int max=arr[0];
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}
		System.out.println("largest element of array is "+max);
	}

}
