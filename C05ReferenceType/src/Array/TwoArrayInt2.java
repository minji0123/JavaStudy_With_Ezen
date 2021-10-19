/*
 * 2차원 배열
 * - 자바는 일차원 배열이 서로 연결된 구조로, 다차원 배열을 구현
 * - 따라서 행렬식 구조가 아닌, 계단식 구조도 가질 수 있다.
 */
package Array;

public class TwoArrayInt2 {

	public static void main(String[] args) {

		// 1. 2차원 계단식 배열 선언, 값 할당
		int [][]td = { {11}, {21,22},{31,32,33},{41,42} };

		
		// 3.for 문으로 배열의 크기 출력
		System.out.println("행의 크기 : td.length=" + td.length);
		// 행의 크기 : td.length=3


		// 4-1 length사용하기
		for (int row=0; row<td.length; row++) {
			System.out.println(row+"행"+td[row].length+"열");
			for(int col=0; col<td[row].length; col++) {
				System.out.printf("td [%d] [%d] : %d\n",row,col,td[row][col]);
			}
			System.out.println("");

		}
//		0행1열
//		td [0] [0] : 11
//
//		1행2열
//		td [1] [0] : 21
//		td [1] [1] : 22
//
//		2행3열
//		td [2] [0] : 31
//		td [2] [1] : 32
//		td [2] [2] : 33
//
//		3행2열
//		td [3] [0] : 41
//		td [3] [1] : 42
		
		
	}

}
