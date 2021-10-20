/*
 * [문제] 10*10의 2차원 배열을 만들고 1부터 순차적으로 1씩 증가한 값을 넣어라.
 * - 9*9에 1부터 81까지 순차적으로 1씩 증가한 값을 넣어라
 * - 각 행과 열의 합을 구하라.
 * - 가로 소계는 각 행의 9열에 넣어라
 * - 세로 소계는 각 열의 9열에 넣어라
 * ---------------각 대각선의 합을 구하라------------------------(위치값은 계산식으로 구하라)
 * 
 */
package Array;

public class ArrayExample03 {

	// 02 9열9행을 만들고, 값을 넣음
	final static int MAX_ROW = 9; // 9열
	final static int MAX_COL = 9; // 9행
	
	public static void main(String[] args) {
		
		int [][] td = new int [MAX_ROW +1][MAX_COL +1];
		int cnt = 0;
		int tot1 = 0;
		int tot2 = 0;
		
//		for (int row=0; row<MAX_ROW; row++) {
//			for (int col=0; col< MAX_COL; col++) {
//				cnt++;
//				if (row==col) {
//					tot1 +=cnt;
//					td[row][col] = cnt;
//				}
//				System.out.printf("[%3d]", td[row][col]);
//				
//			}
//			System.out.printf("[%3d]", tot1);
//			System.out.println();
//	}
//		System.out.println();
//		System.out.println();
		
//		for (int row=0; row<MAX_ROW; row++) {
//			for (int col=0; col< MAX_COL; col++) {
//				cnt++;
//				if ((MAX_COL-row)==col) {
//					tot1 +=cnt;
//					td[row][col] = cnt;
//				}
//				System.out.printf("[%3d]", td[row][col]);
//				
//			}
//			System.out.printf("[%3d]", tot1);
//			System.out.println();
//	}
		
//			for (int row=0; row<MAX_ROW; row++) {
//			for (int col=0; col< MAX_COL; col++) {
//				cnt++;
//				if (row==col) {
//					tot1 +=cnt;
//					td[row][col] = cnt;
//				}
//				
//				if ((MAX_COL-row)==col) {
//					tot2 +=cnt;
//					td[row][col] = cnt;
//				}
//				System.out.printf("[%3d]", td[row][col]);
//				
//			}
//			System.out.printf("[%3d]\n", tot1);
//		}
//			System.out.printf("tot1 : [%3d]", tot1);
//			System.out.printf("tot2 : [%3d]", tot2);
	
		for (int row=0; row<MAX_ROW; row++) {
		for (int col=0; col< MAX_COL; col++) {
			cnt++;
			
			tot1 += (row ==col) ? cnt : 0;
			td[row][col] = (row ==col) ? cnt : 0;
			
			tot2 +=((MAX_COL-row-1)==col) ? cnt:0;
			td[row][col] = ((MAX_COL-row-1) ==col) ? cnt : 0;
			
			System.out.printf("[%3d]", td[row][col]);
			
		}
		System.out.printf("[%3d]\n", tot1);
	}
		System.out.printf("tot1 : [%3d]", tot1);
		System.out.printf("tot2 : [%3d]", tot2);
	
	}
}
