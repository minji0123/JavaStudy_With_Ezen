package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

// Arrays.as.List()
/*
 * 1. 고정된 객체를 리스트 배열로 처리
 * 2. 리스트에 데이터를 추가할 수 없다.
 * */

public class ArraysAsList03 {

	public static void main(String[] args) {
		
		List<TClass> ts = Arrays.asList(

		new TClass(10, "십"),
		new TClass(20,"이십"),
		new TClass(30,"삼십"),
		new TClass(40,"사십"),
		new TClass(50,"오십"));
		
		// 이렇게 쓸 수 없다. 객체 추가 삭제 불가!
//		ts.add(new TClass(60, "육십"));
		
		// 근데 set은 할수이쑴 교체는 가능
		// 첨부터 데이터 크기가 고정되어있으니까
		ts.set(0, new TClass(10,"열"));
		
		// 데이터를 변경
		TClass t10 = ts.get(0);
		t10.tname = "열십";
		
		// 데이터 변경은 상황에 따라 다름
		
		
		// Iterator 와 for 문
		
		for (TClass x : ts) {
			System.out.println(x);
		}
		
		Iterator<TClass> it = ts.iterator();
		while(it.hasNext()) {
			TClass t = it.next();
			System.out.println(t.tid+ " "+t.tname);
		}
		

	}

}
