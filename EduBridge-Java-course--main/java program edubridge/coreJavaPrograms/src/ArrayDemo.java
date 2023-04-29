import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
	int	arr[] =new int[5];
	System.out.println("enter the element of array");
	
	Scanner sc= new  Scanner(System.in);
	
	for(int ip=0;ip<arr.length;ip++) {
		arr[ip]=sc.nextInt();
		}
	sc.close();
	System.out.println("1st array\n");
	for(int i:arr) {
		
		System.out.println(i);
		}
	
	int arr2[]=arr.clone();  //clone is used to copy the element from one array to another
	
	System.out.println("2nd array\n");
	for(int i:arr2) {
		System.out.println(i);
	}
	
	}

}
