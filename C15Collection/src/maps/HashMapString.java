package maps;


// map
/* 키(key)와 값(value)으로 구성, 딕셔너리(Dictionary)
 * 키는 중복 불가
 * 기존의 키와 동일한 값으로 저장하면 새로운 값으로 대치
 * 
 * */

import java.util.*;

public class HashMapString {

	public static void main(String[] args) {
		Map<String, Integer> maps = new HashMap<>();

		maps.put("java", 20);
		maps.put("python", 15);
		maps.put("js",25);
		
		printMap(maps);
	}

	static void printMap(Map<String, Integer> maps) {
		System.out.println("size : " + maps.size());
		
		Set<String> keys = maps.keySet();
		
		Iterator<String> ik = keys.iterator(); // 키목록 추출
		
		while(ik.hasNext()) {
			String key = ik.next();
			Integer val = maps.get(key);
			System.out.println(key + " "+ val);
		}
	}
}
