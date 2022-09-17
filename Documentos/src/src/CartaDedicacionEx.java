package src;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CartaDedicacionEx {
	private String lugar="";
	private String fecha="";
	private String nomTitular="";
	private String cargoTitular="";
	private String nomInstit="";
	private String nombrePosgrado="";
	private String nomSolicit="";
	private String numCvu="";
	private int grado=0;
	
	
	public CartaDedicacionEx(String lugar, String fecha,String nomTitular, String cargoTitular, String nomInstit,
			String nombrePosgrado, String nomSolicit, String numCvu, int grado) {
		super();
		this.lugar = lugar;
		this.nomTitular = nomTitular;
		this.cargoTitular = cargoTitular;
		this.nomInstit = nomInstit;
		this.nombrePosgrado = nombrePosgrado;
		this.nomSolicit = nomSolicit;
		this.numCvu = numCvu;
		this.grado = grado;
		this.fecha = fecha;
	}


	public void crearPdf() {
	Document doc = new Document();
	try {
	String ruta="C:\\Users\\danie\\OneDrive\\Documentos\\CartaDedicacionEx.pdf"; 
	PdfWriter.getInstance(doc,new FileOutputStream(ruta));
	doc.open();
	
	Paragraph p1 = new Paragraph();
	p1.setAlignment(Paragraph.ALIGN_RIGHT);
	p1.setFont(FontFactory.getFont("Arial", 12, BaseColor.BLACK));
	p1.add(lugar+ fecha+"\n");
    doc.add(p1);
    
	Paragraph p2 = new Paragraph();
	p2.setAlignment(Paragraph.ALIGN_LEFT);
	p2.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
	p2.add(nomTitular);
    doc.add(p2);

	Paragraph p3 = new Paragraph();
	p3.setAlignment(Paragraph.ALIGN_LEFT);
	p3.setFont(FontFactory.getFont("Arial", 12, BaseColor.BLACK));
	p3.add(cargoTitular);
    doc.add(p3);

	Paragraph p4 = new Paragraph();
	p4.setAlignment(Paragraph.ALIGN_LEFT);
	p4.setFont(FontFactory.getFont("Arial", 12, BaseColor.BLACK));
	p4.add(nomInstit+"\n\n");
    doc.add(p4);

	Paragraph p5 = new Paragraph();
	p5.setAlignment(Paragraph.ALIGN_JUSTIFIED_ALL);
	p5.setFont(FontFactory.getFont("Arial", 12, BaseColor.BLACK));
	p5.add("En relación con la postulación a una beca presentada en el marco de la Convocatoria de Becas CONACYT Nacionales 2015, para la obtención del grado de "+grado+"º  en el programa "+nombrePosgrado +" que se imparte en esta institución, me permito hacer constar bajo protesta de decir verdad lo siguiente:\r\n"
			+ "\r\n"
			+ "       •	Que estoy aceptado e inscrito en el programa de posgrado referido, el cual se imparte de manera presencial convencional de tiempo completo y no es un curso de fin de semana, nocturno, semi-presencial, mixto, en línea, a distancia u otro que utilice tecnologías de información y comunicación para mediar su impartición, que he completado el 100% de los requisitos establecidos en mis estudios del grado anterior, obteniendo el promedio establecido en la convocatoria en las materias cursadas.\r\n"
			+ "\r\n"
			+ "       •	Que acepto el compromiso de ser estudiante de dedicación exclusiva durante la vigencia de la beca, lo cual significa que debo estar inscrito en el programa de posgrado con la carga académica total por período lectivo que el programa de posgrado haya registrado en el Programa Nacional de Posgrados de Calidad (PNPC), mantener un promedio igual o superior a 8 en cada uno de ellos, aprobar las materias cursadas y cumplir con la obtención del grado al término de la vigencia de la Beca Nacional.\r\n"
			+ "\r\n"
			+ "Comunico a ustedes que estoy enterado(a) de los ordenamientos contenidos en el Reglamento de Becas del CONACYT y la convocatoria correspondiente y en las demás disposiciones legales o administrativas aplicables, en particular las obligaciones que adquiriré en caso de ser aceptado como becario(a), las cuales asumo cumplir cabalmente para lograr el propósito de la beca: la obtención del grado. En caso contrario, expreso mi plena conformidad para acatar las disposiciones normativas aplicables.\r\n"
			+ "\r\n"
			+ "La presente forma parte de los requisitos para la presentación de la postulación de beca en el marco de la convocatoria referida y queda sujeta a la posible verificación por parte del CONACYT.\r\n"
			+ "");
    doc.add(p5);
    
    Paragraph p6 = new Paragraph();
	p6.setAlignment(Paragraph.ALIGN_CENTER);
	p6.setFont(FontFactory.getFont("Arial", 12, BaseColor.BLACK));
	p6.add("\r\n"
			+ "Atentamente\r\n"
			+ "\r\n"
			+ "__________(firma)_________	\r\n"
			+ nomSolicit+"\r\n"
			+ numCvu+"\r\n"
			+ "		\r\n"
			+ "");
    doc.add(p6);
    doc.close();
	
	}catch (IOException | DocumentException e) {
		e.printStackTrace();
	}
}
	
}
