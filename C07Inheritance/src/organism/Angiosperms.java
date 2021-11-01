package organism; // 속씨식물

public class Angiosperms extends Plant{

	boolean flower;
	
	public Angiosperms(int age, boolean breath) {
		super(age, breath);
		System.out.print("[속씨식물]");
		System.out.println("  속씨식물은 꽃이 있다.");
	}
	
	void showKindOfGymno(String str) {
		System.out.printf("------------%s의 특징------------\n", str);
		if(str.equals("민들레")) {
			
			System.out.println("종 : 민들레");
			System.out.println("속 : 민들레속");
			System.out.println("과 : 국화과");
			System.out.println("강 : 쌍떡잎실물강");
		}
		else if(str.equals("벼")) {
			System.out.println("종 : 벼");
			System.out.println("속 : 벼속");
			System.out.println("과 : 벼과");
			System.out.println("강 : 미분류");
		}
		else {
			System.out.println("아직 데이터가 없다.");
		}
	}
}
