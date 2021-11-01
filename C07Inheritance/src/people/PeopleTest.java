package people;

public class PeopleTest {

	public static void main(String[] args) {

		People p1 = new People(160,48,27);
		p1.showRun(true);
	
		System.out.println();
		Man m1 = new Man(160,48,27);
		m1.showwalk(true);
		m1.showHunt(false);
		m1.showwork(false);
		
		System.out.println();
		Woman w1 = new Woman(160,48,27);
		w1.showPregnantPeriod(11);
	}

}
