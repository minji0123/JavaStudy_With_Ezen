package lists;

import java.util.ArrayList;
import java.util.List;

class TestClass{
	int tid;
	String tname;
	
	TestClass(int id, String name){
		tid = id;
		tname = name;
	}
}

public class ArrayList03 {

	public static void main(String[] args) {
		List<TestClass> ts = new ArrayList<>();
		
		ts.add(new TestClass(10, "십"));
		ts.add(new TestClass(20,"이십"));
		ts.add(new TestClass(30,"삼십"));
		ts.add(new TestClass(40,"사십"));
		ts.add(new TestClass(50,"오십"));
		
		
		
		for(int i=0; i<ts.size(); i++) {
			TestClass test = ts.get(i);
			if(test.tid == 20 || test.tid == 50) {
				ts.remove(i);
			}
			System.out.printf("%d/%d\n", i,ts.size());
		}
		
		
		for(TestClass test : ts) {
			System.out.printf("tid : %d, tname : %s\n", test.tid, test.tname);
		}
	}

}
