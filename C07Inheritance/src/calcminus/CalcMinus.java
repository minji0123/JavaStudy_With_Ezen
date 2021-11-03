package calcminus;
//1. 다른 패키지로 상속 받을 때
import calc.Calc;

public class CalcMinus extends Calc{
	private int pprisum;
	
	public CalcMinus() {
		this.pprisum = super.getPrivSum();
		
	}
	public CalcMinus(int sum) {
		super(sum);
	}
	
	// 오버라이딩
	@Override
	public int compute(int sum) {
		// 2. default이기 때문에 자식에서 접근 불가능
//		this.prevsum = this.sum;
		// 2.1 셋 중 암거나 사용해도 됨
//		setPrevSum();
//		this.setPrevSum();
		super.setPrevSum();
				
		this.sum -=sum;
		return this.sum;
	}
}
