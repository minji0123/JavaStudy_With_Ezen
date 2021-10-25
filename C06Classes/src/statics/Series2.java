/*
 * final 필드
 * - 초기값이 지정되면 최종적인 값이 되어서 
 * - 프로그램 실행 도중에 수정할 수 없다.
 * - 선언할 때 초기값을 지정하지 않은 경우, 생성자에서 지정해줘야 한다.
 * - final field는 read only 읽기전용이다.
 * -----------------------------------------------------------------------------------------
 *  static final : 상수 constant
 *  변수이지만 값을 변경시킬 수 없음
 *  선언할 때 초기값을 지정해야 한다.
 *  관행적으로 변수 이름을 대문자로 기술한다.
 *  static final _ 정적, 수정할 수 없음
 */
package statics;



public class Series2 {
	final static int MIN_SERIES=10;
	final static int MAX_SERIES=10;
	static int series = MIN_SERIES;
	
	static int numCount=0;
	final String nation = "Korea";
	final String lastno;
	String pId;
	String model;
	String []pID = new String[MAX_SERIES];
	

	Series2(String pId){
		this.pId = pId;
		this.lastno = "XZ";
	}
	
	
	String makeModel() {
		String strSeries = String.valueOf(Series2.getSeries());

		this.model = pId + "-SERIES-" + strSeries;
		return this.model;
	}
	
	String makeModel2() {

		this.model = pId + "-SERIES-" + numCount;
		Series2.numCount++;
		return this.model;
	}
	
	
	
	
	public static int getSeries() {

		if (Series2.series++>Series2.MAX_SERIES){ //10이상이 되면은 
		Series2.series = MIN_SERIES; // 1로 바꿔라
		}
		return Series2.series;
	}


//	String serieshHistory() {
//		
//	}

}
