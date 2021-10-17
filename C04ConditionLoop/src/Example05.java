/*
 * 중첩 for 문을 이용하여 방정식 4x + 5y = 60 의 모든 해를 구해서 (x,y) 형태로 출력하기
 * 단 x와 y 는 10 이하의 자연수
 * ---------------------------------------
 * ( , )
 */
public class Example05 {

		final static int X_NUMBER = 4;
		final static int Y_NUMBER = 5;

		public static void main(String[] args) {
			
			for (int x=1; x<=10; x++) {
//				System.out.println("x : "+x);
				
				for(int y=1; y<=10; y++) {
//					System.out.println("y : "+y);
				
					if (X_NUMBER*x+Y_NUMBER*y==60) {
						System.out.println("("+x+","+y+")");
					}
					
				}// for문 y
			}// for문 x
			

		
	}

}
