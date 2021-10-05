
// 정수 : integer
// 4바이트 (32비트)
// -2147483648 ~ 2147483647 10자리이다.
// 자바에서 정수의 기본 단위
//	System.out.println(" : " + );
public class IntType {

	public static void main(String[] args) {
		int minInt = -2147483648;
		int maxInt = 2147483647;
		System.out.println("minInt : " + minInt);
		System.out.println("maxInt : " + maxInt);
		
		
		// int minOne = (int)(minInt -1);
		// int는 괄호로 안묶어줘도 오류가 나지 않는다. 정수의 기본 단위이기 때문이다.
		int minOne = minInt -1;
		int maxOne = maxInt +1;
		System.out.println("minOne : " + minOne);
		System.out.println("maxOne : " + maxOne);
		
	}
}
