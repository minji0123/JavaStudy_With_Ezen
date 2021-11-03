package calc;

public class Calc {

	// 접근 제한자
	// 1. protected : 자식 클래스에서 접근이 허용
	protected int sum;
	int prevsum;
	private int privsum=-1;
	
	public Calc() {
		this.sum = 0;
	}
	public Calc(int sum) {
		this.prevsum = this.sum;
		this.sum = sum;
	}
	
	///
	public int compute(int x) {
		this.prevsum = this.sum;
		this.sum +=x;
		return this.sum;
	}
	///
	
	protected void setPrevSum() {
		this.prevsum = this.sum;
	}
	public int getSum() {
		return this.sum;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	protected int getPrivSum() {
		return this.privsum;
	}
}
