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
package people;

public class People {
	int height;
	int weight;
	int age;
	String sex;
	
	boolean run = true;
	boolean walk = true;
	boolean work = true;
	
	
	public People(int height, int weight, int age) {
//		super();
		this.height = height;
		this.weight = weight;
		this.age = age;
//		this.sex = sex;
		System.out.printf("height : %d, weight : %d, age : %d\n",height, weight, age);
	}
	
	void showTalk(boolean tf) {
		if (tf == true) {
		System.out.println("말하는중...");
		}
		else {
			System.out.println("말을 멈춤!");
		}
		
	}
	void showRun(boolean tf) {	
		if (tf == true) {
		System.out.println("달리는중...");
		}
		else {
			System.out.println("달리다가 지쳤다.");
		}
	}
	void showwalk(boolean tf) {
		if (tf == true) {
			System.out.println("걷는중...");
			}
			else {
				System.out.println("목적지에 도착했다.");
			}
	}
	void showwork(boolean tf) {
		if (tf == true) {
			System.out.println("일하는중...");
			}
			else {
				System.out.println("퇴근한다!");
			}
	}
	
	
	
}
