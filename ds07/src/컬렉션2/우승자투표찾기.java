package 컬렉션2;

import java.util.HashMap;

public class 우승자투표찾기 {

	public static void main(String[] args) {
		String[] all = {"홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동"};
		String[] find = {"홍길동", "김길동", "정길동"};
		
		HashMap<String, Integer> map = new HashMap<>();
		// key 타입 value 타입
		
		for (String x : find) {
			map.put(x, 0); //명단에 map을 넣자
		}
		System.out.println(map);
		System.out.println(map.get("홍길동")); //get(key) -> value
		System.out.println(map.get("홍길동") + 1); 
		//map.put("홍길동", 10) //같은 key로 다시 put하면 덮어씀
		for (String x : all) {
			//System.out.println(map.get(x));
			map.put(x, map.get(x) + 1);
		}
		System.out.println(map);
		int max = 0;
		for(String key : map.keySet()) { //key의 목록을 구해서,
			System.out.println(key + ": " + map.get(key));
			if (map.get(key) > max) {
				max = map.get(key);
				System.out.println("현재까지 우승자" + key);
			}
		}
	}
}
