/*
 * 스위치문(switch)
 * -----------------------
 * - case의 순서는 값 크기의 순서와 무관하지만, 가능하면 크기순으로 기술
 */
public class SwitchStatement01A {

	public static void main(String[] args) {
		int num = 5;
		
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
		default:
			System.out.println("값은 3이다.");
			break;
			
		}

	}

}
