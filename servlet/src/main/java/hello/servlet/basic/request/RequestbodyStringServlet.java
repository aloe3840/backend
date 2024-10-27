package hello.servlet.basic.request;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.util.StreamUtils;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "requestbodyStringServlet", urlPatterns = "/request-body-string")
public class RequestbodyStringServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ServletInputStream inputStream = req.getInputStream();
		//request.inputStram() 하면 http메세지 바디의 데이터를 바이트코드로 바로 얻을 수 있음
		//바이트 코드로 얻은 정보를 String으로 변환해서 담을 것임
		
		String massageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
		System.out.println("massageBpdy: " + massageBody);
		
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		
		res.getWriter().write("ok");
	}
	
}
