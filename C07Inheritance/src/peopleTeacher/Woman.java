package peopleTeacher;

public class Woman extends People{
	
	int pregnancy;
	Woman(){}
	
	public Woman(String name) {
		super(name);
	}

	void childBirth(int monthCount) {
		pregnancy +=monthCount;
		if(pregnancy<10) {
			System.out.printf("산모 (%s)는 아직 출산 예정일이 아니다.\n", this.name);
			return;
		}
		System.out.printf("Woman : 출산 ㅊㅊ\n");
	}
}
