/*
 * 반복문 for
 * ------------------------------------------------------------
 * [문제1] n의 총 합을 구하라
 * - n은 1부터 10까지 1씩 증가하는 수이다.
 * 
 */
public class ForExample01B {

	public static void main(String[] args) {
		int sum = 0;
		
		// for문 초반에 변수 선언
		for(int n=1; n <= 10; ++n) { // n++, n = n + 1, n += 1
			sum += n;

			System.out.printf("n(%d), sum(%d)\n", n, sum);
		}
		
		System.out.println("총합은? " + sum);
	}

}