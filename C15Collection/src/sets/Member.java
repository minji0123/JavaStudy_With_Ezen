package sets;

/*동일한 객체인지 인식하는 매커니즘
 * 아래의 리턴값들이 서로 같아야 같은 객체로 인식한다.
 * hashCode()의 리턴값
 * equals()의 리턴값
 * */

public class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		int hashcode = this.name.hashCode() + this.age;
		System.out.printf("[Member] hashcode name: %d  -> %d \n", this.name.hashCode(), hashcode);
		
		return hashcode;
	}
	
	
	// 얘를 지우면 똑같은 값이 들어갈 수 있다.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(this.name) && (member.age == this.age);
		}
		return false;
	}

}
