/*
 * [문제] 상속
 * 클래스 사람 (People)
 * 	- 속성 : 키, 몸무게, 성구분(남녀), 나이 **
 *  - 메소드 : 말한다, 걷는다, 달린다, 일한다. ** 
 * 		- 남자 클래스(Man)   --> People을 상속 ** 
 * 			- 속성 : 
 * 			- 메소드 : 사냥한다. **
 * 			- 형제 클래스(Brother) : 남자 클래스 상속 ** 
 * 		- 여자 클래스(Woman) --> People을 상속 **
 * 			- 속성 : 임신개월수
 * 			- 메소드 : 출산
 * 			- 자매 클래스(Sister) : 여자 클래스 상속
 */
package peopleTeacher;

public class People {
	int height;
	int weight;
	int age;
	int sex;
	String name;
	
	People(){
		this.name = "아무개";
	}
	
	public People(String name) {
		this.name = name;
	}
	
	public People(int height, int weight, int age, int sex) {
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.sex = sex;
	}
	
	void speak() {System.out.printf("people : speak(%s)\n", this.name);}
	void work() {System.out.printf("people : work(%s)\n",this.name);}
	void walk() {System.out.printf("people : walk(%s)\n",this.name);}
	void run() {System.out.printf("people : run(%s)\n",this.name);}
	

}
