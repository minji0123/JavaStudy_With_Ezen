/*
 * 반복문 for
 * ------------------------------------------------------------
 * [문제6] 1부터 100까지 1씩 증가하는 수에서 홀수와 짝수의 합을 각각 구하라
 */
public class ForExample04B {
	
	final static int MAX_NUMBER = 100;
	final static int MAX_SUM = MAX_NUMBER * (MAX_NUMBER + 1)/2;
	
	
	public static void main(String[] args) {
		int num1;
		int num2;
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (num1 = 0, num2 = 0; (num1<=100 && num2<=100) ; num1++,num2++) {
			if(num1 % 2 ==1) {
				sum1 += num1;
				System.out.printf("num1 : (%d), sum1 : (%d)\n",num1, sum1);
			}
			else {
				sum2 += num2;
				System.out.printf("num2 : (%d), sum2 : (%d)\n",num2, sum2);
			}
		}
		System.out.printf("1부터 %d까지의 홀수 합 : (%d)\n", MAX_NUMBER,sum1);
		System.out.printf("1부터 %d까지의 짝수 합 : (%d)\n", MAX_NUMBER,sum2);
		System.out.printf("1부터 %d까지의 전체 합 : (%d)\n", MAX_NUMBER, MAX_SUM);
		
		int checkodd = MAX_SUM-sum2;
		int checkeven = MAX_SUM-sum1;
	
		System.out.printf("홀수의 합 : checkodd(%d), sum1(%d), : (%b) \n", checkodd, sum1, (checkodd==sum1));
		System.out.printf("짝수의 합 : checkeven(%d), sum2(%d), : (%b) \n", checkeven, sum2, (checkeven==sum2));
//		System.out.printf("짝수의 합 : checkeven(%d), "
//				+ "sum2(%d), : (%b) \n", checkeven, sum2, (checkeven==sum2));
		// 엔터를 하면, +를 붙여줘야 한다.
	}

}
