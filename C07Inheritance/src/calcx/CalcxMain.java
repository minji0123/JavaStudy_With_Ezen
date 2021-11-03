package calcx;

public class CalcxMain {

	public static void main(String[] args) {

		CalcxSum num1 = new CalcxSum(100);
		int sum = num1.compute(100);
		System.out.println("sum result : "+sum);
		
		CalcxMinus num2 = new CalcxMinus(100);
		int minus = num2.compute(50);
		System.out.println("minus result : "+minus);
		
		CalcxMultiple num3 = new CalcxMultiple(100);
		int multiple = num3.compute(100);
		System.out.println("multiple result : "+multiple);
		
		CalcxDivide num4 = new CalcxDivide(100);
		int divide = num4.compute(50);
		System.out.println("minus result : "+divide);
	}

}
