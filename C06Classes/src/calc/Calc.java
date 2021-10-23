/*
 * 전자계산기 : 정수 계산기
 * - 사칙연산 : 덧셈, 뺄셈, 곱셈, 나눗셈
 * - 나머지
 * - 출력
 */
package calc;

public class Calc {

	int total;
//	Calc(){
//	System.out.println("3. Calc");
//	}
//	Calc(int total){
//		this.total = total;
//	}
	
	int plus(int val) {
		this.total += val;
		return this.total;
	}
	int minus(int val) {
		this.total -=val;
		return this.total;
	}
	int multiple(int val) {
		this.total *=val;
		return this.total;
	}
	int divide(int val) {
		this.total /=val;
		return this.total;
	}
	int mod(int val) {
		this.total %=val;
		return this.total;
	}
	int total() {
		return this.total;
	}
	
	
	void print() {
		System.out.println("total = "+this.total);
	}
	void clear() {
		this.total = 0;
	}
	
	int sum(int[] values) {
		for(int val : values) {
			this.total +=val;
		}
		return this.total;
	}
	
	int sums(int ... values) {
		for(int val : values) {
			this.total +=val;
		}
		return this.total;
	}
	
	void print(String title) {
		System.out.println(title+" total = "+this.total);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
