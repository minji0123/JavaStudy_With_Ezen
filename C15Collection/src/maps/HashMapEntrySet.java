package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEntrySet {

	public static void main(String[] args) {
		Map<String, Integer> maps = new HashMap<>();

		maps.put("java", 20);
		maps.put("python", 15);
		maps.put("js",25);
		
		printMap(maps);
	}

	static void printMap(Map<String, Integer> maps) {
		System.out.println("size : " + maps.size());
		
		Set<Map.Entry<String, Integer>> entrys = maps.entrySet();
		
		Iterator<Map.Entry<String, Integer>> es = entrys.iterator(); // 키목록 추출
		
		while(es.hasNext()) {
			Map.Entry<String, Integer> entry = es.next();
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " "+ val);
		}
	}
}
