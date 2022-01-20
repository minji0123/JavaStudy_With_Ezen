package lists;

import java.util.ArrayList;
import java.util.List;


public class ArrayList01 {
	public static void main(String[]args) {
		List<String> lists = new ArrayList<String>();
		
		lists.add("1. 자바");
		lists.add("2. 자바스크립트");
		// 중복을 허용
		lists.add("2. 자바스크립트");
		lists.add("3. HTML");
		
		// for 문으로 배열 출력
		for(int index = 0; index <lists.size(); index++) {
			String val = lists.get(index);
			System.out.println(val);
		}
		
		// 향상된 for 문으로 출력
		for(String val : lists) {
			System.out.println(val);
		}

		
	}
}
