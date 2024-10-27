package hello.servlet.basic.request;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("전체 파라미터 조회 시작");
		req.getParameterNames().asIterator()
			.forEachRemaining(param -> System.out.println("param: " + req.getParameter(param)));
		
		System.out.println("전체 파라미터 조회 끝");
		
		System.out.println("단일 파라미터 조회");
		String name = req.getParameter("name");
		System.out.println("단일 파라미터" + name);
	}
	
	
}
