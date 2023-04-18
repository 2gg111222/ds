package 스택;

import java.util.EmptyStackException;
import java.util.Stack;

public class 스택확인문제_백준 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.empty()? 1:0);
		try {
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());

		} catch (EmptyStackException e) { //모두 아우르는 것은 Exception e
			System.out.println(-1);
		}
		stack.push(3);
		System.out.println(stack.empty()? 1:0);
		System.out.println(stack.peek());
	}
}
