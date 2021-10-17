/*
 * 반복문(while)
 * break : 블럭을 탈출
 * break label 
 * - 블럭을 레이블 영역까지 탈출
 * - 중첩된 다중의 블럭을 탈출할 때 유용
 * ---------------------------
 * [문제1] 구구단
 * - 구구단을 출력
 * - 처음 만나는 계산된 결과 값이 30보다 크면, 전체 반복문을 탈출
 */
public class WhileBreak01 {
	
	final static int MIN_MULTIPLE = 2;
	final static int MAX_MULTIPLE = 9;
	final static int BREAK_VALUE = 30;
	
	public static void main(String[] args) {
		// while문 전체탈출실패
//		int m = MIN_MULTIPLE;
//		
//		while(m <= MAX_MULTIPLE){
//			System.out.printf("%d 단\n");
//			
//			int n = 1;
//			while (n<=MAX_MULTIPLE ) {
//				int mn = m*n;
//				
//				if(mn>BREAK_VALUE) {
//					break;
//				}
	//		n++;		
	//		System.out.printf("%d x %d = %d\n" ,m,n,mn);
//				
//			}
//			System.out.println("------------");
//			m++;
//			
		
		
		int m = MIN_MULTIPLE;
		boolean stop = false; // true이면 멈춤
		
		while(m <= MAX_MULTIPLE && stop!=true){ //m이 9보다 작거나 같을때, 그리고 stop가 false일때
			System.out.printf("%d 단\n",m);
			int n = 1;
			
			while (n<=MAX_MULTIPLE ) { // n이 9보다 작거나 같을때, 
				int mn = m * n;
				
				if(mn>BREAK_VALUE) { // mn이 30보다 크면 멈춰랏!
					stop = true;
					break;
				}
				System.out.printf("%d x %d = %d\n" ,m,n,mn);
				n++;
			}
			m++;
			System.out.println("------------");			
		}
		
//		int m = MIN_MULTIPLE;
//		boolean stop = false; // true이면 멈춤
//		
//		while(m <= MAX_MULTIPLE && stop != true) {
//			System.out.printf("[%d] 단\n", m);
//			
//			int n = 1;
//			while(n <= MAX_MULTIPLE) {
//				int mn = m * n;
//				if(mn > BREAK_VALUE) {
//					stop = true;
//					break;
//				}
//				System.out.printf("[%d] * [%d] = [%d]\n", m, n, mn);
//				n++;
//			}
//			
//			m++;
//			System.out.println("-------------------------------");
//		}
//		
//		System.out.println("THE END");
		
		
	}
}
// 전역변수, 로컬변수
// 전역변수 : application 전체를 통틀어 공유되는 변수
// 로컬변수 : 지역변수