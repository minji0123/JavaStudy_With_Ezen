/*
 * 반복문(while)
 *----------------------------
 *while(조건식) {
 *		실행문
 *}
 *-----------------------------
 *- while 수행 
 *- 조건식이 참이면 블럭(실행문) 계속 수행 
 *- 조건식이 거짓이 되면 블럭을 탈출
 *--------------------------------
 * -if문과 비교
 *- if문은 블럭이 한 번 실행되지만, while은 반복실행된다.
 */
public class WhileStatement01 {

	public static void main(String[] args) {
		
		int cnt = 0;
		boolean tf = false;
		
		// 거짓이면 실행되지 않는다.
		while(tf) { 
			System.out.println("cnt = "+ (++cnt));
		}
		// 출력 결과 : 아무 반응 없음
		System.out.println("END WHILE BLOCK 1 ");
		
		
		// 참이면 실행되지 않는다.
		while(true) { 
			System.out.println("cnt = "+ (++cnt));
		}
		// Unreachable code
		// 무한히 실행되기 때문에 밑의 출력문에는 도달하지 않아서 오류가 뜬다.
		// System.out.println("END WHILE BLOCK 2");
		
		
	}

}
