#[11장 JAVA API]

##[0. 패키지, 클래스 설명]
- hashCode 패키지   
	- Key  		: ..?   
<br>
- hashCodemember 패키지   
	- Member 	 : Object클래스, toString(), equals() 오버라이딩   
	- MemberRun  : toString() 출력   
	- MemberRun2 : equals(), ==   
<br>
- hashCodemember2 패키지   
	- Member	 : equals() 오버라이딩, 매개변수 추가   
	- MemberRun	 : equals()에 매개변수 추가해서 출력   
	- MemberRun2 : hashCode(), 해시코드 설명   
<br>
- hashCodemember3 패키지   
	- Member	 : 객체 비교 처리 순서   
	- MemberRun	 : 해시코드값 비교   
<br>
- cloneObject 패키지
	- Member 	 : clone()
	- MemberRun	 : 
	- MemberRun2
<br>
- deepCloneObject 패키지
	- Member 	 : clone()
	- MemberRun	 : 
	- MemberRun2 :
	- CashPoint  : 
	
<br>

	

##[1. 참고문서]
https://docs.oracle.com/javase/8/docs/api/overview-summary.html

##[2. JAVA API]
1. 자바의 모든 클래스는 기본적으로 Object 를 상속함   
2. 우리는 Object의 메소드를 오버라이딩해서 사용할 수 있움   
	- equals() 오버라이딩해서 값 비교ㄱㄴ  

###[2-1 toString()]
[문자열출력]
* 그냥 출력하면은 실행결과는 주소값이 찍힌다.
* toString()호출하면 값 그대로 찍힘

###[2-2 equals()]
[값비교]
* equals()오버라이딩하면 객체 필드값으로 객체 비교 ㄱㄴ

###[2-3 hashcode()]
[해시코드]
* 객체의 메모리 번지로 해시코드를 만들어서 관리함   
	* 이케생김 (897913732)   
<br>
*  자바객체를 식별하는 키임   
	* 그래서 객체마다 다른 값임   
	
###[2-4 객체 값 비교 순서]
[객체 비교 처리 순서]  
1. hashCode()  
2. equals()  
 * 두개 다 true 여아 같은 객체로 인식함  
	
###[2-4 객체 값 비교 순서]
		 * [얕은 복사]
	 * 1. 기본타입은 값을 복사
	 * 2. 참조타입은 주소를 복사
	 *    - 복제된 객체에서 동일한 객체를 공유