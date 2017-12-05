

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		String name=request.getParameter("name");
		request.setAttribute("name",name );
		
		String password=request.getParameter("password");
		request.setAttribute("password", password);
		
		//functionality when clicked on homebutton
		if(loginDetails.adminLogin(name,password))
		request.getRequestDispatcher("/WEB-INF/Views/adminWelcome.jsp").forward(request, response);
		
		else
			request.getRequestDispatcher("/WEB-INF/Views/welcome.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=null;
		
		name=request.getParameter("name");
		request.setAttribute("name",name );
		
		 String password=request.getParameter("password");
		request.setAttribute("password", password);
		
		if(name==null && password==null){
			request.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(request, response);
			
		}

		//check if the entered login details is of admin
		if(loginDetails.adminLogin(name, password)) {
			
			HttpSession session=request.getSession();  
	        session.setAttribute("name",name); 
			request.getRequestDispatcher("/WEB-INF/Views/adminWelcome.jsp").forward(request, response);	
		
		}
		
		//or else of user
		else if(loginDetails.Validate(name, password)) {
			HttpSession session=request.getSession();  
	        session.setAttribute("name",name); 
			request.getRequestDispatcher("/WEB-INF/Views/welcome.jsp").forward(request, response);
			
		}

		//else send an error to the user
		else{
			String loginError="Email address doesn't exist or Your email/password doesn't match";
			request.setAttribute("loginError",loginError );
			
			request.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(request, response);
		
			
		}
		

		
		
	}

}
