/*
 * 자바의 모든 클래스는 Object를 상속함
 * 	- 굳이 우리가 뭐 안해줘도 됨
 */
package hashCode.member;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	// 블럭처리하면 실행결과는 주소값이 찍힌다.
	/*
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
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
	*/
	
	// 출력하면 값이 찍힌다.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
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
