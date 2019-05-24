package com.rajendra.ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPage() {
        super();
        // TODO Auto-generated constructor stub
    }

    

		 
		
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		sendLoginForm(response,false);
	}

	private void sendLoginForm(HttpServletResponse response, boolean withErrorMessage) throws IOException,ServletException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<title>Login</title>");
		
		out.println("<head>Obtaining the query String</head>");
		out.println("<body>");
		
		if(withErrorMessage)
			out.println("Login failer please try again");
		
		out.println("<br>");
		out.println("<head>Please enter your username and password</head>");
		out.println("<form method=post>");
		out.println("<br>first name:<input type=text name=username>");
		out.println("<br>password:<input type=password name=password>");
		out.println("<input type=SUBMIT value=Submit>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username!=null && password!=null && username.equals("jamesbond") && password.equals("007"))
		{
			response.sendRedirect("/ServletDemo/Welcome");
		}
		else{
			sendLoginForm(response,true);
		}
	}

}
