package trycatchfinally;

public class NumberFormatRun2 {

	public static void main(String[] args) {
//		String []list = {"hello", "world"};
//		int result = add(lists);
		int result = add(args);

		System.out.println("result = " + result);
	}

	static int add(String[] args) {

		try {
			String s1 = args[0];
			String s2 = args[1];
			int x = Integer.parseInt(s1);
			int y = Integer.parseInt(s2);
			int z = x + y;
			return z;

		} catch (NumberFormatException e) {
			System.out.println("정수로 변경이 불가능함");
		} finally {
			if (args.length < 2) {
				System.out.println("파라미터 2개 필요");
			} else {
				System.out.println("연산 수행 완료");
			}

		}
		return -1;
	}

}
