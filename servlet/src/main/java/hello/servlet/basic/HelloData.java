package hello.servlet.basic;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class HelloData{
	private String username;
	private int age;
	private String messageBody;
	
	
}
