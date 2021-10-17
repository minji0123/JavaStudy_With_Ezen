/*
 * 반복문(while)
 *----------------------------
 * 실행문에 증감넣기
 */
public class WhileStatement02A {

	public static void main(String[] args) {
	
		int cnt = 0;
		int sum = 0;
		
		
//		// cnt가 10보다 작거나 같을 때까지 반복 실행_실행문에 증감넣기
//		while(cnt<=10) {
//			cnt++;// 여기다 적으면 한번 더 더해진다.
//			sum +=cnt;
//			System.out.printf("cnt: %d, sum: %d\n", cnt, sum);
//		}
//		System.out.printf("합계 : %d\n", sum);
//		cnt: 11, sum: 66
//		합계 : 66
		
		
		
		// cnt가 10보다 작거나 같을 때까지 반복 실행_실행문에 증감넣기
		while(cnt<10) { // 10미만으로 적어준다.
			cnt++; // 증감을 밑으로 빼면
			sum +=cnt;
			System.out.printf("cnt: %d, sum: %d\n", cnt, sum);
		}
		System.out.printf("합계 : %d\n", sum);
//		cnt: 10, sum: 55
//		합계 : 55
	
	}

}
