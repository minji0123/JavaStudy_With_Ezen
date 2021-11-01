package exercise19;

public class Account {
	// 1. balance필드는 최대 백만원까지만 저장 가능
	// 2. 외부에서 balance필드는 맘대로 변경하지 못하게 하기
	// 3. setter와 getter를 이용하기
	// 4. balance 필드의 범위는 상수 이용
	// 5. 세터 매개값이 음수이거나 백만원 초과면, 현재 balance 값 유지하기
	
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	
	private int balance = 0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance>MIN_BALANCE && balance<MAX_BALANCE) {

			this.balance = balance;
		}

	}


	
	
	
	
	
}
