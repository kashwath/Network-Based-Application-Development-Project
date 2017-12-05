

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/signup.do")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		request.setAttribute("name",name );
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("name");
		request.setAttribute("name",name );
		
		String email=request.getParameter("email");
		request.setAttribute("password", email);
		
		String password=request.getParameter("password");
		request.setAttribute("password", password);
		
		
		//Hash the password and add it to the DB
			try {
				String HashedPassword = PasswordUtil.hashPassword(password);
		
			String Salt=PasswordUtil.getSalt();
			String HashedAndSaltedPassword=PasswordUtil.hashAndSaltPassword(password);
				if(loginDetails.add(name, HashedPassword, Salt, HashedAndSaltedPassword))
				request.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(request, response);
				
				else {
					
					String duplicateEmail="Email address already exists..";
					request.setAttribute("duplicateEmail", duplicateEmail);
					
					request.getRequestDispatcher("/WEB-INF/Views/signup.jsp").forward(request, response);
				}
				
		
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
		
		
	
