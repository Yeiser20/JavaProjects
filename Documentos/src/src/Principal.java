package src;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.itextpdf.text.BadElementException;

public class Principal {
public static void main(String[] args) throws FileNotFoundException, BadElementException, IOException {
	CartadePresentacion cp = new CartadePresentacion("20","2022","08","Daniel Archundia","Inteligencia Artficial","linea Inv");
	cp.crearPdf();
	CartaDedicacionEx cd= new CartaDedicacionEx("Toluca, Estado de Mexico a ", "20 de agosto del 2022","Victor Daniel Archundia","Encargado de area", "UAEM", "Posgrado", "Oosmar Marinez Perez", "1612051F", 7);
	cd.crearPdf();
	System.out.println("Archivo generado correctamente");
	
}
}
