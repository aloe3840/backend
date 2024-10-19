package board;

import java.util.ArrayList;

//접근제어자, 캡슐화, 컬렉션프레임워크, toString, equals

public class Board {
	private ArrayList<Post> list = new ArrayList<>();
	
	public Board() {
		list = new ArrayList<>(); 
	}
	
	
	//추가 메서드
	public void add(String title, String content) {
		  Post post = new Post(title, content);
	      list.add(post); 
	}
	
	//보여주기 메서드
	public void viewPosts() {
		if(list.isEmpty()) {
			System.out.println("게시글을 추가해주세요");
			return;
		}else {
		    for (Post post : list) {
	            System.out.println(post.toString());
	        }
		}
	}
	
	//삭제 메서드
	public void deletePost(int id) {
		Post number = null;
		
		for(Post post : list) {
			if(post.getId() == id) {
				number = post;
				break;
			}
		}
		if(number != null) {
			list.remove(number);
			System.out.println("삭제 완료");
		}else {
			System.out.println("없는 게시물입니다.");
		}
	}
	
}
