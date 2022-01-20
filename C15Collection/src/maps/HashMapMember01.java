package maps;


// map
/* 키(key)와 값(value)으로 구성, 딕셔너리(Dictionary)
 * 키는 중복 불가
 * 기존의 키와 동일한 값으로 저장하면 새로운 값으로 대치
 * 
 * */

import java.util.*;

public class HashMapMember01 {

	public static void main(String[] args) {
		Map<Member,Integer> maps = new HashMap<>();

		maps.put( new Member(1000, "java"), 10);
		maps.put( new Member(2000,"python"),20);
		maps.put( new Member(3000,"js"),30);
		
		// member의 id와 name이 같아서 새로운 값으로 대체
		maps.put( new Member(3000,"js"),40);
		
		printMap(maps);
	}

	static void printMap(Map< Member, Integer> maps) {
		System.out.println("size : " + maps.size());
		
		Set<Member> keys = maps.keySet();
		
		Iterator<Member> ik = keys.iterator(); // 키목록 추출
		
		while(ik.hasNext()) {
			Member mem = ik.next();
			Integer age = maps.get(mem);
//			System.out.println(key + " "+ member);
			System.out.println("값 " + mem.id + " "+ mem.name+" "+age);
		}
	}
}
