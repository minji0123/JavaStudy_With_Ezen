/*
 * 자바의 모든 클래스는 Object를 상속함
 * 	- 굳이 우리가 뭐 안해줘도 됨
 * --------------------------------------------
 * [객체 비교 처리 순서]
 * 1. hashCode()
 * 2. equals()
 * 두개 다 true 여아 같은 객체로 인식함
 */
package hashCode.member3;

//해시코드 객체마다 바꿔보기
public class Member {
	private static int hashCount = 0;

	private String id;
	private int age;
	private int hashCode;

	public Member(String id, int age) {
		this.id = id;
		this.age = age;
		this.hashCode = ++hashCount;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			if (this.hashCode == obj.hashCode()) {
				Member member = (Member) obj;
				if (this.id.equals(member.id) && this.age == member.age) {
					return true;
				}
			}

		}
		return false;
	}

	// 해시코드 찍는거도 추가함
	@Override
	public String toString() {
		String str = String.format("Member의 id(" + this.id + ") , hash(" + this.id.hashCode() + ")");
		return str;
	}

	// 해시코드 오버라이딩1
//	@Override
//	public int hashCode() {
//		System.out.printf("super(%d), id(%d), " , super.hashCode(), this.id.hashCode());
//		return this.id.hashCode();
//	}

	// 해시코드 오버라이딩2
	@Override
	public int hashCode() {
		return this.hashCode;
	}

}
