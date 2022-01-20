package lists;

import java.util.ArrayList;
import java.util.List;


public class ArrayListInt01 {

	public static void main(String[] args) {

		// 기본 자료형은 래퍼(wrapper) 클래스를 사용해야 한다.
//		List<int> lists = new ArrayList<int>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<>();

		
		list1.add(10);
		list1.add(20);
		
		for (int x : list1) {
			System.out.println(x);
		}
	}

}
