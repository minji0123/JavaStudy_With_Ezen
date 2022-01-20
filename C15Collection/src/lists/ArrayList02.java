package lists;

import java.util.ArrayList;
import java.util.List;

// 초기용량 지정 가능
/*		초기용량을 너무 적게하면 계속 확장하게 되면서 성능이 저하됨
 * 		너무 또 크게 하면 메모리 낭비
 * DEFAULT_CAPACITY = 10 처음에는 디폴트로 10으로 지정되어있고 
 * 10 이상이면 자동으로 늘려나감
 * 
 * */
public class ArrayList02 {
	// 배열 크기 100으로 지정
	final static int LIST_INIT_SIZE = 100;
	
	public static void main(String[]args) {
		// 배열 크기 지정한거 적용함
		List<String> lists = new ArrayList<String>(LIST_INIT_SIZE);
		
		lists.add("1. 자바");
		lists.add("2. 자바스크립트");
		lists.add("3. HTML");
		
		
		// 향상된 for 문으로 출력
		for(String val : lists) {
			System.out.println(val);
		}

		
	}
}
