/*
 * 증감연산자: ++, --
 * - 증가연산자(++) : 1씩 증가
 * - 감소연산자(--) : 1씩 감조
 */
public class SingleOper {

	public static void main(String[] args) {
		// 1. 증가
		int pp = 0;
		pp++;
		System.out.println("pp=" + pp); // pp=1
		++pp;
		System.out.println("pp=" + pp); // pp=2
		
		
		
		// 2. 증가와 할당
		int p1 = pp++; // p1=pp  ->  pp++ 적용먼저, 후에 증가
		System.out.printf("p1(%d), pp(%d)\n", p1, pp);
		// p1(2), pp(3)
		
		int p2 = ++pp; // ++pp -> p2=pp 증가먼저, 후에적용
		System.out.printf("p2(%d), pp(%d)\n", p2, pp);
		// p2(4), pp(4)
		
		
		// 3. 출력할 때 증가 적용
		System.out.printf("pp++(%d)(%d)\n", pp++, pp); // pp++ (4)(5)
		System.out.printf("pp++(%d)(%d)\n", pp++, pp); // pp++ (5)(6)
		System.out.printf("++pp(%d)(%d)\n", ++pp, pp); // ++pp (7)(7)
		
		// 4. 출력할 때 감소
		pp--; // pp = pp - 1;
		System.out.printf("pp(%d)\n", pp); // pp(6)
		System.out.printf("--pp(%d)\n", --pp); // --pp(5)
		System.out.printf("pp--(%d)(%d)\n", pp--, pp); // pp--(5)(4)
		
		
		// 5. 연산에 적용
		int x1 = 10;
		int x2 = 10;
		int y1 = (x1++) + (--x2); // 10 + 9 -> 19
		System.out.printf("x1(%d), x2(%d), y1(%d)\n", x1, x2, y1); // x1(11), x2(9), y1(19)
		int y2 = (++x1) + (--x2); // 10(11+1) + 8(9-1) -> 20
		System.out.printf("x1(%d), x2(%d), y2(%d)\n", x1, x2, y2); // x1(12), x2(8), y2(20)
	}

}