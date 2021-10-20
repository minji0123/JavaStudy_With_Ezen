/*
 * [문제] 2차원 배열(9*9)에 구구단 값을 넣어서 출력해라
 * - 1단부터 9단까지
 * - 1단계 : 배열의 곱셈의 값을 넣음
 * - 2단계 : 배열을 순회하면서 출력
 */
package Exercise;

public class TwoArray99Alone {

	public static void main(String[] args) {
		int [][]gg = new int[10][10];
		
		for (int col=1; col<=9; col++) {
			for(int row=1; row<=9; row++) {
				int result = col*row;
				
				// 1. 배열에 곱 결과를 할당
				gg[col][row]=result;
				System.out.print(gg[col][row]);
				//결과
//				123456789
//				24681012141618
//				369121518212427
//				4812162024283236
//				51015202530354045
//				61218243036424854
//				71421283542495663
//				81624324048566472
//				91827364554637281
				//배열에 곱 결과가 할당됨
				
				// 2. 곱셈 형태로 출력
				System.out.println(col+"*"+row+" = "+gg[col][row]);
			}
			System.out.println();	
		}
	}

}
