package wrapper;

public class WrapperClassMain {
	public static void main(String[] args) {
		Integer newInteger = new Integer(10);	
		Integer integrObj = Integer.valueOf(10);	
		
		Long long1 = Long.valueOf(3);
		Double double1 = Double.valueOf(13.3);
		
		System.out.println(newInteger);
		System.out.println(integrObj);
		System.out.println(long1);
		System.out.println(double1);
		
		System.out.println("내부값 읽기");
		int intValue = integrObj.intValue();
		System.out.println(intValue);
		
		long longValue = long1.longValue();
		System.out.println(longValue);
	}
}
