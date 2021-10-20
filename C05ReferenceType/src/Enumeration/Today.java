/*
 * 날짜 : 오늘
 */
package Enumeration;

import java.util.Calendar;

public class Today {

	final static String[] weeks = new String []{"일", "월", "화", "수", "목", "금", "토"};
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		//1. 년 월 일 요일 출력
		int year = today.get(Calendar.YEAR );
		int month = today.get(Calendar.MONTH )+1; // 0부터 오기 때문에 +1해줬다.
		int day = today.get(Calendar.DAY_OF_MONTH );
		int week = today.get(Calendar.DAY_OF_WEEK );

	
		System.out.printf("오늘은 %d년 %d월 %d일 %d요일\n", year, month, day, week);

		// 1-1 숫자로 되어있는 요일을 한글요일로 변경 (배열을 사용해라)
		System.out.printf("오늘은 %d년 %d월 %d일 %s요일\n", year, month, day, weeks[week-1]);
	
		// 2. 시간 분 초 밀리초 출력
		int ampm = today.get(Calendar.AM_PM);
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		int millisecond = today.get(Calendar.MILLISECOND);
		System.out.printf("지금은 %s %d시 %d분 %d초 %d밀리초\n", 
				(ampm == 0)? "오전" : "오후",hour, minute, second, millisecond);
		
	}

}
