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
import java.util.Random;

/**
 * @VICTOR DANIEL ARCHUNDIA SANCHEZ 
 * Servlet implementation class Ppt
 */
public class Ppt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String opcion;
	Random aleatorio = new Random(System.currentTimeMillis());

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		opcion = config.getInitParameter(opcion);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String opcionE = "";
		String opcionEM = "";
		int op;
		int opcionM = 0;
		op = Integer.parseInt(request.getParameter("Name"));
		PrintWriter pluma;
		response.setContentType("text/html");
		pluma = response.getWriter();
		pluma.print("<!DOCTYPE html>");
		pluma.println("<html>");
		pluma.println("<head>");
		pluma.println("<title>Piedra Papel o tijera</title>");
		pluma.println("</head>");
		pluma.println("<body>");
		if (op == 1) {
			opcionE = "piedra";
		}
		if (op == 2) {
			opcionE = "papel";
		}
		if (op == 3) {
			opcionE = "tijera";
		}

		pluma.println("Seleccion de jugador: " + opcionE);
		pluma.println("<br><br>");
		opcionM = aleatorio.nextInt((3 - 1) + 1) + 1;
		if (opcionM == 1) {
			opcionEM = "piedra";
		}
		if (opcionM == 2) {
			opcionEM = "papel";
		}
		if (opcionM == 3) {
			opcionEM = "tijera";
		}
		pluma.println("seleccion de Maquina: " + opcionEM);
		pluma.println("<br><br>");

		if (opcionM == op) {
			pluma.println(" --- EMPATE---");
			pluma.println(" INTENTALO DE NUEVO");
		}
		if (op == 1 && opcionM == 2) {
			pluma.println(" PERDISTE");
		} else if (op == 2 && opcionM == 1) {
			pluma.println(" GANASTE");
		}
		if (op == 2 && opcionM == 3) {
			pluma.println(" PERDISTE");
		} else if (op == 3 && opcionM == 2) {
			pluma.println(" GANASTE");
		}
		if (op == 3 && opcionM == 1) {
			pluma.println("---- PERDISTE---- :(");
		} else if (op == 1 && opcionM == 3) {
			pluma.println(" GANASTE");
		}
		pluma.println("<br><br>");
		pluma.println("<a href=\"juego.html\">intentar de nuevo</a>");
		pluma.println("<h3> U N I V E R S I D A D</h3>");
		pluma.println("</body>");
		pluma.println("</html>");

	}

}
