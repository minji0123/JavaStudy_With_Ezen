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

public class Series {
	final static int MIN_SERIES=1;
	final static int MAX_SERIES=10;
	static int series = MIN_SERIES;
	
	
	// 초기값을 지정하는 final
	final String nation = "Korea";
	// 초기값을 지정하지 않은 final
	final String lastno;
	String pId;
	String model;
	
	// 생성자
	Series(String pId){
		this.pId = pId;
		this.lastno = "XZ";// 하지만 이렇게 사용하지 않는다
	}
	
//	Series(String pId, String lastno){
//		this.pId = pId;
//		this.lastno = lastno;// 하지만 이렇게 사용하지 않는다
//	}
	
	// 메소드
	String makeModel() {
		String strSeries = String.valueOf(Series.getSeries());
		this.model = pId + "-SERIES-" + strSeries;
		return this.model;
	}
	
	
	
	
	// getter : 값을 전달한다.
	// static 메소드
	// 저장한 값 전달용
	public static int getSeries() {
		if (Series.series++>Series.MAX_SERIES){ //10이상이 되면은 
		Series.series = MIN_SERIES; // 1로 바꿔라
		}
		return Series.series;
	}
	// setter : 값을 읽는다.
	// static은 보통 값을 바꾸지 않기 때문에
	// static setter는 사용을 거의 하지 ㅇ낳는다.
//	public static void setSeries(int series) {
//		Series.series = series;
//	}

	public String getpId() {
		return pId;
	}
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	// final 상수의 게터세터 인풋을 명령했는데
	// 게터만 만들어줌
	// 값을 변경시킬 수 없기 때문에 세터는 만들지 못함
	public String getNation() {
		return nation;
	}

	public String getLastno() {
		return lastno;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

}
