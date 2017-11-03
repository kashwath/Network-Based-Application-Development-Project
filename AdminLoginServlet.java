

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adminLogin.do")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/Views/adminLogin.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		request.setAttribute("name",name );
		
		String password=request.getParameter("password");
		request.setAttribute("password", password);
		
		/*System.out.println("username" + name);
		System.out.println("password" + password);*/
		
		if(loginDetails.adminLogin(name, password)) {
			request.getRequestDispatcher("/WEB-INF/Views/adminWelcome.jsp").forward(request, response);
		
		}
		else {
			System.out.print("Wrong username or password");
			request.getRequestDispatcher("/WEB-INF/Views/adminLogin.jsp").forward(request, response);
		}
	}

}
