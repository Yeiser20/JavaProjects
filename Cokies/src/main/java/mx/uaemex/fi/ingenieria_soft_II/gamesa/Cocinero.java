package mx.uaemex.fi.ingenieria_soft_II.gamesa;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Cocinero
 */
public class Cocinero extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw;
		Cookie galleta;
		String sabor;
		HttpSession sesion;
		String talla;
		
		sesion = request.getSession();
		talla = request.getParameter("talla");
		//procesar el formulario
		sabor = request.getParameter("sabor");
		
		sesion.setAttribute("talla favorita", talla);
		galleta = new Cookie("sabor",sabor);
		
		response.addCookie(galleta);
		
		galleta.setValue(sabor);
		response.setContentType("text/html");
		pw = response.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Cocina</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<p>Gracias por compartir sus preferencias</p>");
		pw.println("<a href=\"index.html\">Regresar </a>");
		pw.println("y la sesion es ... "+sesion);
		pw.println("</body>");
		pw.println("</html>");
		
	}
}
