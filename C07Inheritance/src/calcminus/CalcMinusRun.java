package calcminus;

import calc.Calc;

public class CalcMinusRun extends Calc{
	
	
	// 1-1. calc.sum이 오류나는 이유1
	// Calc를 상속은 했지만, 접근하지 못한다.
	// static 이기 때문이다.
	public static void main(String[] args) {		
//		CalcMinus calc = new CalcMinus(1000);
//		int sum = calc.compute(300);
//
//		System.out.println("sum = "+ sum);
//		System.out.println("sum = "+ calc.getSum());
//		System.out.println("sum = "+ calc.sum);
		printCalc();
	}
	
	
	// 1-2. calc.sum이 오류나는 이유2
	// 이 메소드 안에서는 this.로 접근이 가능하다.
	// 접근할 수 있기 때문이다. 
	void print() {
		System.out.println("[CalcMinusRun.print]");
		CalcMinus calc = new CalcMinus(1000);
		int sum = calc.compute(300);
		
		System.out.println("sum = "+ sum);
		System.out.println("sum = "+ calc.getSum());
		System.out.println("sum = "+ this.sum);
	}
	
	
	// 1-3. calc.sum이 오류나는 이유3
	// 얘도 static이기 때문에 접근할 수 없다.
	static void printCalc() {
		System.out.println("[printCalc]");
		CalcMinus calc = new CalcMinus(1000);
		int sum = calc.compute(300);

		System.out.println("sum = "+ sum);
		System.out.println("sum = "+ calc.getSum());
		// 2. protected 접근 제한자
		// Calc.sum은 protected 이기 때문에 접근 불가
//		System.out.println("sum = "+ calc.sum);
		
		CalcMinusRun calcrun = new CalcMinusRun();
		calcrun.compute(60);
		calcrun.print();
	}
}
