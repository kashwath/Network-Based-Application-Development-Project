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
		
		//According to the input send request to signup/login servlet
		
		String name=request.getParameter("name");
		request.setAttribute("name",name );
		
		boolean signup=request.getParameter("signup") != null;
		request.setAttribute("signup",signup );
		
		boolean login=request.getParameter("login") != null;
		request.setAttribute("login",login );
		
		boolean adminlogin=request.getParameter("adminlogin") != null;
		request.setAttribute("adminlogin",adminlogin );
		
		boolean about=request.getParameter("about") != null;
		request.setAttribute("about",about );
		
		boolean contact=request.getParameter("contact") != null;
		request.setAttribute("contact",contact );
		
		//if clicked on login button
		if(login) {
			
			RequestDispatcher rd = request.getRequestDispatcher("/login.do");
			rd.forward(request,response);
		}
		
		//if clicked on signup button
		else if (signup)
		{
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/signup.jsp");
			rd.forward(request,response);
		}
		
		//if clicked on about button
		else if(about){
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/AboutUs.jsp");
			rd.forward(request,response);
		}
		
		//if clicked on contact us button
		else if(contact){
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/Contact.jsp");
			rd.forward(request,response);
		}
		
	}

}
