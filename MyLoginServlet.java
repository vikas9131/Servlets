import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyLoginServlet")
public class MyLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		RequestDispatcher rd;
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		if(s1.equals("Mrdevelop") && s2.equals("9131"))
		
		{
		rd=request.getRequestDispatcher("Welcome ");
		rd.forward(request,response);
		}
		else
		{
			o.println("<p><h1>login failed</h1></p>");
			rd=request.getRequestDispatcher("/Log.html");
			rd.include(request, response);
		}
		}
		}



