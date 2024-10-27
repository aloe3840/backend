package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// [ 기능 요구사항 ]
//회원 저장
//회원 목록 조회



//기본 crud 기능하는 클래스
//싱글톤 패턴을 적용한 회원 저장소 클래스
public class MemberRepository {
	private static Map<Long, Member> store = new HashMap<>();
	private static long sequence = 0L;
	
	private static final MemberRepository instance = new MemberRepository();
	
	public static MemberRepository getInstance() {
		return instance;
	}
	
	public MemberRepository() {}
	
	
	//회원 등록
	public Member save(Member member) {
		member.setId(++sequence);  //회원 등록 시점에 아이디 생성
		store.put(member.getId(), member);	//store 에 아이디 추가
		return member;
	}
	
	//회원 아이디로 조회
	public Member findById(Long id) {
		return store.get(id);
	}
	
	//전체 회원 조회
	public List<Member> findAll(){
		return new ArrayList<>(store.values());
	}
	
	//모든 값 초기화
	public void clearStore() {
		store.clear();
	}
	
	
	
	
	
	
	
	
	
}
