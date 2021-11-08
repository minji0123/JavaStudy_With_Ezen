package runtimes;

public class DivideExceptionRun {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = 0;

		if (y != 0) {
			z = x / y;
		} else {
			System.out.println("0으로 나눌 수 없다.");
			return;
		}

		System.out.println("x / y : " + z);

	}

}
