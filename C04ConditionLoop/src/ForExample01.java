/*
 * 반복문 for
 * ------------------------------------------------------------
 * [문제1] n의 총 합을 구하라
 * - n은 1부터 10까지 1씩 증가하는 수이다.
 * 
 */
public class ForExample01 {

	public static void main(String[] args) {

		int n;
		int sum=0;
		
		for (n=1; n<=10; n++) {
			sum +=n;
		}
		System.out.println(sum);

	}

}
