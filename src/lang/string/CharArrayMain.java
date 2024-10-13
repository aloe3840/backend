package lang.string;

import java.util.Arrays;

public class CharArrayMain {
	public static void main(String[] args) {
		char[] charArr = new char[] {'h', 'e', 'l', 'l', 'o'};
		//char[] charArr = {'h', 'e', 'l', 'l', 'o'};
		String str = new String("hello");
		
		System.out.println(charArr);
		System.out.println(str);
		System.out.println(str.charAt(0)); //0번째 인덱스 문자 가져오기
		System.out.println(str.substring(1, 3)); //1번째, 3번째 인덱스 빼고 잘라내기
		System.out.println(str.substring(1)); //1번째 인덱스부터 출력
		System.out.println(str.concat(str));  //앞에꺼에 뒤에꺼 이어붙이기
		System.out.println(str.indexOf("e")); //문자의 인덱스 검색
		System.out.println(str.trim()); //양쪽 공백 제거
	}
}
