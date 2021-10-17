/*
 * 반복문 for
 * ------------------------------------------------------------
 * [문제5] 1부터 100까지 1씩 증가하는 수에서 짝수의 합을 구하라
 */
public class ForExample04A {
	final static int MAX_NUMBER = 100;
	final static int MAX_SUM = MAX_NUMBER * (MAX_NUMBER + 1)/2;
	
	public static void main(String[] args) {
		
		// 선생님 풀이
		int sum = 0;
		
		for (int num=1; num<=100; num++) {
			if(num % 2 != 1) {
			sum += num;
			System.out.printf("num : (%d), sum : (%d)\n",num,sum);
			}
		}	
		System.out.printf("1부터 %d까지의 짝수 합 : (%d)\n", MAX_NUMBER,sum);
		System.out.printf("1부터 %d까지의 전체 합 : (%d)\n", MAX_NUMBER, MAX_SUM);

	}
}
