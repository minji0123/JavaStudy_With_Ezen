/*
 * 2차원 배열 : 계단식 구조
 * - 자바는 일차원 배열이 서로 연결된 구조로, 다차원 배열을 구현
 * - 따라서 행렬식 구조가 아닌, 계단식 구조도 가질 수 있다.
 */
package Array;

public class TwoArrayInt3 {

	public static void main(String[] args) {

		// 1. 배열에 null값 입력
		int [][] scores = new int[2][]; // 2행 ?열
		System.out.println("scores.length : "+scores.length+"행"); 
		// scores.length : 2행이구나
		
		// 2. 행과 열 크기 출력
		for (int row = 0; row < scores.length; row++) {
			System.out.println("scores.length : "+row+"행"+scores[row]+"열"); 
		}
//		scores.length : 0행null열
//		scores.length : 1행null열
		
		// 2. 행과 열 크기 출력(null 패스)
		for (int row = 0; row < scores.length; row++) {
			int col = (scores[row] == null) ? 0 : scores[row].length; // null이 면 0을 넣어라
			System.out.println("scores.length : "+row+"행"+col+"열"); 
		}
//		scores.length : 0행0열
//		scores.length : 1행0열
	
		//4. 
//		for (int row = 0; row < scores.length; row++) {
//			if(scores[row] == null) {
//				scores[row] = new int[] {1,2,3};
//			}
//			int col = (scores[row] == null) ? 0 : scores[row].length; // null이 면 0을 넣어라
//			System.out.print(row+"행"+col+"열 : "); 
//			
//			for (int colval : scores[row]) {
//			System.out.print(colval); 
//			
//			}
//			System.out.println();
//		}
//		0행1열2열3열
//		1행1열2열3열
		
		//4. 열 값을 증가시킴
		for (int row = 0; row < scores.length; row++) {
			if(scores[row] == null) {
				scores[row] = new int[] {(row+1)*1,(row+1)*2,(row+1)*3};
			}
			int col = (scores[row] == null) ? 0 : scores[row].length; // null이 면 0을 넣어라
			System.out.print(row+"행"+col+"열 : "); 
			
			for (int colval : scores[row]) {
			System.out.print(colval); 
			
			}
			System.out.println();
		}
//		0행3열 : 123
//		1행3열 : 246
		
	}
}
