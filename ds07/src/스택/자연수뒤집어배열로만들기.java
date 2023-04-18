package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 자연수뒤집어배열로만들기 {
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6};
		String[] s = String.valueOf(n).split("");
		Stack<String> stack = new Stack<>();
		for (String c : s) {
			stack.push(c);
		}
		  int[] answer = {};
		for (int i = 0; i < s.length; i++) {
				answer[i] = Integer.parseInt(stack.pop());
		}
		System.out.println(Arrays.toString(answer));
	
	}
}
