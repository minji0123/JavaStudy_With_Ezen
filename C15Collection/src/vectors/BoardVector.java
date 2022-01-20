package vectors;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

// 백터 vector
/*
 * ArrayList 와 동일한 구조
 * 쓰레드 안전 지원 (Thread Safe)
 * 동기화 메소드로 구성 (Synchronized)
 * */


public class BoardVector {

	public static void main(String[] args) {
		List<Board> boards = new Vector<>();

		boards.add(new Board("공지사항1", "인사발령", "총무팀"));
		boards.add(new Board("공지사항2", "연말보너스", "총무부"));
		boards.add(new Board("공지사항3", "특별수당", "인사팀"));
		boards.add(new Board("공지사항4", "새해선물", "경영지원팀"));
		
		printBoard(boards);
	}

	static void printBoard(List<Board> boards) {
		System.out.println("게시판");
		
		Iterator<Board> it = boards.iterator();
		while(it.hasNext()) {
			Board board = it.next();
			System.out.println("제목 : " + board.subject);
			System.out.println("내용 : " + board.content);
			System.out.println("작가 : " + board.writer);
		}
	}
}
