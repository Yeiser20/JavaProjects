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

import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;

/**
 * Servlet implementation class Mesero
 */
public class Mesero extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw;
		Cookie[] tarro;
		String sabor="";
		HttpSession sesion;
		String t;
		
		sesion = request.getSession();
		
		t = (String)sesion.getAttribute("talla favorita");
		//procesar las COOKIES
		
		tarro = request.getCookies();
		if(tarro!=null) {
		for (Cookie g:tarro) {
			if (g.getName().compareTo("sabor")==0) {
				sabor= g.getValue();
				
			}
		}
		}
		response.setContentType("text/html");
		pw = response.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Cocina</title>");
		pw.println("</head>");
		pw.println("<body>");
		if(sabor.length()>0) {
			pw.println("<p>Tenemos 14 galletas, sabor: ->"+sabor+"<- especialmente para ti</p>");
			pw.println("<a href=\"index.html\">Regresar</a>");
		}else {
			pw.println("<p>Para prepararte las galletas debes seleccionar el sabor");
			pw.println("<a href=\"index.html\">Ir a seleccionar</a>");
		}
		pw.println("la talla es "+t);
		pw.println("</body>");
		pw.println("</html>");
		
	}

}
