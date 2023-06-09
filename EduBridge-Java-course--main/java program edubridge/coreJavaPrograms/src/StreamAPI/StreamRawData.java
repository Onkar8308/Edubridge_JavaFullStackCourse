package StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamRawData {
	public static void main(String[] args) {
		Stream<Integer> rd = Stream.of(1,5,4,7);
		//We can access one stream at once this is limitation of java 
	//	rd.forEach(i->System.out.println(i));
		
		int[] a = {1,2,3,4};
		Stream<int[]> stm = Stream.of(a);
		
		Arrays.stream(a).forEach(i->System.out.println(i+  " "));
	}

}
