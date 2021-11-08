package trycatchfinally;

public class NumberFormatRun3 {

	public static void main(String[] args) {

		String s1 = null;
		String s2 = null;

		if (args.length > 0) {
			s1 = args[0];
		}
		if (args.length > 1) {
			s2 = args[1];
		}
		try {
			int val1 = Integer.parseInt(s1);
			int val2 = Integer.parseInt(s2);
			
		} catch (NumberFormatException e) {
			System.out.println("정수로 변경이 불가능함");
		} finally {
			if (args.length < 2) {
				System.out.println("파라미터 2개 필요");
			} else {
				System.out.println("연산 수행 완료");
			}

		}
	}

}
