/*
 * 반복문 for
 * ------------------------------------------------------------
 * [문제3]
 * 1부터 100까지 1씩 증가하는 수에서 총합을 구하여라
 * 조건 : 
 * - 10단위로 중간 결과를 출력하라.
 * - 총합은 맨 마지막에 한번만 출력하라
 */
public class ForExample03A {
	
	final static int MAX_NUMBER = 100;
	final static int MAX_TEN = 10;
	final static int MAX_SUM = MAX_NUMBER * (MAX_NUMBER + 1)/2; // SUM =  n*(n+1)/2
	
	public static void main(String[] args) {
		
		
		// cnt값을 m과 n의 조합으로 해서 1부터 100까지 
		// cnt = n*m꼴로
		int sum=0;
		int cnt=0;
		
		// n:1, m:1,2,3,4,5,6,7,8,9,10,,,n:2, m:1,2,3,4,5,6,7,8,9,10,,,,
		for (int n=1; n <= MAX_TEN; n++){ 
			for (int m=1; m <= MAX_TEN; m++) {
				
				cnt=((n-1)*10)+m; // ((5-1)*10)+1 = 41, ((5-1)*10)+2 = 42,,,,,,
				sum+=cnt;
			}
			System.out.printf("cnt(%d)=(%d)\n",cnt,sum);
		}
		
		System.out.println("총합 : "+sum);
		System.out.println("총합 : "+MAX_SUM);
	
	
	}

}
