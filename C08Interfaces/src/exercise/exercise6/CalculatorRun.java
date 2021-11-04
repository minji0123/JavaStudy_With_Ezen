package exercise.exercise6;

public class CalculatorRun {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		System.out.println(calculator.getNumAdd(1, 20));
		System.out.println(calculator.getNumMulti(1, 20));
		System.out.println(calculator.getNumMinus(1, 20));
		System.out.println((double)calculator.getNumDivide(1, 20));
		
	}

}
