package people;

public class Man extends People{

	boolean hunt;
	
	
	public Man(int height, int weight, int age) {
		super( height,  weight,  age);
		System.out.println("[남자]");

	}
	void showHunt(boolean tf) {
		if (tf == true) {
		System.out.println("남자는 사냥한다.");
		}
		else {
			System.out.println("남자는 사냥하지 않는다.");
		}
	}
	
}
