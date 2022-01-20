package maps;

/*동일한 객체인지 인식하는 매커니즘
 * 아래의 리턴값들이 서로 같아야 같은 객체로 인식한다.
 * hashCode()의 리턴값
 * equals()의 리턴값
 * ----------------------------------
 * id와 name 이 같으면 같은 객체로 처리
 * */

public class Member {
	int id;
	String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			return this.id == member.id && (this.name.equals(member.name));
		}
		return false;
	}

}
