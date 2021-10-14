/*
 * 조건문: if ~ else
 * - 조건식 : 비교연산자
 */
public class IfStatement02 {

	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;
		
		// 1. 괄호
		// 괄호를 감싸지 않으면 밑 한 문장만 if 의 영향을 받는다.
//		if (t!=f) {
//			System.out.printf("t(%b), f(%b)\n",t,f);
//			System.out.println("같지 않다.");
//		}
//		
		// 2. boolean 은 크기비교가 안된다.
//		if (t>f) {
//			System.out.println("크기비교가 안된다.");
//		}

		// 2-1. boolean 은 다른 자료형으로 캐스팅 변환을 할 수 없다.
//		int tNum = (int)t;
//		int fNum = (int)f;
		
		
		// 2-2 삼항연산자로 해결할 수 있다.
//		int tNum = (t) ? 1:0;
//		int fNum = (f) ? 1:0;
//		if(tNum==fNum) {
//			System.out.printf("t(%d), f(%d)\n",tNum,fNum);
//			System.out.println("두 값은 같다.");
//			
//		}
//		else {
//			System.out.printf("t(%d), f(%d)\n",tNum,fNum);
//			System.out.println("두 값은 다르다.");
//		}
//	

		int tNum = (t) ? 1:0;
		int fNum = (f) ? 1:0;
		if(tNum>fNum) {
			System.out.printf("t(%d), f(%d)\n",tNum,fNum);
			System.out.println("tNum이 크다.");
		
		}
		else {
			System.out.printf("t(%d), f(%d)\n",tNum,fNum);
			System.out.println("tNum이 작다.");
		}
		
		
		
	}
}
