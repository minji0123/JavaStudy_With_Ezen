/*
 * while 문과 MATH.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 
 * 눈의 합이 5가 아니면 계속 주사위를 던지고 눈의 합이 5이면 실행을 멈추는 코드를 작성
 * ---------------------------------------
 * 눈의 합이 5 : (1,4), (4,1), (2,3), (3,2)
 */
public class Example04 {

		final static int MIN_NUMBER = 1;
		final static int MAX_NUMBER = 6;

		public static void main(String[] args) {
			boolean run = true;
			
			while (run) {
				int dice1 = (int)(Math.random()*(MAX_NUMBER-MIN_NUMBER+1))+MIN_NUMBER;
				int dice2 = (int)(Math.random()*(MAX_NUMBER-MIN_NUMBER+1))+MIN_NUMBER;
				int sum = dice1 + dice2;
			
//				System.out.printf("(%d, %d)",dice1, dice2);
			
				if(sum == 5) {
					System.out.printf("(%d, %d)\n",dice1, dice2);
					run=false;
				}
				else {
					System.out.printf("(%d, %d)\n",dice1, dice2);
					continue;
				}
			}
		
	}

}
