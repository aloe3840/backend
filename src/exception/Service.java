package exception;

public class Service {
	Client client = new Client();
	
	//예외 catch해서 처리하는 코드
	
	public void callCatch() {
		try {
			client.call();  //일부러 예외 발생 시킨 코드
		}catch(Exception e){
			System.out.println("예외처리 메세지: " + e.getMessage());
		}
		
		System.out.println("정상 동착");
	}
	
	public void callThrow() throws MyCheckedException{
		client.call();
	}
	
	
}
