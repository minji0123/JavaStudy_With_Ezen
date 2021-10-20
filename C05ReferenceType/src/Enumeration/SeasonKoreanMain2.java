package Enumeration;

public class SeasonKoreanMain2 {

	public static void main(String[] args) {
		
		
		SeasonKorean seasonAutumn = SeasonKorean.가을;
		// valueOf()
		// 문자열로 가을 객체를 달라
		SeasonKorean seasonAutumnV = SeasonKorean.valueOf("가을");
		
		
		System.out.printf("season : %s, %s\n", seasonAutumn.name(), seasonAutumnV.name());
		System.out.printf("ordinal : %s, %s\n", seasonAutumn.ordinal(), seasonAutumnV.ordinal());
		
		System.out.printf("seasonAutumn == seasonAutumnV :  %b\n", (seasonAutumn== seasonAutumnV));
		// seasonAutumn == seasonAutumnV :  true
		
		/*
		 * 데이터를 밖에서 받아올 때 문자열로 올 때가 있다.
		 * 그 때 열거형으로 만들어서 사용해야 한다.
		 * 외부로부터 문자열을 입력받아 열거 객체로 변환할 때 유용하게 사용
		 * 
		 */
		
		// SeasonKorean.valueOf("문자열")을 사용하지 않고 처리
		// strSeason : 봄, 여름, 가을, 겨울, 잘못된 문자열 
//		String strSeason = "봄가을";
		
//		SeasonKorean sa = SeasonKorean.valueOf(strSeason);
//		System.out.println("계절? : " +sa.name()+ sa.ordinal());
		
		String strSeason = "봄";
		SeasonKorean fourSeason = null;
		switch(strSeason) {
		case "봄": fourSeason = SeasonKorean.봄; break;
		case "여름": fourSeason = SeasonKorean.여름; break;
		case "가을": fourSeason = SeasonKorean.가을; break;
		case "겨울": fourSeason = SeasonKorean.겨울; break;		
		}
	
		System.out.println("무슨계절? : " +fourSeason.name() + ", 몇번째? "+fourSeason.ordinal());
		
		
	}

}
