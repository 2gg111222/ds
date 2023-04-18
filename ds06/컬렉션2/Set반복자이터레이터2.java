package 컬렉션2;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자이터레이터2 {
	public static void main(String[] args) {
		HashSet<String> bag = new HashSet<>();
		bag.add("휴대폰");
		bag.add("휴대폰");
		bag.add("휴대폰");
		System.out.println(bag.size());
		System.out.println(bag);
		
		//set에서 꺼내올 때는 iterator를 만들어주어야 한다.
		Iterator<String> it = bag.iterator();
		System.out.println(it.hasNext());
		for(int i = 0; i <bag.size(); i++) {
			String x =it.next();
			System.out.println(x);
		}
		
		Object[] bag2 = bag.toArray();
	}
}
