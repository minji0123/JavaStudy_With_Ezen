package arrayIndexOutOf;

public class ArrayIndexRun2 {
	public static void main(String[] args) {

		String[] s = { "hello", "world", "." };

		try {
			System.out.printf("s[0] : %s\n", s[0]);
			System.out.printf("s[1] : %s\n", s[1]);
			System.out.printf("s[2] : %s\n", s[2]);

			// 실행오류
			System.out.printf("s[3] : %s\n", s[3]);
			// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3
			// out of bounds for length 3
			// at arrayIndexOutOf.ArrayIndex.main(ArrayIndex.java:12)
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("the end");
	}

}
