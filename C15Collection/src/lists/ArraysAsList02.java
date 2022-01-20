package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

// Arrays.as.List()
/*
 * 1. 고정된 객체를 리스트 배열로 처리
 * 2. 리스트에 데이터를 추가할 수 없다.
 * */

public class ArraysAsList02 {

	public static void main(String[] args) {
		
		List<TClass> ts = Arrays.asList(

		new TClass(10, "십"),
		new TClass(20,"이십"),
		new TClass(30,"삼십"),
		new TClass(40,"사십"),
		new TClass(50,"오십"));
				
		Iterator<TClass> it = ts.iterator();
		while(it.hasNext()) {
			TClass t = it.next();
			System.out.println(t.tid+ " "+t.tname);
		}
		

	}

}
