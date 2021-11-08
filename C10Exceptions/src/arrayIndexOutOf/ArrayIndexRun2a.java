package arrayIndexOutOf;

public class ArrayIndexRun2a {
	public static void main(String[] args) {

		String[] s = { "hello", "world", "." };

		int cnt = -1;
		while (++cnt < s.length) {

			try {
				System.out.printf("s[%d] : %s\n", cnt, s[cnt]);

			}
//			catch (NullPointerException e) {
//				System.out.println(e.getMessage());
//			}

			catch (Exception e) {
				System.out.println(e);
			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println(e.getMessage());
//			}

		}
		System.out.println("the end");
	}

}
