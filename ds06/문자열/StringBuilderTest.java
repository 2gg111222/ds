package 문자열;

public class StringBuilderTest {

	public static void main(String[] args) {
		String s = "pongpong";
		String s2 = "pongpong";
		System.out.println(s == s2);//주소비교
		System.out.println(s.equals(s2));//주소가 가르키는 값비교
		
		s = "hahaha";
		System.out.println( s == s2); // 주소비교
		System.out.println(s.equals(s2)); //주소가 가르키는 값비교
		// 값이 여러번 바뀔 때는 String보다 StringBuilder가 더 좋다.
		
	}

}
