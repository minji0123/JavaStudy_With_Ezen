/*
 * 전자계산기 : 실수(부동소수점으로)
 * - 사칙연산 : 더하기, 빼기, 곱하기, 나누기
 * - 계산이력 : 
 * 		계산이력을 관리하라 (최대 100개까지)
 * - 메소드 : 사칙연산, 출력, 
 * 			이력출력, 이력을 사용한 재계산
 * -------------------------------------------------------------
 * [계산이력]
 * 이력출력 : 1 + 10 - 4 *3 /2 = ?
 * 재계산   : 이력을 이용하여 재계산
 * 최종적으로 가지고 있는 값과 재계산 값을 비교해서 출력
 * --------------------------------------------------------------
 * [구현방안]
 * - 2차원 배열 사용 (100행2열) 행 : 100개의 이력, 2열 : 사칙연산, 값
 * - 
 */
package calc;

public class Calcx {
	static final int ROW = 100;
	static final int COL = 2;

	// 필드
	double result;
	int numCount = 0;
	String[][] history = new String[ROW][COL];
	
	double letPlus(double x) {
		history[this.numCount][0] = "" + x;
		history[this.numCount][1] = "+";
		this.numCount++;
		this.result += x;
		return this.result;
	}
	
	double letMinus(double x) {
		history[this.numCount][0] = "" + x;
		history[this.numCount][1] = "-";
		this.numCount++;
		this.result -= x;
		return this.result;
	}
	
	double letMulti(double x) {
		history[this.numCount][0] = "" + x;
		history[this.numCount][1] = "*";
		this.numCount++;
		this.result *=  x;
		return this.result;
	}
	
	double letDivi(double x) {
		history[this.numCount][0] = "" + x;
		history[this.numCount][1] = "/";
		this.numCount++;
		this.result /= x;
		return this.result;
	}
	
	void print() {
		System.out.println("계산결과 = " + this.result);
	}

//	 * [계산이력]
//			 * 이력출력 : 1 + 10 - 4 *3 /2 = ?
//			 * 재계산   : 이력을 이용하여 재계산
//			 * 최종적으로 가지고 있는 값과 재계산 값을 비교해서 출력
//			 * --------------------------------------------------------------
//			 * [구현방안]
//			 * - 2차원 배열 사용 (100행2열) 행 : 100개의 이력, 2열 : 사칙연산, 값
//			 * - 
	
	// 이력개수 출력
	double countHistory() {
		System.out.println("(계산 이력 : "+ numCount+")");
		
		if (numCount == 100) {
			System.out.println("계산 이력이 100개가 넘었습니다.");
			numCount = 0;
		}
		return numCount;
	} 
	
	// 계산 히스토리 출력
	void printHistory() {
		System.out.print("0");
		for(int row=0; row<this.numCount; row++) {
			for(int col=1; col>=0 ; col--) {
				System.out.print(this.history[row][col]);
			}
		}
	}
	
	// 이력을 사용한 재계산
	double calHistory() {
		// 1. 메소드 안에서 결과 저장용으로 선언한 지역 변수
		double calResult = 0.0;
		// 2. for 문으로 String[][] history의 행을 this.numCount수만큼 늘려줌
		for(int row=0; row<this.numCount; row++) { 
			// 3. switch 문으로 String[][] history의 열 두번째 값[1]을 판단해서 
			// 결과값에 String[][] history의 열 첫번째 값[0]을 계산해줌
			switch(this.history[row][1]) {
			case "+":
				calResult += Double.parseDouble(this.history[row][0]);
				break;
			case "-":
				calResult -= Double.parseDouble(this.history[row][0]);
				break;
			case "*":
				calResult *= Double.parseDouble(this.history[row][0]);
				break;
			case "/":
				calResult /= Double.parseDouble(this.history[row][0]);
				break;
			}
		}
		// 4. 결과 출력
		return calResult;
	}
	
}
