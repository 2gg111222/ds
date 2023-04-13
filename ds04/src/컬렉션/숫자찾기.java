package 컬렉션;

import java.util.ArrayList;
import java.util.stream.Stream;

import javax.jws.Oneway;
public class 숫자찾기 {

	public static void main(String[] args) {
		int num = 12345;
		int[] num1 = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
		
		for (int i : num1) {
			if (i == k) {
				answer = i.length;
			}else {
				answer = -1;
			}
		}
		
	}




}	
