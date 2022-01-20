package lists;

import java.util.ArrayList;
import java.util.List;

class TClass{
	int tid;
	String tname;
//	int tval;
	
	TClass(int id, String name){
		tid = id;
		tname = name;
	}
}

public class ArrayList04 {

	public static void main(String[] args) {
		List<TClass> ts = new ArrayList<>();
		
		TClass t10 = new TClass(10, "십");
		
		ts.add(t10);
		ts.add(new TClass(20,"이십"));
		ts.add(new TClass(30,"삼십"));
		ts.add(new TClass(40,"사십"));
		ts.add(new TClass(50,"오십"));
		
		

		
		
		System.out.println("원본 총 개수 : "+ts.size());
		
		for(int i=0; i<ts.size(); i++) {
			TClass test = ts.get(i);
			System.out.printf("tid : %d, tname : %s\n", test.tid, test.tname);
			
			if(t10 == test) {
				
				// 저장된 객체와 값은 같지만 다른 객체이므로 삭제되지 않는다.
//				boolean br1 = ts.remove(new TClass(10, "십"));
				
				
				// 이렇게 지워야 한다.
				boolean br = ts.remove(test);  // 얘가 베스트
//				boolean br2 = ts.remove(t10);
				System.out.printf("remove > tid : %d, tname : %s result : %b\n", test.tid, test.tname, br);
				
			}
			System.out.println("");
			
			System.out.printf("%d/%d\n", i,ts.size());
		}
		
		
		for(TClass test : ts) {
			System.out.printf("tid : %d, tname : %s\n", test.tid, test.tname);
		}
		

	}

}
