package sets;

import java.util.*;

public class MemberHashSet {

	public static void main(String[] args) {
		Set<Member> members = new HashSet<>();
		
		members.add(new Member("자바", 20));
		members.add(new Member("자바스크립트", 20));
		members.add(new Member("파이썬", 20));
		
		
		// Member 클래스에서 메소드(hashCode, equals) 오버라이딩 하여 처리
		members.add(new Member("파이썬", 20)); // 얘는 내용은 같아도 객체가 달라서 (new 해서 )저장이 됨
		
		for (Member member : members) {
			System.out.println(member.name +" "+ member.age);
		}
	}

}
