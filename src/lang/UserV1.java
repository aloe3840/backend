package lang;

public class UserV1 {
	public String id;
	public UserV1(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {  //this : 내 클래스가 참조하고 있는 값 == 받은 obj가 같다면 true
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;  //obj가 null이거나 getClass와 obj.getClass가 다르다면 false		}
		}
		return super.equals(obj);
		
}}
