/*
 * 조건문 if, if ~ else
 * -------------------
 * if (조건식) {
 * 	참인 경우 실행문
 * }
 * else {
 * 	거짓인 경우 실행문
 * }
 * --------------------
 * 조건식 : boolean 이 참인 경우
 * - 논리연산 && || !
 * - 비교연산 <>
 */
public class IfStaatement01 {

	public static void main(String[] args) {
		
		// 0. if문 형태
		if(true) {
			System.out.println("참");
		}
		if(false) { // Dead code(죽은 코드). 실행되지 않는 코드
			System.out.println("거짓");
		}
		
		
		// 1. if문 조건식에 오는 것 1. boolean1
		boolean tf = true;
		if(tf) {
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}


		
		// 1. if문 조건식에 오는 것 1. boolean2
		boolean tf1 = true;
		if(!tf1) {
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}
		

		// 1. if문 조건식에 오는 것 1. 연산식1
		boolean tf2 = true;
		if(tf2 == true) {
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}
		

		// 1. if문 조건식에 오는 것 1. 연산식2
		boolean tf3 = true;
		if(tf3 != true) {
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}
		
		
	}

}
