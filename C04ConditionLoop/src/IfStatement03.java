/*
 * 조건문: if ~ else
 * - 조건식 : 정수의 크기 비교
 */
public class IfStatement03 {

	public static void main(String[] args) {
		
		// 1. 정수의 크기 비교
		int n = 9;
		if (n >= 9) {
			System.out.printf("n(%d)은 9보다 크거나 같다.",n);
		}
		else {
			System.out.printf("n(%d)은 9보다 작다, 크지 않다.",n);
		}

		// 1-1. boolean으로 표현 가능하다.
		boolean bn = (n >= 9);
		if (bn){
			System.out.printf("n(%d)은 9보다 크거나 같다.",n);
		}
		else {
			System.out.printf("n(%d)은 9보다 작다, 크지 않다.",n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
