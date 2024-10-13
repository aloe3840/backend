package exception;

public class NetworkServiceVO {
	public void sendMassage(String data) {
		String address = "httpL//example.com";
		NetworkClientVO2 clientVO2 = new NetworkClientVO2(address);
		
		clientVO2.connect();
		clientVO2.send(data);
		clientVO2.disconnect();
		clientVO2.initError(data);
		
	}
	
	
}
