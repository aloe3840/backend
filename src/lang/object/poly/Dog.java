package lang.object.poly;

public class Dog {
	
	private String dogName;
	private int age;
	
	public void sound() {
		System.out.println("멍멍");
	}
	
	public Dog(String dogName, int age) {
		this.dogName = dogName;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "강아지이름: " + dogName + "강아지나이: " + age;
	}
	
	
}
