/*
 * [문제] 쇼핑몰 구축 : 생성자별로 생성하는 객체를 만듦
 * - 소핑목록 : 
 * 		- 속성 : 구매자, 상품명, 단가, 수량, 금액
 * 		- 생성자 :
 * 			- 구매자를 파라미터로 받는 생성자 
 * 			- 전체 속성을 파라미터로 받는 생성자
 * 
 * 		- 생성자별로 생성하는 객체를 만듦
 * --------------------------------------------
 * - 생성자가 호출되는 방식
 * 		- 클래스와 생성자의 이름이 같아야 한다.
 * 		- 파라미터의 개수가 같아야 한다.
 * 		- 파라미터의 데이터 타입이 각각 같아야 한다.
 * ---------------------------------------------
 * - 생성자 오버로딩
 * 		- 매개변수를 다르게 하는 생성자를 여러 개 생성
 *     Shopping() { // 기본생성자
 *     Shopping(String cust) { // 구매자를 파라미터로 하는 생성자
 *     Shopping(String customer, String goods, int price, int quantity, int amount) { // 전체 속성을 파라미터로 하는 생성자
 * ---------------------------------------------
 * - 메소드 오버로딩(Method Overloading)     
 *   > 매개변수(파라미터)를 달리하는 메소드를 여러 개 선언하는 것  	
 */	
package service;
	
public class Shopping {
	final static int AMOUNT_LIMIT = 100;
	
	// 필드
	String customers;
	String productName;
	int originPrice;
	int productCnt;
	int productPrice;
	
	// 생성자
	Shopping(){
		}
	
	Shopping(String customers){
		this.customers=customers;
	}
	Shopping(String customers, String productName,int originPrice, int productCnt, int productPrice){
		this.customers = customers;
		this.productName = productName;
		this.originPrice = originPrice;
		this.productCnt = productCnt;
		this.productPrice = productPrice;
	}

	
	// 메소드(멤버함수)
	// void : 리턴값이 없다.
	void printInfo(String title) {
		System.out.println("[쇼핑정보 : "+title);
		
		System.out.println("구매자 : "+this.customers);
		System.out.println("상품명 : "+ this.productName);
		System.out.println("단  가 : "+ this.originPrice);
		System.out.println("수  량 : "+ this.productCnt);
		System.out.println("금  액 : "+ this.productPrice);

	}
	
	void printInfo() {		
		System.out.println("[쇼핑정보]");
		System.out.println("구매자 : "+this.customers);
		System.out.println("상품명 : "+ this.productName);
		System.out.println("단  가 : "+ this.originPrice);
		System.out.println("수  량 : "+ this.productCnt);
		System.out.println("금  액 : "+ this.productPrice);

	}
	
	
	// boolean 타입 메소드
	boolean priceLimit() {
		boolean limit = (originPrice > AMOUNT_LIMIT);
		return limit;
	}
	
	// main 메소드
	public static void main(String[] args) {
		
		// 1. 생성자 문제
//		// 1-1 기본 생성자 객체
//		Shopping customer1 = new Shopping();
//		
//		// 1-2 구매자 속성의 생성자 객체
//		Shopping customer2 = new Shopping("홍길동");
//		System.out.println("고객이름 : "+ customer2.customers);
//		
//		
//		// 1-3 전체 속성의 생성자 객체
//		Shopping customer3 = new Shopping("이사랑", "컵", 100, 10,1000);
//		System.out.println("구매자 : "+ customer3.customers);
//		System.out.println("상품명 : "+ customer3.productName);
//		System.out.println("단  가 : "+ customer3.originPrice);
//		System.out.println("수  량 : "+ customer3.productCnt);
//		System.out.println("금  액 : "+ customer3.productPrice);
		
		
		// 2. 메소드
		Shopping customer4 = new Shopping("김여사");
		customer4.printInfo();
		boolean shoplimit4 = customer4.priceLimit();
//		boolean globalshoplimit4 = globalAmountLimit(customer4);
		System.out.println("김여사의 지갑사정 : " + shoplimit4);
		
		System.out.println();
		
		Shopping customer5 = new Shopping("홍여사", "명품백", 300,4,1200);
		customer5.printInfo("홍여사의 장바구니]");
		boolean shoplimit5 = customer5.priceLimit();
//		boolean globalshoplimit5 = globalAmountLimit(customer5);
		System.out.println("홍여서의 지갑사정 : " + shoplimit5);
		
		
	}

}
