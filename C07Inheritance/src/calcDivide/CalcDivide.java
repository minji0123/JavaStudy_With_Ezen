package calcDivide;
import calc.Calc;
public class CalcDivide extends Calc{
	public CalcDivide() {
		
	}
	public CalcDivide(int sum) {
		super(sum);
	}
	

	@Override
	public int compute(int sum) {
		super.setPrevSum();
				
		this.sum /=sum;
		return this.sum;
	}
}
