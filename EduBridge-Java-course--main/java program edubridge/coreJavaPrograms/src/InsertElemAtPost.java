import java.util.Scanner;

public class InsertElemAtPost {
	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter element of array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i : arr)
			System.out.println(i);

		System.out.println("Enter pos to delete ");
		int pos = sc.nextInt();

		for (int i = pos-1; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		size = size-1;
		for (int i =0;i<size;i++)
			System.out.println(arr[i]);
	}

}
