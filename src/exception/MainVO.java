package exception;

import java.util.Scanner;

public class MainVO {
	public static void main(String[] args) {
		NetworkServiceVO ns = new NetworkServiceVO();
		Scanner scanf = new Scanner(System.in);
		
		while(true) {
			System.out.print("전송할 문자: ");
			String massage = scanf.nextLine();
			
			if(massage.equals("exit")) {
				break;
			}
			ns.sendMassage(massage);
			System.out.println();
		}
		System.out.println("프로그램 정상 종료");
		
	}
}
