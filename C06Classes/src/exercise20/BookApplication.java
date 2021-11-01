package exercise20;

import java.util.Scanner;

public class BookApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner (System.in);
	
	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------------");
			System.out.println(" 1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				createAccount();
			}
			
		}
		
	}

	// 계좌 생성
	private static void createAccount() {
		System.out.println("---------------");
		System.out.println(" 1. 계좌생성 ");
		System.out.println("---------------");
	
	}
	
	// 계좌 목룍
	private static void accountList() {
			
	}
	// 예금
	private static void desposit() {
		
	}
	// 출금
	private static void withdraw() {
		
	}
	// Account 배열에서 ano와 동일한 Account 객체 찾기
//	private static Account findAccount(String ano) {
//		
//	}
	
}
