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
public class ForBreak02 {
	
	final static int MIN_MULTIPLE = 2; // 2단부터
	final static int MAX_MULTIPLE = 9; // 9단까지
	final static int BREAK_VALUE = 30; // 30이 넘으면 탈출
	
	public static void main(String[] args) {
		// 1. 변수를 for문 전에 선언
		int m = MIN_MULTIPLE;
MultipleBreak:
		for(;;) { // while(true), 무한루프, (초기식, 조건식, 증감식 생략)
			
//				30이 넘으면 탈출할 수 있는 if문 (생략 가능)
//				if(m > MAX_MULTIPLE) {
//					break;
//				}
				System.out.printf("%d단\n", m);
				int n = 1; // for문에서 n=1선언
				
				while(n <= MAX_MULTIPLE) { // n이 9보다 작거나 같을 때까지
					int mn = m * n; // m * n
						if(mn > BREAK_VALUE) { // 만약 m*n이 30보다 크면 탈출
							break MultipleBreak;
						}
						
					System.out.printf("[%d] * [%d] = [%d]\n", m, n, mn);
					n++; // while문에서 n ++
				}
			
				m++; // for문에서 m++ (원래는 for()안에 적어줌)
				System.out.println("-------------------------------");
			}
			
			System.out.println("THE END");
		}

	}	

// 전역변수, 로컬변수
// 전역변수 : application 전체를 통틀어 공유되는 변수
// 로컬변수 : 