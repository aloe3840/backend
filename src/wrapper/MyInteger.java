package wrapper;

public class MyInteger {
	private final int value;
	
	public MyInteger(int value) {
		this.value = value;
	} 
	
	public int getValue() {
		return value;
	}
	
	public static int compareTo(int value1, int value2) {
		if(value1 < value2) {
			return -1; 
		}else if(value1 > value2){
			return 1;
		}else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
		

}
