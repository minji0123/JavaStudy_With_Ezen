package numberFormat;

public class NumberFormatRun2 {

	public static void main(String[] args) {
		try {
			String s1 = "100";
			int val1 = Integer.parseInt(s1);
			System.out.printf("string(s1 : %s) -> int(val1 : %d)\n", s1, val1);

			String s2 = "a100";
			int val2 = Integer.parseInt(s2);
			System.out.printf("string(s2 : %s) -> int(val2 : %d)\n", s2, val2);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		
	}

}
