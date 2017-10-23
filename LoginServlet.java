

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {


    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//request.getRequestDispatcher("/WEB-INF/Views/index.jsp").forward(request, response);




		request.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("name");
		request.setAttribute("name",name );

		String password=request.getParameter("password");
		request.setAttribute("password", password);

		/*System.out.println("username" + name);
		System.out.println("password" + password);*/

		if(loginDetails.Validate(name, password)) {
			request.getRequestDispatcher("/WEB-INF/Views/welcome.jsp").forward(request, response);
		}
		else {
			System.out.print("Wrong username or password");
			request.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(request, response);
		}


	}

}
