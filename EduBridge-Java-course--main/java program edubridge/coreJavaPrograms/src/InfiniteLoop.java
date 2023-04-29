

public class InfiniteLoop {

	public static void main(String[] args) {
		boolean b;
		b=false;
		b=!b;
		if(b) {
			System.out.println("inside if");
		}
	}

}
