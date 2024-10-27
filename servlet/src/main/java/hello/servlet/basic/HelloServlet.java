package hello.servlet.basic;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println(req); //콘솔 출력
		System.out.println(res);
		
		String username = req.getParameter("username");
		String age = req.getParameter("age");
		
		System.out.println(username); //콘솔 출력
		System.out.println(age);
		
		res.setContentType("text/plain");
		res.setCharacterEncoding("utf-8");
		res.getWriter().write("username: " + username + " age: " + age); //브라우저 화면에 출력
	}
}
