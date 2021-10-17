/*
 * 스위치(switch): 조건 제어문
 * - 조건식 : 문자열(String)
 * - 문자열을 조건식으로, 스위치문 생성이 가능하다.
 * - 자바7 이상부터 가능
 */
public class SwitchStatement03 {

	public static void main(String[] args) {
		// 전화번호 시스템 출력
		
		// String area = "경기";
		String area = "서울";
		String areacd = "";
		
		switch(area) {
		case "서울":
			areacd = "02";
			break;
		case "대전":
			areacd = "042";
			break;
		case "부산":
			areacd = "051";
			break;
		case "경기":
			areacd = "031";
			break;
		}
		
		System.out.printf("전화국번: %s(%s)\n",  area, areacd);

	}

}