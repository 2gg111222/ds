package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("honghong");
		System.out.println(sb1);
		
		StringBuilder sb11 = new StringBuilder("honghong");
		System.out.println(sb11);
		
		StringBuilder sb2 = new StringBuilder("honghong");
		System.out.println(sb1 == sb2);
		sb1.append("hahaha");
		System.out.println(sb1);
		sb1.replace(0, 8, "hohohoh"); // 파괴형함수
		System.out.println(sb1);
		sb1.delete(0, 8);
		System.out.println(sb1);
		sb1.deleteCharAt(3);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		String s = "pongpong";
		
		String[] s2 = s.split("");
		List<String> list = Arrays.asList(s2);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
