package runtimes;

public class DivideExceptionRun4 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = 0;

		try {
			z = x / y;
			System.out.println("x / y : " + z);
		}

		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다.");

		}
	}

}
