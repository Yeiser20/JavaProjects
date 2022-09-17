package mx.uaemex.ing_software_ii.ejercicios.porra;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Porra
 */
public class Porra extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String pal_1;
	private String pal_2;
	private String pal_3;
	int repeticiones=3;
	

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	pal_1 = config.getInitParameter(pal_1); //lee palabra 1
	pal_2 = config.getInitParameter(pal_2); //lee palabra 2
	pal_3 = config.getInitParameter(pal_3); //lee palabra 3
	this.repeticiones = Integer.parseInt(config.getInitParameter("repeticiones"));
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pluma;
		response.setContentType("text/html");
		pluma = response.getWriter();
		pluma.print("<!DOCTYPE html>");
		pluma.println("<html>");
		pluma.println("<head>");
		pluma.println("<title>UNAM</title>");
		pluma.println("</head>");
		pluma.println("<body>");
		for(int i = 0; i<this.repeticiones; i++) {
		pluma.println("<h2>"+this.pal_1+"</h2>");
		}
		for(int j = 0; j<this.repeticiones ; j++) {
			pluma.println("<p>"); //parrafo
			for(int i=0; i<this.repeticiones; i++) {
				pluma.println(this.pal_2+" ");	
			}
			for(int i = 0; i<this.repeticiones ; i++) {	
				pluma.println(this.pal_3+" ");
			}
			pluma.println("</p>");
		}
		pluma.println("<h3> U N I V E R S I D A D</h3>");
		pluma.println("</body>");
		pluma.println("</html>");
	}

}
