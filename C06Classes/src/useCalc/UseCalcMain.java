/*
 * 패키지 : 
 * 다른 패키지에 있는 클래스를 사용하기 위한 조건
 * 	public으로 되어있어야 한다.
 */
package useCalc;
// calc 패키지의 Calc 클래스를 사용하고 싶다.
// import 하면 된다.
import calc.Calc;

public class UseCalcMain {
	

	Calc calc2;
	UseCalcMain(){
		System.out.println("2. CalcMain()");
		calc2 = new Calc();
	}
	

	
	void step1() {
		System.out.println("[step1]");
		calc2.plus(10);
		calc2.minus(5);
		calc2.multiple(4);
		calc2.divide(3);
		int total1 = calc2.mod(4);
		int total2 = calc2.total();
		calc2.print();
		
		System.out.println("total1 : "+total1 + ", total2 : "+ total2);

	}
	
	void step2() {
		System.out.println("[step2]");
		calc2.plus(20);
		calc2.print();
		
		calc2.clear();
		calc2.plus(50);
		calc2.print();
		
		System.out.println("calc.total : " + calc2.total);
		System.out.println("calc.total() : " + calc2.total());
	}
	
	void step3() {
		calc2.clear();
		int[] values = {1,2,3,4,5,6,7,8,9,10};
		calc2.sum(values);
		calc2.print("[step3] 배열 덧셈");
		
		calc2.sum(new int[] {1,2,3,4,5,6,7,8,9,10});
		calc2.print("[step3] 배열 덧셈");		

	}

	void step4() {
		calc2.clear();
		calc2.sums(1,3,5,7,9);
		calc2.print("[step4] 가변인자 덧셈");	
		
		calc2.clear();
		calc2.sums(new int[] {1,2,3,4,5,6,7,8,9,10});
		calc2.print("[step4] 가변인자 덧셈");
	}
	
	
	// 메소드 main
	public static void main(String[] args) {
		System.out.println("1. CalcMain : main");
		UseCalcMain calc = new UseCalcMain();
//		calc.step1();
//		calc.step2();
		calc.step3();
		calc.step4();
		
	}
}

