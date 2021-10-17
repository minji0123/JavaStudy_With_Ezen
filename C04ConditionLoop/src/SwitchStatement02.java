/*
 * 스위치(switch): 조건 제어문
 * -------------------------------------
 * 난수 발생시키기
 * 0부터 10까지 : Math.random()*11
 */
public class SwitchStatement02 {

	public static void main(String[] args) {
		
		// 0부터 10까지 난수
		int num = (int)(Math.random() * 11);
		System.out.println("[SWITCH 문] num=" +num);
		
		switch(num) {
		case 0:
			System.out.println("값은 0이다.");
			break;
		case 1:
			System.out.println("값은 1이다.");
			break;
		case 2:
			System.out.println("값은 2이다.");
			break;
		case 3:
			System.out.println("값은 3이다.");
			break;
		case 4:
			System.out.println("값은 4이다.");
			break;
		case 5:
			System.out.println("값은 5이다.");
			break;
		case 6:
		case 7:	
			System.out.println("값은 6이거나 7이다.");
			break;
			
		default:
			System.out.println("값은 없다.");
			break;
		}
		
		// if 문으로 바꿔보기
		int num1 = (int)(Math.random() * 11);
		
		if (num1==0) {
			System.out.println("값은 0이다.");
		}
		else if (num1==1) {
			System.out.println("값은 1이다.");
		}
		else if (num1==2) {
			System.out.println("값은 2이다.");
		}
		else if (num1==3) {
			System.out.println("값은 3이다.");
		}
		else if (num1==4) {
			System.out.println("값은 4이다.");
		}
		else if (num1==5) {
			System.out.println("값은 5이다.");
		}
		else if (num1==6 || num1==7) {
			System.out.println("값은 6이거나 7이다.");
		}
		else {
			System.out.println("해당사항 없음");
		}
	}
}
