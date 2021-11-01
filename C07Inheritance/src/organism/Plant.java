package organism;

public class Plant extends Life{
	
	boolean photosynthesis;
	
	public Plant(int age, boolean breath) {
		super(age, breath);
		System.out.print("[식물]");
	}
	
	 void photosynthesis(boolean tf) {
		 System.out.println();
			if (tf == true) {
				System.out.println("광합성중... 살아있는듯");
			}
			else {
				System.out.println("쥬금");
			}
		}

}
