package sets;

import java.util.HashSet;
import java.util.Set;
// set
/*
 * 중복을 허용하지 않는다.
 * 저장된 순서가 보장되지 않는다.
 * 순서가 무작위이다.
 * 집합처리 유용
 * */

public class SetHashSet01 {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		
		s1.add("1.java");
		s1.add("2.DBMS");
		s1.add("3.HTML");
		s1.add("4.python");
		
		s1.add("3.HTML"); // 데이터가 중복해서 저장되지 않음
		
		for(String str : s1) {
			System.out.println(str);
		}

	}

}
