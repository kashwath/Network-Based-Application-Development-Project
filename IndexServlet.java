

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index.do")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IndexServlet() {
        super();
  
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/Views/index.jsp").forward(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean signup=request.getParameter("signup") != null;
		request.setAttribute("signup",signup );
		
		boolean login=request.getParameter("login") != null;
		request.setAttribute("login",login );
		
		boolean adminlogin=request.getParameter("adminlogin") != null;
		request.setAttribute("adminlogin",adminlogin );
		
		if(login) {
			
			RequestDispatcher rd = request.getRequestDispatcher("/login.do");
			rd.forward(request,response);
		}
		
		else if (signup)
		{
			RequestDispatcher rd = request.getRequestDispatcher("/signup.do");
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("/adminLogin.do");
			rd.forward(request,response);
			
		}
		
	}

}
