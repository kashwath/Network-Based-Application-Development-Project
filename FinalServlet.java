

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FinalServlet
 */
@WebServlet("/final.do")
public class FinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		
		String amount=request.getParameter("amount");
		request.setAttribute("amount",amount );
		
		String fullname=request.getParameter("fullname");
		request.setAttribute("fullname",fullname );
		
		loginDetails.addMoney(fullname, amount);
		request.getRequestDispatcher("/WEB-INF/Views/donateMoney.jsp").forward(request, response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//get information from food.jsp
		String fullname=request.getParameter("fullname");
		request.setAttribute("fullname",fullname );
		
		String line1=request.getParameter("line1");
		request.setAttribute("line1",line1 );
		
		String line2=request.getParameter("line2");
		request.setAttribute("line2", line2);
		
		String city=request.getParameter("city");
		request.setAttribute("city", city);
		
		String state=request.getParameter("state");
		request.setAttribute("state", state);
		
		String zipcode=request.getParameter("zipcode");
		request.setAttribute("zipcode", zipcode);
		
		String country=request.getParameter("country");
		request.setAttribute("country", country);
		
		String noofpeople=request.getParameter("noofpeople");
		request.setAttribute("noofpeople", noofpeople);
		
		//write to database with all the information provided
		loginDetails.addAddress(fullname, line1, line2,city,state, zipcode, country, noofpeople);
		
		HttpSession session=request.getSession();  
        String name=(String) session.getAttribute("name"); 
		
        //email confirmation for food donation
		String emailBody="Thanks for your donation at Plateful INC. Your food will be donated to the children who are in need.";
		
		String emailSubject="Donation Confirmation- Plateful INC.";
		
		String toEmailAddress=name;
		
		//all the emails will be sent from karthiknarayan876@gmail.com
		MailUtilLocal.send("karthiknarayan876@gmail.com","XXXXXX",toEmailAddress,emailSubject,emailBody); 
		
		request.getRequestDispatcher("/WEB-INF/Views/thanks.jsp").forward(request, response);
		
		
	}

}
