/*
 * 전자계산기 : 정수 계산기
 * - 사칙연산 : 덧셈, 뺄셈, 곱셈, 나눗셈
 * - 나머지
 * - 출력
 */
package calc;

public class Calc {

	public int total;
//	private int total;
	
	
	public Calc(){
	System.out.println("3. Calc");
	}
	Calc(int total){
		this.total = total;
	}
	
	
	static int calcStatic(Calc calc) {
		int tot =calc.total;
		return tot;
	}
	
	
	static void calc(Calc calc) {
		int tot =calc.total;
		System.out.println("tot : "+tot);
	}
	
	
	
	public int plus(int val) {
		this.total += val;
		return this.total;
	}
	public int minus(int val) {
		this.total -=val;
		return this.total;
	}
	public int multiple(int val) {
		this.total *=val;
		return this.total;
	}
	public int divide(int val) {
		this.total /=val;
		return this.total;
	}
	public int mod(int val) {
		this.total %=val;
		return this.total;
	}
	public int total() {
		return this.total;
	}
	
	
	public void print() {
		System.out.println("total = "+this.total);
	}
	public void clear() {
		this.total = 0;
	}
	
	public int sum(int[] values) {
		for(int val : values) {
			this.total +=val;
		}
		return this.total;
	}
	
	public int sums(int ... values) {
		for(int val : values) {
			this.total +=val;
		}
		return this.total;
	}
	
	public void print(String title) {
		System.out.println(title+" total = "+this.total);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
