package lang.object.poly;

public class ObjectPloyEx1 {
	public static void main(String[] args) {
		Dog dog = new Dog("뽀삐", 8);
		Car car = new Car("g80");
		Object obj = new Object();
		
		Object objs[] = {dog, car, obj};
		size(objs);
	}
	
	
	private static void size(Object objs[]) {
		System.out.println("전달된 객체 수: " + objs.length);
	}
		
}
