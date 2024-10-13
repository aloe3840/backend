package lang.object.poly;

public class MainTest {
	public static void main(String[] args) {
		Car car = new Car("g80");
		Dog dog = new Dog("뽀삐", 3);
		Car car2 = (Car)new Object();  //다운캐스팅
		
		action(dog);
		action(car);
		
	}
	
	private static void action(Object obj) {
		if(obj instanceof Dog dog) {
			dog.sound();
		}else if(obj instanceof Car car){
			car.move();
		}
		
	
	}
}
