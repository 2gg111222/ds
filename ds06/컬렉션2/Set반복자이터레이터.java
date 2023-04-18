package 컬렉션2;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자이터레이터 {
	public static void main(String[] args) {
		HashSet<Integer> money = new HashSet<>();
		money.add(1000);
		money.add(2000);
		money.add(3000);
		money.add(2000);
		money.add(4000);
		money.add(2000);
		money.add(3000);
		System.out.println(money);
		
		
		Iterator<Integer> it = money.iterator();
		for(int i = 0; i <money.size(); i++) {
			int x =it.next();
			System.out.println(x);
		}
		
		Object[] money2 = money.toArray();
		for(Object x : money2) {
			System.out.println(x);
		}
	}
}
