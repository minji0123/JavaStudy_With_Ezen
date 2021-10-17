/*
 * 스위치(switch): 조건 제어문
 * - 조건식 : 문자열(String)
 * -------------------------------
 * 문자열 비교를 하면 안되는 이유(boolean을 사용해야 한다.)
 */
public class SwitchStatement03B {

	public static void main(String[] args) {
		
		String area = "부산";
		String areaCd="";
		String seoul = "서울";
		String daejeon = "대전";
//		String busan = "부산";
		String gg = "경기";
		String busan = new String("부산");
		
		
		// switch문으로 전화 지역번호 출력
//		switch(area) {
//		case "서울":
//			areaCd = "02";
//			break;
//		case "부산":
//			areaCd = "051";
//			break;
//		case "경기":
//			areaCd = "042";
//			break;
//		case "대전":
//			areaCd = "031";
//			break;
//							}
//		System.out.println(area+areaCd);
		
		// 1. 문자열 비교를 하면 안되는 이유(boolean을 사용해야 한다.)
		// 일단 여기는 값이 잘 나온다.
		if (area=="서울") {
			areaCd = "02";
		}
		else if (area=="대전"){
			areaCd = "042";
		}
		else if (area=="부산"){
			areaCd = "051";
		}else if (area=="경기"){
			areaCd = "031";
		}
		else {
			areaCd = "none";
		}
		
		// IF문으로 변경
		// 문자열 비교는 참조(주소)를 비교하기 때문에 값이 같아도, 다르다고 판단함
		// 문자열 비교(==)는 참조(주소)를 비교함으로 
		// 값이 같아도 주소가 달라서 같지 않다고 판단
		if (area==seoul) {
			areaCd = "02";
		}
		else if (area==daejeon){
			areaCd = "042";
		}
		else if (area==busan){
			areaCd = "051";
		}else if (area==gg){
			areaCd = "031";
		}
		else {
			areaCd = "none";
		}
		
		System.out.println(area+areaCd);
	
	
		// 그래서 .equals함수를 사용해야 함
		if (area.equals("서울")) {
			areaCd = "02";
		}
		else if (area.equals("대전")){
			areaCd = "042";
		}
		else if (area.equals("부산")){
			areaCd = "051";
		}else if (area.equals("경기")){
			areaCd = "031";
		}
		else {
			areaCd = "none";
		}
		
		System.out.println(area+areaCd);
	}
}
