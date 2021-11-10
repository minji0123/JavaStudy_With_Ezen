/*
 * 자바의 모든 클래스는 Object를 상속함
 * 	- 굳이 우리가 뭐 안해줘도 됨
 * --------------------------------------------
 * equals()오버라이딩하면 객체 필드값으로 객체 비교 ㄱㄴ
 */
package hashCode.member2;

public class Member {
	public String id;
	private int age;

	public Member(String id, int age) {
		this.id = id;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (this.id.equals(member.id) && this.age==member.age) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String str = String.format("Member :id(" + this.id + ")");
		return str;
	}
}
