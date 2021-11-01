package organism; // 겉씨식물

public class Gymnosperm extends Plant{

	boolean flower;
	
	public Gymnosperm(int age, boolean breath) {
		super(age, breath);
		System.out.print("[겉씨식물]");
		System.out.println("  겉씨식물은 꽃이 없다.");
	}
	
	void showKindOfGymno(String str) {
		System.out.printf("------------%s의 특징------------\n", str);
		if(str.equals("소나무")) {
			
			System.out.println("종 : 소나무");
			System.out.println("속 : 소나무속");
			System.out.println("과 : 소나무과");
			System.out.println("강 : 구과식물강");
		}
		else if(str.equals("은행나무")) {
			System.out.println("종 : 은행나무");
			System.out.println("속 : 은행나무속");
			System.out.println("과 : 은행나무과");
			System.out.println("강 : 은행나무강");
		}
		else {
			System.out.println("아직 데이터가 없다.");
		}
	}
}
