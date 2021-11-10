package hashCode.member2;

public class MemberRun2 {
	// hashCode()
	// 객체를 식별하는 키 (git log에도 있었음)

	public static void main(String[] args) {
		Member mem1 = new Member("mem1", 30);
		Member mem2 = new Member("mem1", 31);
		Member mem3 = new Member("mem1", 32);

		/*
		 * [해시코드]
		 * 객체의 메모리 번지로 해시코드를 만들어서 관리함
		 * 		이케생김 (897913732)
		 * 자바객체를 식별하는 키임 
		 * 		그래서 객체마다 다른 값임
		 * 
		 */
		System.out.println("mem1 : " + mem1);
		System.out.println("mem1의 hashCode : " + mem1.hashCode());
		
	}

}
