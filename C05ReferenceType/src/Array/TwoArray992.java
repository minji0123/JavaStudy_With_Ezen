/*
 * [문제]
 * m : 1부터 10까지 1씩 증가하는 수
 * n : 1부터 m까지 1씩 증가하는 수
 * 배열 (m*n)을 만들어 m*n의 값을 넣고 출력하기
 * 각 배열의 행m은 n만큼 열 n을 만들어라
 * 예 1행1열 2행2열...10행10열 행과 열을 배열로 만들기
 * 11
 * 212
 * 3123
 * ...
 * 이렇게 출력
 * 
 * 
 */
package Array;

public class TwoArray992 {
		
	final static int MAX_NUMBER = 10;
		
	public static void main(String[] args) {
		int[][] table = new int [MAX_NUMBER][]; // 열은 아직 결정되지 않았기 때문에 비워놓는다.
		
		for (int m =1; m <=MAX_NUMBER; m++) { // 행 정의
			
			 // 1. m*n의 값을 넣을 배열 (m*n)을 만들기
			table [m-1] = new int[m]; // 0번째에 만들어야 하기 때문에
			
			for (int n = 1; n<=m; n++) { // 열 정의
				int mn = m*n;
				// 2. m*n의 값 배열에 넣어주기
				table[m-1][n-1] = mn; //배열은 0부터 시작하기 때문에 
//				System.out.printf("m[%d] n[%d] : %d\n",m,n,m*n); // 3. m*n의 값을 출력하기
			}
//			System.out.println("---------------------------------");
		}
		
		
//		for (int m =1; m < table.length; m++) { // 행 정의, table 길이보다 작거나 같을동안 실행
//		
//			for (int n = 0; n<=m; n++) { // 열 정의
//				int mn = table[m][n];
//				System.out.printf("m[%d] n[%d] : %d\n",m+1,n+1,mn); // 3. m*n의 값을 출력하기, 0부터 출력했기 때문에 +1 해줘야 한다.
//			}
//			System.out.println("---------------------------------");
//		}

		for (int m =0; m <= table.length; m++) { // 행 정의, table 길이보다 작거나 같을동안 실행
			for (int n = 0; n<=m; n++) { // 열 정의
				int mn = table[m][n];
				System.out.printf("m[%d] n[%d] : %d\n",m+1,n+1,mn); // 3. m*n의 값을 출력하기, 0부터 출력했기 때문에 +1 해줘야 한다.
				for (int star = 0; star < mn; star++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("---------------------------------");
		}
	}

}
