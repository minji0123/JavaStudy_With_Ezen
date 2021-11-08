package arrayIndexOutOf;

public class ArrayIndexRun {
	public static void main(String[] args) {

		String[] s = { "hello", "world", "." };

		System.out.printf("s[0] : %s\n", s[0]);
		System.out.printf("s[0] : %s\n", s[1]);
		System.out.printf("s[0] : %s\n", s[2]);

		// 실행오류
		System.out.printf("s[0] : %s\n", s[3]);
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3
		// out of bounds for length 3
		// at arrayIndexOutOf.ArrayIndex.main(ArrayIndex.java:12)
	}

}
