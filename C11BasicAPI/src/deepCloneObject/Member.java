/*
 * 복제(clone)
 * 객체를 복제하기 위해서는 Cloneable 인터페이스의 구현 클래스를 정의해야됨
 * 1. Object.clone() 메소드 사용
 * 2. CloneNotSupportedException 예외 처리
 * -----------------------------------------------
 * [깊은 복사] 
 * 1. 참조형은 개벌적으로 복사
 * 
 */

package deepCloneObject;

public class Member implements Cloneable {
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public void change(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Member cloneMember2() {
		Member member = new Member(this.id, this.name, this.password, this.age, this.adult);
		member.setCashPoint(this.cashPoint);
		return member;
	}

	public void setCashPoint(CashPoint cashPoint) {
		this.cashPoint = cashPoint;
	}

	// 얕복
	public Member cloneMember() throws CloneNotSupportedException {
		return (Member) clone();
	}
	
	// 깊복
	public Member deepCloneMember() throws CloneNotSupportedException {
		Member member = (Member) clone();
		member.cashPoint = new CashPoint();
		
		System.arraycopy(this.cashPoint.getCash(), 0, 
				member.cashPoint.getCash(), 0, 
				this.cashPoint.getCash().length);
		
		return member;
	}

	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public CashPoint cashPoint = new CashPoint(new int[] { 10, 20, 30 });

}
