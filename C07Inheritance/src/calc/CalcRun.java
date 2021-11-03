/*
 * [protected 접근 제한자]
 * - 자식 클래스가 아닌 다른 패키지에 소속된 클래스에서는 접근할 수 없다.
 * - 같은 패키지 안에 있는 클래스에서는 디폴트와 같이 접근할 수 있다.
 * 
 * [private 접근 제한자]
 * - 같은 패키지라 하더라도 private는 접근할 수 없음
 * - private에 접근하고 싶으면 게터 메소드를 이용한다.
 */
package calc;

public class CalcRun {

	public static void main(String[] args) {
		Calc calc = new Calc(900);
		int sum = calc.compute(10);
		
		// 1. 접근 제한자에 따른 출력 결과
		// protected 접근 제한자는 같은 패키지 안에서는 접근 가능하다.
		// 							다른 패키지에서는 접근할 수 없다.
		System.out.println("calc.sum = "+calc.sum);
		System.out.println("calc.prevsum = "+calc.prevsum);
//		System.out.println("calc.prisum = "+calc.prisum);
		System.out.println("calc.prisum = "+calc.getPrivSum()); 
		// private에 접근하고 싶으면 게터 메소드를 이용한다.
		
		System.out.println("sum = "+sum);          
	}
}
