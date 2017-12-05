

import java.io.IOException;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/final2.do")
public class Final2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Final2() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		request.setAttribute("name",name );
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Send an email to the user
		String fullname=request.getParameter("fullname");
		request.setAttribute("fullname",fullname );
		
		String amount=request.getParameter("amount");
		request.setAttribute("amount",amount );
		
		//get the email address from the session
		HttpSession session=request.getSession();  
        String name=(String) session.getAttribute("name"); 
        
		//email confirmation for food donation
		String emailBody="Thanks for your donation at Plateful INC. Your money will be used to help children who are in need.";
		
		String emailSubject="Donation Confirmation- Plateful INC.";
		
		String toEmailAddress=name;
		
		//all the emails will be sent from karthiknarayan876@gmail.com
		
		MailUtilLocal.send("karthiknarayan876@gmail.com","XXXXXX",toEmailAddress,emailSubject,emailBody); 
		
		request.getRequestDispatcher("/WEB-INF/Views/thanksForMoney.jsp").forward(request, response);
		
	}


}
