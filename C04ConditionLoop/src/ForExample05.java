/*
 * [문제5] 임의의 수에서 임의의 배수를 구하라.
 * - 난수를 발생시켜 임의의 수를 지정하기
 * - 2부터 5까지의 배수
 * - 임의의 수는 10 이상 100이하
 * - 10 이상인 난수를 발생시켜서 2부터 5까지의 배수를 구하라
 * 
 * ------------------------------------------------------------
 * 예) 
 * 최대값 : 15(난수)
 * 배  수 : 4(난수)
 * 결  과 : 4, 8, 12
 */
public class ForExample05 {
	// 임의의 수
	final static int MIN_NUMBER = 10; // 임의의 수 최소값
	final static int MAX_NUMBER = 100; // 임의의 수 최대값
	// 배수
	final static int MIN_MULTIPLE = 2; // 배수 최소값
	final static int MAX_MULTIPLE = 5; // 배수 최대값
	
	public static void main(String[] args) {
		//내 방법
//		int min = 10;
//		int max = 99;
//		int num = (int)(Math.random()*(max-min+1))+min;
//		int multiples = 0;
//		
////		System.out.println(num);
//		for (num=10 ; num<100 ; num+=num) {
//			System.out.println("최대값 : " + num + "(난수)");
//		
//			if (num%2==0) {
//				multiples = 2;
//				
//			}
//			else if (num%3==0) {
//				multiples = 3;
//			}
//			else if (num%4==0) {
//				multiples = 4;
//			}
//			else if (num%5==0) {
//				multiples = 5;
//			}		
//			System.out.println("배수 : " + multiples+ "(난수)");
//			System.out.println("결과 : " + num + "(난수)");
//			System.out.println("-----------");
//			
//		}
		
		// 선생님
		// MIN_NUMBER = 10  MAX_NUMBER = 100   MIN_MULTIPLE = 2   MAX_MULTIPLE = 5;
		
		// 난수 발생시키기
		// int maxNum = (int)(Math.random()*(100-10+1))+10;
		int maxNum = (int)(Math.random()*(MAX_NUMBER-MIN_NUMBER+1))+MIN_NUMBER;
		
		
		// 난수_배수 발생시키기
		int multiple = (int)(Math.random()*(MAX_MULTIPLE-MIN_MULTIPLE+1))+MIN_MULTIPLE;
		
		System.out.printf("최대값 : (%d) <= [%d] <= (%d)\n",MIN_NUMBER, maxNum,MAX_NUMBER);
		System.out.printf("배수값 : (%d) <= [%d] <= (%d)\n",MIN_MULTIPLE,multiple,MAX_MULTIPLE);
		System.out.printf("결과 : ");
		
		// for 문으로 배수 결과 출력하기
		for (int num = multiple; num<=maxNum; num+=multiple) {
			System.out.printf("%d ",num);
		}
		
	}
}