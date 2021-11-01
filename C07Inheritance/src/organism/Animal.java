package organism;

public class Animal extends Life {
	boolean move;
	
	public Animal(int age, boolean breath) {
		super(age, breath);
		System.out.print("[동물]");
	}
	
	void showMove(boolean tf) {
		System.out.println();
		if (tf == true) {
			System.out.println("움직임... 살아있는듯");
		}
		else {
			System.out.println("싸늘하다");
		}
	}
}
