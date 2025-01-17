package hello.servlet.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "memberHomeServlet", urlPatterns = "/servlet/members/new-form")
public class MemberHomeServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		res.setCharacterEncoding("utf-8");
		
		PrintWriter w = res.getWriter();
		w.write("<!DOCTYPE html>\n" +
				 "<html>\n" +
				 "<head>\n" +
				 "    <meta charset=\"UTF-8\">\n" +
				 "    <title>Title</title>\n" +
				 "</head>\n" +
				 "<body>\n" +
				 "<form action=\"/servlet/members/save\" method=\"post\">\n" +
				 "    username: <input type=\"text\" name=\"username\" />\n" +
				 "    age:      <input type=\"text\" name=\"age\" />\n" +
				 "    <button type=\"submit\">전송</button>\n" +
				 "</form>\n" +
				 "</body>\n" +
				 "</html>\n");
		
	}
	
}
