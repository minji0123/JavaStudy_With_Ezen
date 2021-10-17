/*
 * 반복문 for
 * ------------------------------------------------------------
 * [문제3] 1부터 100까지 1씩 증가하는 수에서 총합을 구하여라
 * 조건 : 
 * - 10단위로 중간 결과를 출력하라.
 * - 총합은 맨 마지막에 한번만 출력하라
 */
public class ForExample03 {
	
	final static int MAX_NUMBER = 100;
	final static int MAX_TEN = 10;
	final static int MAX_SUM = MAX_NUMBER * (MAX_NUMBER + 1)/2;

	public static void main(String[] args) {
		
		// 1. for문 안에 if문으로 문제 풀기
//		int sum1 = 0;
//		int sum2 = 0;
//		for (int i=0; i<=100; i++) {
//			sum1+=i;
//			if (i%10 == 0) {
//				System.out.println(sum1);
//			}
//		}
//		System.out.println(sum1);
//		System.out.println();
		
		
		
		// 선생님 버전_구구단의 원리
		int sum=0;
		int cnt=0;
		
		// n:1, m:1,2,3,4,5,6,7,8,9,10,,,n:2, m:1,2,3,4,5,6,7,8,9,10,,,,
		for (int n=1; n <= MAX_TEN; n++){
//			System.out.println("n : "+n);
			
			for (int m=1; m <= MAX_TEN; m++) {
//				System.out.println("m : "+m);
				cnt++; // 1,2,3,4,5,6,7,8,9,10,11,12,,,
				sum+=cnt; // 시그마의 역할
			}
			System.out.printf("cnt(%d)=(%d)\n",cnt,sum);
		}
		
		System.out.println("총합 : "+sum);
	}

}
