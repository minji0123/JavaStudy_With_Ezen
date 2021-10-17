/*
 * 반복문 for
 * ------------------------------------------------------------
 * [문제1] n의 총 합을 구하라
 * - n은 1부터 10까지 1씩 증가하는 수이다.
 * 
 */
public class ForExample01A {

	public static void main(String[] args) {

		// 실수로 출력해보기
		int n;
		int sum=0;
		double dsum = 0.0;


		for (n=1; n<=10; n++) {// n++ n+=1 
			sum +=n;
			dsum +=n;
			System.out.printf("n(%d),sum(%d)\n",n,sum);
			
		}
		System.out.println(dsum);


	}

}
