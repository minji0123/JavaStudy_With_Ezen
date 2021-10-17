/*
 * 반복문 for 에서 continue
 * - continue를 만나면 실행의 위치를 반복문의 시작점(조건식 부분) 으로 이동
 * - continue의 아래에 있는 실행문을 처리하지 않음
 * - pass하라 넘어가라 라는 의미
 * ------------------------------
 * for(;;){
 * 		실행문1;
 * 		실행문2;
 * 		if(조건식) {
 * 			continue;
 * 		}
 * 		실행문3;
 * 		실행문4;
 * }
 * ---------------------------------------------------------
 * [문제1] 0부터 10까지 짝수만 더하기
 */
public class ForContinue01 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int num = 0; num<=10; num++) {
			if(num % 2 == 1) { // 홀수이면 계산하지 않음
				continue; // 다시 for문으로 이동하여 증감식 -> 조건식 수행
			}
			sum += num;
			System.out.println("num : "+num+" sum : "+sum);
			
		}

	}

}
