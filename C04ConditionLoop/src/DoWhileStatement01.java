/*
 * 반복문 : do~while
 * ---------------------------
 * do{
 * 		실행문
 * } while(조건식);
 * -----------------------------
 * 1. 반복문(while)과 같이 조건식이 참이면 계속 반복수행
 * 2. 최초에 한 번은 반드시 실행문을 처리
 * 3. 조건식을 판단하여, 조건식이 거짓이면 탈출
 * 
 * 
 */
public class DoWhileStatement01 {

//	final static int MAX_NUMBER = 0;
	final static int MAX_NUMBER = 10;
	
	public static void main(String[] args) {
		// 1부터 10까지 더하기
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
			System.out.printf("num(%d) -> sum(%d)\n",num,sum);
			 
		} while(num<=MAX_NUMBER);
		System.out.println("num : "+ num +", 합계 : " + sum);
		// num : 11, 합계 : 55
	}

}
