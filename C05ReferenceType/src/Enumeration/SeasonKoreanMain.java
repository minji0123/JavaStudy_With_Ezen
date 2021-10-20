package Enumeration;

public class SeasonKoreanMain {

	public static void main(String[] args) {
		SeasonKorean season = SeasonKorean.가을;
		
		
		System.out.println("season : " + season);
		
		// 1. name()
		// 열거 객체가 가지고 있는 문자열을 리턴
		System.out.printf("season : %s\n", season.name()); 
		
		// 2. toString() 
		// 문자열로 변환시켜줌
		System.out.printf("season : %s\n", season.toString()); 
		
		System.out.printf("지금 계절은 %s이다.\n", season.name());
		
		// 3. ordinal()
		// 선언되어있는 열거 상수가 몇번째인지 알려줌 (0부터 시작함)
		System.out.println("ordinal : " + season.ordinal());		
		// --------------------------------------------------------------------
		SeasonKorean spring = SeasonKorean.봄;
		SeasonKorean summer = SeasonKorean.여름;
		SeasonKorean autumn = SeasonKorean.가을;
		SeasonKorean winter = SeasonKorean.겨울;
		
		System.out.println("ordinal(spring) : " + spring.ordinal());
		System.out.println("ordinal(summer) : " + summer.ordinal());
		System.out.println("ordinal(autumn) : " + autumn.ordinal());
		System.out.println("ordinal(winter) : " + winter.ordinal());
		
		// 4. values()
		// 열거 객체들을 배열로 만들어줌
		// 봄 객체를 배열로 만들어달라고했는데
		SeasonKorean[] seasonsSpring = spring.values();
		for (SeasonKorean row : seasonsSpring) {
			System.out.println("name : "+row.name() + " ordinal : "+row.ordinal());	
		}
//		name : 봄 ordinal : 0
//		name : 여름 ordinal : 1
//		name : 가을 ordinal : 2
//		name : 겨울 ordinal : 3
		// 다 출력되었다. 왜그런지 설명을 왜 안해주실까??
		
		
		//  SeasonKorean 안에 있는 값을 배열로 만들어달라
		SeasonKorean[] seasonsK = SeasonKorean.values();
		for (SeasonKorean row : seasonsK) {
			System.out.println("name : "+row.name() + " ordinal : "+row.ordinal());	
		}
//		name : 봄 ordinal : 0
//		name : 여름 ordinal : 1
//		name : 가을 ordinal : 2
//		name : 겨울 ordinal : 3
	}

}
