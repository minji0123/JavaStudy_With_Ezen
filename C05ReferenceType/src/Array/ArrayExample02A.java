/*
 * [문제] 10*10의 2차원 배열을 만들고 1부터 순차적으로 1씩 증가한 값을 넣어라.
 * - 9*9에 1부터 81까지 순차적으로 1씩 증가한 값을 넣어라
 * - 각 행과 열의 합을 구하라.
 * - 가로 소계는 각 행의 9열에 넣어라
 * - 세로 소계는 각 열의 9열에 넣어라
 * 
 */
package Array;

public class ArrayExample02A {

	// 02 만든 9열9행에 합을 넣을 공간을 추가해줌
	final static int MAX_ROW = 9; // 9열
	final static int MAX_COL = 9; // 9행
	
	public static void main(String[] args) {
		
		int [][] td = new int [MAX_ROW+1][MAX_COL+1]; // 총합 넣을 공간을 추가
		int cnt = 0;
		
		for (int row=0; row<MAX_ROW; row++) {
			for (int col=0; col< MAX_COL; col++) {
				td[row][col] = ++cnt;
				td[row][MAX_COL] += td[row][col];  // 열합 계산 후 열끝에 넣어줌
				td[MAX_ROW][col] += td[row][col]; // 행합 계산 후 행끝에 넣어줌
				
				System.out.printf("[%3d]", td[row][col]);
			}
			td[MAX_ROW][MAX_COL] += td[row][MAX_COL];// 총합(여기서는 행으로 해줌) 계산 후 열,행 끝에 넣어줌
			System.out.printf("[%d]", td[row][MAX_COL]);
			System.out.println();
		}
		for (int col=0; col<=MAX_COL; col++) { //<=로 해줘야 한다. 총계까지 표현해주ㅏ야 하기 때문
			System.out.printf("[%d]", td[MAX_ROW][col]);
		}
		
		// 전체 결과
		System.out.println();
		System.out.println("테이블의 내용");
		for (int row=0; row<=MAX_ROW; row++) {
			for(int col=0; col<=MAX_COL; col++) {
				System.out.printf("[%3d]", td[row][col]);
			}
			System.out.println();
		}
	}

}
