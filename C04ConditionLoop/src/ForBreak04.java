/*
 * for문 break
 * break : 블럭을 탈출
 * break label 
 * - 블럭을 레이블 영역까지 탈출
 * - 중첩된 다중의 블럭을 탈출할 때 유용
 * ---------------------------
 * [문제] 구구단
 * - 구구단을 출력
 * - 처음 만나는 계산된 결과 값이 30보다 크면, 전체 반복문을 탈출
 */
public class ForBreak04 {
	final static int MIN_MULTIPLE = 2;
	final static int MAX_MULTIPLE = 9;
	final static int BREAK_VALUE = 30;
	
	public static void main(String[] args) {
		int m = MIN_MULTIPLE;
		
MultipleBreak:
		for(;;m++) {
			System.out.printf("[%d] 단\n", m);
				
			int n = 1;
				
			while(n <= MAX_MULTIPLE) {
					int mn = m * n;
						if(mn > BREAK_VALUE) {
							break MultipleBreak;
						}
					System.out.printf("[%d] * [%d] = [%d]\n", m, n, mn);
					n++;
				}
			
				System.out.println("-------------------------------");
			}
			
			System.out.println("THE END");
		}

	}
// 전역변수, 로컬변수
// 전역변수 : application 전체를 통틀어 공유되는 변수
// 로컬변수 : 