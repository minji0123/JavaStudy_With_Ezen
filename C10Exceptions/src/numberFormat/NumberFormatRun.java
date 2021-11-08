package numberFormat;

public class NumberFormatRun {

	public static void main(String[] args) {

		String s1 = "100";
		int val1 = Integer.parseInt(s1); // 문자열을 정수로 변환
		System.out.printf("string(s1 : %s) -> int(val1 : %d)\n", s1, val1);

		String s2 = "a100";
		int val2 = Integer.parseInt(s2); // a를 정수로 변환할 수 없다. (a는 정수에 대응하지 않음)
		System.out.printf("string(s2 : %s) -> int(val2 : %d)\n", s2, val2);
	}

}
