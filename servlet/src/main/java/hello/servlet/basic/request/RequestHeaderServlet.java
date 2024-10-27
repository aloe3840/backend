package hello.servlet.basic.request;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "requestHeaderServlet", urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		printStartLine(req);
		
	}
	
	
	private void printStartLine(HttpServletRequest req) {
		System.out.println(req.getMethod());
		System.out.println(req.getProtocol());
		System.out.println(req.getScheme());
		
		System.out.println(req.getRequestURL());   //전체 주소
		System.out.println(req.getRequestURI()); //경로만
		
		System.out.println(req.getQueryString());
		
		System.out.println("종료");
	}
	
	
}
