package calc;

public class CalcxMain {
	
	public static void main(String[] args) {
		
		Calcx cal1 = new Calcx();
		
		cal1.letPlus(11.0);
		cal1.letMinus(5.0);
		cal1.letDivi(3.3);
		cal1.letMulti(3.0);
		cal1.print();
		cal1.printHistory();
		System.out.println();
		
		double calResult = cal1.calHistory();
		System.out.println("이력을 사용한 재계산 : "+calResult);
	}
}
