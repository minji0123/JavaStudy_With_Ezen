/*
 * 반복문 for
 * ------------------------------------------------------------
 * [문제4] 1부터 100까지 1씩 증가하는 수에서 홀수의 합을 구하라
 */
public class ForExample04 {
	final static int MAX_NUMBER = 100;
	public static void main(String[] args) {
		
		// 내 풀이
//		int num;
//		int sum = 0;
//
//		for (num = 0; num <= 100; num++) {
//			if (num % 2 !=0) {
//				sum += num;
//				System.out.printf("num : (%d), sum : (%d)\n",num,sum);
//			}
//		}System.out.println(sum);
	
		
		// 선생님 풀이
		int sum = 0;
		
		for (int num=1; num<=100; num++) {
			if(num % 2 ==1) {
			sum += num;
			System.out.printf("num : (%d), sum : (%d)\n",num,sum);
			}
		}	
		System.out.printf("1부터 %d까지의 홀수의 합 : (%d)\n", MAX_NUMBER,sum);
		
	}

}
