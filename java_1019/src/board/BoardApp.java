package board;

import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Board board = new Board();
		
		while (true) {
			System.out.println("=======게시판 앱=======");
			System.out.println("1. 게시글 추가");
			System.out.println("2. 게시글 보기");
			System.out.println("3. 게시글 삭제");
			System.out.println("4. 종료");
			System.out.print("메뉴 선택>> ");
			
			int choice = scanf.nextInt();
			
			switch(choice) {
				case 1:
				System.out.print("글 제목 입력>> ");
				String title = scanf.next();
				System.out.print("글 내용 입력>> ");
				String content = scanf.next();
				board.add(title, content);
				break;
				
				case 2: board.viewPosts();
				break;
				
				case 3:
				System.out.print("삭제하고 싶은 글 id 입력>> ");
				int id = scanf.nextInt();
				board.deletePost(id);
				break;
				
				case 4:
				System.out.println("프로그램을 종료합니다.");
                scanf.close(); 
                System.exit(0); 
                break;
				
				default: System.out.println("숫자를 정확히 입력해주세요");
			}
		}
	}
}
