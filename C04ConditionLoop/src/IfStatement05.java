/*
 * [문제] 출근을 하는데 지갑에 들어 있는 현금에 따라서 교통편을 선택한다.
 * 택시 : 5000원 이상
 * 버스 : 2500원 이상
 * 전철 : 1500원 이상
 * 도보 : 1500원 미만
 */
public class IfStatement05 {

	public static void main(String[] args) {
		int money = 10;
		String vehicle = "도보";
		
		if (money>0) {
			if (money >= 5000) {
				vehicle = "택시";
			}
			else if (money>=2500) {
				vehicle = "버스";
			}
			else if (money>=1500) {
				vehicle = "전철";
			}
			else {
				vehicle = "도보";
			}
		System.out.println(vehicle + "로 출근합니다.");
		}
		else {
			System.out.println("잘못된 값입니다.");
		}
		
	}
}

