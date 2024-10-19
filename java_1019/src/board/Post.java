package board;

import java.util.Objects;

public class Post {
	private static int count=0;
	private int id;
	private String title;
	private String content;
	
	public Post(String title, String content) {
		super();
		this.id = count++;  //id 번호를 count 로 바꿔주는 거 id 는 바뀌면 안 돼서
		this.title = title;
		this.content = content;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Post.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "id=" + id + ", title=" + title + ", content=" + content;
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, id, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(content, other.content) && id == other.id && Objects.equals(title, other.title);
	}
}
