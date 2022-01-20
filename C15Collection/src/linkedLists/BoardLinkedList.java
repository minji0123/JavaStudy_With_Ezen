package linkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


// LinkedList
/*
 * 이중연결 리스트
 * 객체의 삽입과 삭제가 빈번한 형태에서 유용함
 * */

public class BoardLinkedList {

	public static void main(String[] args) {
		List<Board> boards = new LinkedList<>();

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
