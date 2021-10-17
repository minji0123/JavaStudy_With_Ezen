/*
 * 스위치(switch): 조건 제어문
 * - 조건식 : 문자열(String)
 * ---------------------------
 * float형은 스위치 사용 불가
 */
public class SwitchStatement05 {

	public static void main(String[] args) {
		float sw = 1.0f;
		int result = 0;

		// 오류문구 복붙
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		// Cannot switch on a value of type float. Only convertible int values, strings or enum variables are permitted
		// sw는 float형이기 때문에 안된다.
		
		
//		switch(sw) {
//		case 1.0f: result = (int)(100*sw); break;
//		case 2.0f: result = (int)(200*sw); break;
//		case 3.0f: result = (int)(300*sw); break;
//		}
//	System.out.println(sw+result);

		switch((int)sw) {
		case 1: result = (int)(100*sw); break;
		case 2: result = (int)(200*sw); break;
		case 3: result = (int)(300*sw); break;
		}
	System.out.println(sw+result);
	
	}
	

}
