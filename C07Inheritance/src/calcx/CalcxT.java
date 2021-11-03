package calcx;

import calc.Calc;
import calcminus.CalcMinus;
import calcMultiple.CalcMultiple;
import calcDivide.CalcDivide;

public class CalcxT {
//	private Calc plus = new Calc();
//	private CalcMinus minus = new CalcMinus();
//	private CalcMultiple multiple = new CalcMultiple();
//	private CalcDivide divide = new CalcDivide();

	
	private int sum;
//	private int isum;
	
	CalcxT(){}
	CalcxT(int sum){
		this.sum = sum;
	}
	
	public int compute(String oper, int x) {
//		Calc plus = null;
//		CalcMinus minus = null;
//		CalcMultiple multiple = null;
//		CalcDivide divide = null;
		
		switch(oper) {
		case "+":
			Calc plus = new Calc(this.sum);
			this.sum = plus.compute(x);
			break;
		case "-":
			CalcMinus minus = new CalcMinus(this.sum);
			this.sum = minus.compute(x);
			break;
		case "*":
			CalcMultiple multiple = new CalcMultiple(this.sum);
			this.sum = multiple.compute(x);
			break;
		case "/":
			CalcDivide divide = new CalcDivide(this.sum);
			this.sum = divide.compute(x);
			break;
		}
		
//		this.sum = this.isum;
//		this.sum += plus.getSum();
//		this.sum += minus.getSum();
//		this.sum += multiple.getSum();
//		this.sum += divide.getSum();
		return this.sum;
	}
	
	public int getSum() {
		return this.sum;
	}

}
