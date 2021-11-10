package hashCode.member3;

public class MemberRun {
	// hashCode()
	// 객체를 식별하는 키 (git log에도 있었음)

	public static void main(String[] args) {
		Member mem1 = new Member("mem1", 30);
		Member mem2 = new Member("mem1", 30);
		Member mem3 = new Member(new String("mem1"), 30);
//		Member mem3 = new Member("mem1", 30);

		// toString, hashCode
		System.out.println("toString()오버라이딩 + 해시코드 추가");
		System.out.println(mem1);
		System.out.println(mem2);
		System.out.println(mem3);

		// hashCode
		System.out.println();
		System.out.println("hashCode()오버라이딩+ 해시코드 추가");
		System.out.println("mem1의 hashCode : " + mem1.hashCode());
		System.out.println("mem2의 hashCode : " + mem2.hashCode());
		System.out.println("mem3의 hashCode : " + mem3.hashCode());

		// 딴거도 비교해보기
		System.out.println();
		System.out.println("mem1==mem2 : " + (mem1 == mem2));
		System.out.println("mem1==mem3 : " + (mem1 == mem3));
		System.out.println("mem2==mem3 : " + (mem2 == mem3));

		System.out.println();
		System.out.println("mem1.equals(mem2) : " + (mem1.equals(mem2)));
		System.out.println("mem1.equals(mem3) : " + (mem1.equals(mem3)));
		System.out.println("mem2.equals(mem3) : " + (mem2.equals(mem3)));
		// 값이 같아도 해시키가 다르면 다른 객체로 인식함

	}

}
