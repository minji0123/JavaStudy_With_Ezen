package people;

public class Woman extends People{
	
	int pregnant;
	
	public Woman(int height, int weight, int age) {
		super( height,  weight,  age);
		System.out.println("[여자]");
	}

	void showPregnantPeriod(int period) {
		if (period==0) {
			System.out.println("임신하지 않았다.");
		}
		else if (period>=1)
		{
			System.out.println("임신 "+ period+"차 이다.");
			
			if (period>=10) {
				System.out.println("출산 가능할듯??");
			}
		}
		
	}

	
	
}
