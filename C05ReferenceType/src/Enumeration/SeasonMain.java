package Enumeration;

public class SeasonMain {

	public static void main(String[] args) {
		Season season = Season.AUTUMN;
		
		System.out.println("season : " + season);
		
		if (season == Season.SUMMER) {
			System.out.println("지금 계절은 여름이다.");
		}
		else if (season == Season.AUTUMN) {
			System.out.println("지금 계절은 가을이다.");
		}
		else  {
			System.out.println("지금 계절은 모른다.");
		}
		
		
	}

}
