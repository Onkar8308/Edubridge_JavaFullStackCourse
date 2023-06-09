public class NumberPattern {
	public static void main(String[] args) {
	//	System.out.println("");
		int row = 4;
		
		for(int i = 1;i<=row;i++) {
			int n = i;
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n = (n + (row-j)); 
			}
			System.out.println();
		}
	}

}
