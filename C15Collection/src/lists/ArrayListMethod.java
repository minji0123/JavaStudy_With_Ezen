package lists;

import java.util.ArrayList;
import java.util.List;


public class ArrayListMethod {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();

		// add(E) : 리스트에 데이터 추가
		list1.add(10);
		list1.add(20);
		list1.add(30);
		// add (int, E) : 리스트 원하는 위치에 데이터 추가
		list1.add(2, 25);
		// set (int, E) : 리스트 원하는 위치의 데이터 변경
		list1.set(1,15);
		
		System.out.println("초기 배열");
		for (int x : list1) {
			System.out.print(x+ " ");
		}
		System.out.println("");
		
		//------------------------------------------------------------
		
		
		// contains(E) : 데이터 있나 확인
		boolean real = list1.contains(25);
		System.out.println("25가 있음?? : " + real);
		System.out.println("");
		
		// get(int) : 원하는 위치의 데이터 출력
		int whatNum = list1.get(2);
		System.out.println("2번째 데이터 : " + whatNum);
		System.out.println("");
		
		// isEmpty() : 리스트존재함?? 데이터 들어있음??
		boolean real2 = list1.isEmpty();
		System.out.println("list1이 있음?? : " + real2);
		System.out.println("");
		
		// size() : 데이터 개수 출력
		int size = list1.size();
		System.out.println("총 객체수 : " + size);
		System.out.println("");
		
		//------------------------------------------------------------
		
		// remove(int) : 원하는 위치의 데이터 삭제
		list1.remove(1);
		for (int x : list1) {
			System.out.print(x + " ");
		}
	
		// clear : 객체 전부 삭제
//		list1.clear();
		
//		list1.remove(25);
//		for (int x : list1) {
//			System.out.println(x);
//		}
		
	}

}
