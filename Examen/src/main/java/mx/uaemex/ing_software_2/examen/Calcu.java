package mx.uaemex.ing_software_2.examen;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//VICTOR DANIEL ARCHUNDIA SANCHEZ
/**
 * Servlet implementation class Calcu
 */
public class Calcu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private double num1;
	private double num2;
	private double den1;
	private double den2;
	private double resultado;
	private String operacion="";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pluma;
		operacion= request.getParameter("operacion");
		num1 = Double.valueOf(request.getParameter("num1"));
		num2 = Double.valueOf(request.getParameter("num2"));
		den1 = Double.valueOf(request.getParameter("den1"));
		den2 = Double.valueOf(request.getParameter("den2"));
		response.setContentType("text/html");
		pluma = response.getWriter();
		pluma.print("<!DOCTYPE html>");
		pluma.println("<html>");
		pluma.println("<head>");
		pluma.println("<title>Piedra Papel o tijera</title>");
		pluma.println("</head>");
		pluma.println("<body>");
		if (operacion.equals("+")) {
			resultado = (this.num1/this.den1)+(this.num2/this.den2);	
			}
		if (operacion.equals("-")) {
			resultado = (this.num1/this.den1)-(this.num2/this.den2);	
		}
		if (operacion.equals("*")) {
			resultado = (this.num1/this.den1)*(this.num2/this.den2);	
		}
		if (operacion.equals("/")) {
			resultado = (this.num1/this.den1)/(this.num2/this.den2);	
		}
		pluma.println("<h1> Resultado de la operacion ejecutada: "+resultado+"</h1>");
		pluma.println("<a href=\"Calculadora.html\">intentar de nuevo</a>");
		pluma.println("<h3> U N I V E R S I D A D</h3>");
		pluma.println("</body>");
		pluma.println("</html>");
	

		
	}
	}
