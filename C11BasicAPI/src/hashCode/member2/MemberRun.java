package hashCode.member2;

public class MemberRun {
	// equals() 출력
	// 안에 매개변수 추가해서 비교

	public static void main(String[] args) {
		Member mem1 = new Member("mem1", 30);
		Member mem2 = new Member("mem1", 31);
		Member mem3 = new Member("mem1", 32);

		System.out.println("mem1==mem2 : " + (mem1 == mem2));
		System.out.println("mem1==mem3 : " + (mem1 == mem3));
		System.out.println("mem2==mem3 : " + (mem2 == mem3));
		
		System.out.println();
		System.out.println("mem1.equals(mem2) : " + (mem1.equals(mem2)));
		System.out.println("mem1.equals(mem3) : " + (mem1.equals(mem3)));
		System.out.println("mem2.equals(mem3) : " + (mem2.equals(mem3)));
		// equals()오버라이딩 해서 id랑 age 두 값이 모두 같은지 비교함
	}

}
