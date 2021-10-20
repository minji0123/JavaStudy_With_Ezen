/*
 * [문제] 요일을 열거형으로 바꿔서 처리하라
 * - 영어와 한국어로 표현하라
 * 
 */
package Enumeration;

import java.util.Calendar;

public class TodayWeekEnum {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		

		int year = today.get(Calendar.YEAR );
		int month = today.get(Calendar.MONTH )+1; // 0부터 오기 때문에 +1해줬다.
		int day = today.get(Calendar.DAY_OF_MONTH );
		int week = today.get(Calendar.DAY_OF_WEEK );

		
		
		Week weekValuesK[] = Week.values();
		WeekEng weekValuesE[] = WeekEng.values();
		
		System.out.printf("오늘은 %d년 %d월 %d일 %s(%s)요일\n", year, month, day, weekValuesK[2], weekValuesE[2]);
		System.out.printf("오늘은 %d년 %d월 %d일 %s(%s)요일\n", year, month, day, weekValuesK[week-1], weekValuesE[week-1]);

		
	}

}
