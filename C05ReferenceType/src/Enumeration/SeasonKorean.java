/*
 * 열거형 : 목록
 *  (여러 개의 상수 데이터를 선언하는데 유용함)
 * - 특정한 의미를 갖는 그룹의 개별적인 상수에 이름 (-? 뭔소리야이게)
 * - 계절 : 봄, 여름, 가을, 겨울
 * - 열거형 이름은 파일 이름과 동일
 * 		enum Season(Season.java)
 * - 열거형 상수는 관례적으로 모두 대문자임
 			SPRING, -> 콤마로 구분
			SUMMER,
			AUTUMN,
			WINTER -> 마지막에는 붙이지 않음

 */
package Enumeration;

public enum SeasonKorean {
	봄,   // 3~5월
	여름, // 6~8월
	가을, // 9~10월 
	겨울 // 11~2월
}
