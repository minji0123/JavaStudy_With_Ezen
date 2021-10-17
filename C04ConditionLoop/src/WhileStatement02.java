/*
 * 반복문(while)
 *----------------------------
 *  조건에 증감 넣기
 */
public class WhileStatement02 {

	public static void main(String[] args) {
	
		int cnt = 0;
		int sum = 0;
		
		
		// cnt가 10보다 작거나 같을 때까지 반복 실행
		while(++cnt <=10) {
			sum +=cnt;
			System.out.printf("cnt: %d, sum: %d\n", cnt, sum);
		}
		System.out.printf("합계 : %d\n", sum);
	}

}
