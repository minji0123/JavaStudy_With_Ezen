package sets;

//import java.util.HashSet;
//import java.util.Iterator;
import java.util.*;

public class SetHashSet_Iter {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		
		s1.add("1.java");
		s1.add("2.DBMS");
		s1.add("3.HTML");
		s1.add("4.python");
		
		Iterator<String> it = s1.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

	}

}
