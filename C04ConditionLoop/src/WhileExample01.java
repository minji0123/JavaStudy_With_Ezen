/*
 * 반복문(while)
 *----------------------------
 * while로 구구단 만들기
 */
public class WhileExample01 {
	final static int MIN_MULTIPLE = 2;
	final static int MAX_MULTIPLE = 9;
	
	public static void main(String[] args) {
		int m = MIN_MULTIPLE; // while문 기준으로, 전역변수
		
		while(m <= MAX_MULTIPLE);
			System.out.printf("%d 단\n");
			
			int n = 1;
			while (n<=MAX_MULTIPLE ) {
				int mn = n*n;//자기자신 기준으로, 로컬변수
				System.out.printf("%d x %d = %d\n" ,m,n,mn);
				n++;
			}
			m++;
			System.out.println("------------");
	}

}
// 전역변수, 로컬변수
// 전역변수 : application 전체를 통틀어 공유되는 변수
// 로컬변수 : 