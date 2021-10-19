/*
 * [문제]
 * 2차원 배열(9*9)에 구구단 값을 넣어서 출력해라
 * - 1단부터 9단까지
 * - 1단계 : 배열의 곱셈의 값을 넣음
 * - 2단계 : 배열을 순회하면서 출력
 */
package Array;

public class TwoArray99 {

	public static void main(String[] args) {
		int [][]gg = new int[9][9];
		
		// 1. for문안에 값을 넣어서 출력하기
		for (int m=1; m<=9; m++) {
			for(int n = 1; n <=9; n++) {
				int mn = m*n;
//				System.out.printf("%d * %d = %d\n",m,n,mn );//잘 나오나 확인차 출력해봄
				gg [m-1][n-1] =mn; // 배열은 0부터 시작하기 때문에 -1해줘야 값이 잘 나옴
				System.out.printf("%d * %d = %d\n",m,n,mn );
			}
			System.out.println("-----------------------------------------");
		}
		
		// 2. for문안에 값을 length를 사용해서 출력하기 // 모르겠당
		for (int m=0; m<gg.length; m++) {
			for(int n = 0; n <gg[m].length; n++) {
				int mn = gg[m][n];
				System.out.printf("%d * %d = %d\n",m+1,n+1,mn ); // 
			}
			System.out.println("-----------------------------------------");
		}
		
		
	}

}
