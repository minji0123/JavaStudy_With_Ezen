/*
 * for 문을 이용해서 삼각형을 출력하는 코드를 작성
 * ---------------------------------------
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Example06 {

		public static void main(String[] args) {
			
			char star = '*';
			
			for (int x=1; x<=5; x++) {
				
				for (int y = 0; y<x; y++) {
					
				System.out.print(star);
				
				}// for문 y
				
				System.out.println(" ");
			}// for문 x
			
//		별 개수			x값		y값
//			*			1		0
//			** 			2		0,1
//			*** 		3		0,1,2
//			**** 		4		0,1,2,3
//			***** 		5		0,1,2,3,4


			
	}

}
