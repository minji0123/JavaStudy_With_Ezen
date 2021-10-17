/*
 * 반복문 : do~while
 * ---------------------------
 */
public class DoWhileStatement01C {

//	final static int MAX_NUMBER = 0;
	final static int MAX_NUMBER = 10;
	
	public static void main(String[] args) {
		// 1부터 10까지 더하기
		// num++를 먼저하기
		int num = 0;
		int sum = 0;
		
		do {
//			num++;
			sum += num;
			System.out.printf("num(%d) -> sum(%d)\n",num,sum);
			
		}while(num++ < MAX_NUMBER);
		
		// 둘다 된다.
		--num;
//		num--
		System.out.println("num : "+num+", 합계 : " +sum);
		// num : 10, 합계 : 55
	}

}
