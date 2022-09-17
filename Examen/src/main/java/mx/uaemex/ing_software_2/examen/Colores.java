package mx.uaemex.ing_software_2.examen;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//VICTOR DANIEL ARCHUNDIA SANCHEZ
/**
 * Servlet implementation class Colores
 */
public class Colores extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String rojo;
	private String azul;
	private String amarillo;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		rojo = config.getInitParameter("color1");
		azul= config.getInitParameter("color2");
		amarillo = config.getInitParameter("color3");
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pluma;
		int op = Integer.parseInt(request.getParameter("Name"));
		response.setContentType("text/html");
	
		pluma = response.getWriter();
		pluma.print("<!DOCTYPE html>");
		pluma.println("<html>");
		pluma.println("<head>");
		pluma.println("<title>Piedra Papel o tijera</title>");
		pluma.println("</head>");
		pluma.println("<body>");
		pluma.println("<h1> PALABRA SELECCIONADA </h1>");
		if (op == 1) {
		pluma.println("<h2> AMARILLO </h2>");
		pluma.println("<p> el color traducido es : </p><br>");
		pluma.println("<h2>" +this.amarillo+ "</h2>");
		}
		if (op == 2) {

			pluma.println("<h2> ROJO </h2>");
			pluma.println("<p> el color traducido es : </p><br>");
			pluma.println("<h2>" +this.rojo+ "</h2>");
		}
		if (op == 3) {

			pluma.println("<h2> AZUL </h2>");
			pluma.println("<p> el color traducido es : </p><br>");
			pluma.println("<h2>" +this.azul+ "</h2>");
		}
		pluma.println("<br><br>");
		pluma.println("<a href=\"color.html\">intentar de nuevo</a>");
		pluma.println("<h3> U N I V E R S I D A D</h3>");
		pluma.println("</body>");
		pluma.println("</html>");
	}

}
