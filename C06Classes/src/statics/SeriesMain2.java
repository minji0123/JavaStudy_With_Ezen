/*
 * 시리즈 pId를 배열로 10이상을 만들어서
 * 반복문으로 작성하여 시리즈 번호가 반복되는 것을 확인
 */
package statics;

public class SeriesMain2 {

	public static void main(String[] args) {

		
		Series lg = new Series("LG");
		lg.makeModel();
		info(lg);

		Series ss = new Series("SAMSUNG");
		ss.makeModel();
		info(ss);
		
		
		
		
		
	}
	
	
	static void info(Series series) {
		// 직접 series.pId로 접근해도 되지만
		// getter로 접근하는게 통상적인 방법이다.
		
	
		System.out.println(series.getpId());
		System.out.println("model : "+ series.getModel());
		System.out.println("nation : "+ series.getNation());
		System.out.println("lastno : "+ series.getLastno());
		System.out.println();
	}
}
