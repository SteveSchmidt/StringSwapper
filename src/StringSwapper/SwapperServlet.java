package StringSwapper;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import StringSwapper.SwapperService;
import StringSwapper.dto.SwappingObject;

/**
 * Servlet implementation class SwapperServlet
 */
@WebServlet("/SwapperServlet")
public class SwapperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SwapperServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stringObject = "oh";
		stringObject = request.getParameter("stringObject");
		
		SwapperService swapper = new SwapperService();
		boolean result = true;// = swapper.authenticate(stringObject);
		
		if( result ) {
			SwappingObject swappedObject = swapper.makeTheSwap(stringObject);
			request.setAttribute("swappedObject", swappedObject);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Result.jsp");
			dispatcher.forward(request, response);
			return;
		}else {
			response.sendRedirect("HomePage.jsp");
			return;
		}
	}

}
