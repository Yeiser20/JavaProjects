import java.util.ArrayList;
import java.util.Scanner;

public class Estados {
	static int cn = 0;
	char cad = 0;
	static String cadena = "";
	
	public void iniciar() {
		try {cn=0;
		System.out.println("____________________________________________");
		System.out.println("Expresion regular : 1(0|1)*00");
		System.out.print("ingresa la cadena a evaluar: ");
		Scanner sc = new Scanner(System.in);
		cadena = sc.nextLine();
	
		setEstadoA(separarCadena(cadena));
		
		} catch (Exception e) {
			System.out.println("La cadena ingresada no corresponde al automata");
			iniciar();
		}
	}
	public  ArrayList<String> separarCadena(String cadena) {
		ArrayList<String> lista = new ArrayList<>();
		for (int i = 0; i < cadena.length(); i++) {
			lista.add(String.valueOf(cadena.charAt(i)));
		}
		return lista;
	}

	public void setEstadoA(ArrayList<String> lista) {
		if (lista.get(cn).equals("1")) {
			cn++;
			setEstadoB(lista);
		}
		if (lista.get(cn).equals("0")) {
			System.out.println("La cadena ingresada no corresponde al automata");
			iniciar();
		}
		if (lista.get(cn) != "1" ) {
			System.out.println("La cadena ingresada no corresponde al automata");
			iniciar();
		}
	}

	public  void setEstadoB(ArrayList<String> lista) {

		if (lista.get(cn).equals("0")) {
			cn++;
			setEstadoD(lista);
		}
		if (lista.get(cn).equals("1")) {
			cn++;
			setEstadoC(lista);
		}
		if (lista.get(cn) != "0" |lista.get(cn) != "1" ) {
			System.out.println("La cadena ingresada no corresponde al automata");
			iniciar();
		}
	}

	public void setEstadoC(ArrayList<String> lista) {

		if (lista.get(cn).equals("0")) {
			cn++;
			setEstadoD(lista);
		}
		if (lista.get(cn).equals("1")) {
			cn++;
	
			setEstadoC(lista);
		} 
		if (lista.get(cn) != "0" |lista.get(cn) != "1" ) {
			System.out.println("La cadena ingresada no corresponde al automata");
			iniciar();
		}

	}

	public void setEstadoD(ArrayList<String> lista) {
		if (lista.get(cn).equals("0")) {
			cn++;
			setEstadoE(lista);
		}
		if (lista.get(cn).equals("1")) {
			cn++;
			setEstadoC(lista);
		}
		if (lista.get(cn) != "0" |lista.get(cn) != "1" ) {
			System.out.println("La cadena ingresada no corresponde al automata");
			iniciar();
		}

	}

	public  void setEstadoE(ArrayList<String> lista) {
		if (lista.size() == cn) {
			System.out.println("cadena aceptada");
			for (int i = 0; i < lista.size(); i++) {
				System.out.print(lista.get(i)+",");
			}
			System.out.println("\n");
			iniciar();
		} else {
			if (lista.get(cn).equals("0")) {
				cn++;
				setEstadoE(lista);
			}
			if (lista.get(cn).equals("1")) {
				cn++;
				setEstadoC(lista);
			}
		}

	}
}
