package hashCode.member;

public class MemberRun2 {
	// equals(), ==

	public static void main(String[] args) {
		Member mem1 = new Member("member");
		Member mem2 = new Member("member");
		Member mem3 = new Member("member3");

		System.out.println("mem1==mem2 : " + (mem1 == mem2));
		System.out.println("mem1==mem3 : " + (mem1 == mem3));
		System.out.println("mem2==mem3 : " + (mem2 == mem3));
		
		System.out.println();
		System.out.println("mem1.equals(mem2) : " + (mem1.equals(mem2)));
		System.out.println("mem1.equals(mem3) : " + (mem1.equals(mem3)));
		System.out.println("mem2.equals(mem3) : " + (mem2.equals(mem3)));
		// Member.equals()를 오버라이딩함
		// id 값 비교 ㄱㄴ

	}

}
