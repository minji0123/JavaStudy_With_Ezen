/*
 * 2차원 배열
 * - 자바는 일차원 배열이 서로 연결된 구조로, 다차원 배열을 구현
 * - 따라서 행렬식 구조가 아닌, 계단식 구조도 가질 수 있다.
 */
package Array;

public class TwoArrayInt {

	public static void main(String[] args) {
		// 1. 2차원 배열 모양
		//int [][]td = { {}, {} };
		
		// 2. 2차원 배열 선언, 값 할당, 출력
		int [][]td = { {1,2,3}, {4,5,6} };
		System.out.printf("td[0][0] : %d\n", td[0][0]);
		System.out.printf("td[0][1] : %d\n", td[0][1]);
		System.out.printf("td[0][2] : %d\n", td[0][2]);
		
		System.out.printf("td[0][0] : %d\n", td[1][0]);
		System.out.printf("td[1][1] : %d\n", td[1][1]);
		System.out.printf("td[2][2] : %d\n", td[1][2]);
//		td[0][0] : 1
//		td[0][1] : 2
//		td[0][2] : 3
//		td[0][0] : 4
//		td[1][1] : 5
//		td[2][2] : 6
		
		// 3.for 문으로 배열의 크기 출력
		System.out.println("행의 크기 : td.length=" + td.length);
		// 행의 크기 : td.length=2
		
		// 4. for문으로 배열 값 출력
		for (int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(td[i][j]+"");
			}
			System.out.println("");
		}
//		123
//		456
		// 4-1 length사용하기
		for (int row=0; row<td.length; row++) {
			for(int col=0; col<td[row].length; col++) {
				System.out.printf("td [%d] [%d] : %d\n",row,col,td[row][col]);
			}
			System.out.println("");
//			td [0] [0] : 1
//			td [0] [1] : 2
//			td [0] [2] : 3
//
//			td [1] [0] : 4
//			td [1] [1] : 5
//			td [1] [2] : 6
		}
		
	}

}
