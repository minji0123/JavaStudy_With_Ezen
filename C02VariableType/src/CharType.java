// character
// 하나의 문자 처리 단위
// 2바이트(16비트)
// 범위 : 0 ~ 65535, 0x0000~ 0xFFFF
// 16진수를 다룰 때는 앞에 0x를 붙인다.
// 유니코드처리, ASCII(0~127), 확장ASCII(0~255)
// 작은 따음표 사용
public class CharType {

	public static void main(String[] args) {
		char chA = 'A';
		char cha = 'a';
		char hangeul = '한';
		System.out.println("chA : " + chA);
		System.out.println("cha : " + cha);
		System.out.println("hangeul : " + hangeul);		

		
		char chA1 = 65;
		char chA2 = 0x41;
		char chA3 = 0x0041;
		
		System.out.println("chA1 : " + chA1);
		System.out.println("chA2 : " + chA2);
		System.out.println("chA3 : " + chA3);
		
		// 유니코드 : 가
		char hanUni = '\uac00';
		System.out.println("hanUni : " + hanUni);
		
		// 16진수 : 가
		char han16 = 0xac00;
		System.out.println("han16 : " + han16);
		
		// 10진수 : 가
		char han10 = 44032;
		System.out.println("han10 : " + han10);
	}

}
