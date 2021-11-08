package numberFormat;

public class NumberFormatRun3 {

	public static void main(String[] args) {
		int val1 = 0;
		int val2 = 0;
		try {
			String s1 = "100";
			val1 = Integer.parseInt(s1);
			System.out.printf("string(s1 : %s) -> int(val1 : %d)\n", s1, val1);

			String s2 = "a100";
			val2 = Integer.parseInt(s2);
			System.out.printf("string(s2 : %s) -> int(val2 : %d)\n", s2, val2);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		

		// 컴파일 오류 (변수에 0값 (초기값)을 할당하지 않았을 때
		int valx = val1 + val2;
		System.out.printf("val1(%d) + val2(%d) = valx(%d)\n", val1, val2, valx);
		
	}

}
