/*
 * 실행 클래스
 */
package abstracts;

public class SearchFinderRun {

	public static void main(String[] args) {
		SearchFindable sf = new SearchFinderImpl();
		SearchFindable.info(sf);
	}

}