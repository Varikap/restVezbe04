package primer01;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Imenik")
public class Imenik extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    public Imenik() {
        super();
        
    }
    private HashMap<String, String> imenik = new HashMap<String,String>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String ime = request.getParameter("ime");
		if (ime != null)
		{
			if (imenik.containsKey(ime)){
				response.getWriter().append(ime + ":" + imenik.get(ime));
				response.setStatus(200);
			} else {
				response.setStatus(404);
			}
		}
		else
		{
			for (String s : imenik.keySet())
			{
				response.getWriter().append(ime + ":" + imenik.get(ime) + "\n");
			}
			response.setStatus(200);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ime = request.getParameter("ime");
		String num = request.getParameter("num");
		
		if (ime != null && num != null)
		{
			imenik.put(ime, num);
			response.getWriter().append(ime + ":" + num + "su dodati");
			response.setStatus(201);
		}
		else
		{
			response.setStatus(400);
		}
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
++++++++++++++++++++++++++++++++++++++++	}


	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ime = request.getParameter("ime");
		if (ime != null) {
			if (imenik.containsKey(ime))
			{
				imenik.remove(ime);
				response.setStatus(200);
			}
		}
		else {
			response.setStatus(400);
		}
	}

}
