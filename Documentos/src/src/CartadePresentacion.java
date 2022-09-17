package src;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CartadePresentacion {
	private String dia="";
	private String anio="";
	private String mes="";	
	private String nombre= "";
	private String lineaAcentuacion="";
	private String lineaInv = "";
    
	public CartadePresentacion(String dia, String anio, String mes, String nombre, String lineaAcentuacion,
			String lineaInv) {
		super();
		this.dia = dia;
		this.anio = anio;
		this.mes = mes;
		this.nombre = nombre;
		this.lineaAcentuacion = lineaAcentuacion;
		this.lineaInv = lineaInv;
	}

	public CartadePresentacion( ) {    
    }

    public void crearPdf() throws FileNotFoundException, IOException,BadElementException {
    	Document doc = new Document();
    	try {
    	String ruta="C:\\Users\\danie\\OneDrive\\Documentos\\CartaDePresentacion.pdf"; 
		PdfWriter.getInstance(doc,new FileOutputStream(ruta));
		doc.open();
    	Image enca = Image.getInstance("C:\\Users\\danie\\OneDrive\\Documentos\\Eclipse\\Servicio\\encabezadoDocumentos.jpg");
    	enca.scaleToFit(550,950);
    	enca.setAlignment(Chunk.ALIGN_JUSTIFIED_ALL);
    	Image pie = Image.getInstance("C:\\Users\\danie\\OneDrive\\Documentos\\Eclipse\\Servicio\\piedepagina.jpg");
    	pie.scaleToFit(550,950);
    	pie.setAlignment(Chunk.ALIGN_JUSTIFIED_ALL);
		Paragraph p1 = new Paragraph();
		p1.setAlignment(Paragraph.ALIGN_CENTER);
		p1.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
		p1.add(enca);
		p1.add("\n\n\n\n\n");
		p1.add("Carta de presentación \n\n\n");
        doc.add(p1);
        Paragraph p10= new Paragraph();
		p10.setAlignment(Paragraph.ALIGN_RIGHT);
		p10.setFont(FontFactory.getFont("Verdana", 12, Font.NORMAL, BaseColor.BLACK));
		p10.add("Toluca, Estado de México a "+ dia +" de"+mes+"del" + anio+"\n\n");
        doc.add(p10);
        Paragraph p2= new Paragraph();
		p2.setAlignment(Paragraph.ALIGN_LEFT);
		p2.setFont(FontFactory.getFont("Verdana", 12, Font.BOLD, BaseColor.BLACK));
		p2.add("DR.\n" +
		"COORDINADOR DEL PROGRAMA DE DOCTORADO EN CIENCIAS DE LA INGENIERÍA \n" +
		"P R E S E N T E \n\n");
        doc.add(p2);
        Paragraph p3= new Paragraph();
        Paragraph p4= new Paragraph();
		p3.setAlignment(Paragraph.ALIGN_LEFT);
		p3.setFont(FontFactory.getFont("Verdana", 12, Font.NORMAL, BaseColor.BLACK));
		p3.add("Nombre del candidato:"+nombre+"\n" + "Linea de acentuación al\n" + "que solicita ingreso:"+ lineaAcentuacion+"\n" + "Linea de Investigación:"+lineaInv+"\n\n");
        doc.add(p3);	        
        p4.setAlignment(Paragraph.ALIGN_JUSTIFIED_ALL);
		p4.setFont(FontFactory.getFont("Verdana", 12, Font.NORMAL, BaseColor.BLACK));
		p4.add("	El candidato ha demostrado interés en realizar sus estudios dentro del "
			+ "proyecto que se le presentó y en la Línea de Acentuación en la que solicita su ingreso al programa.\n\n");
        doc.add(p4);	        
        Paragraph p5= new Paragraph();
		p5.setAlignment(Paragraph.ALIGN_JUSTIFIED_ALL);
		p5.setFont(FontFactory.getFont("Verdana", 12, Font.NORMAL, BaseColor.BLACK));
		p5.add("He observado cualidades en el candidato para realizar estudios de Doctorado,"
	  		+ "por lo que me permito presentarlo para que participe en el proceso de admisión"
			+ "del programa.\n\n");
        doc.add(p5);

        Paragraph p6= new Paragraph();
		p6.setAlignment(Paragraph.ALIGN_JUSTIFIED_ALL);
		p6.setFont(FontFactory.getFont("Verdana", 12, Font.NORMAL, BaseColor.BLACK));
		p6.add("Si el candidato aprueba la totalidad de las pruebas, me comprometo a "
		+ "respaldarlo como director de tesis, para que los lleve a buen fin y contribuir en "
		+ "los índices de eficiencia del programa. \n\n");
        doc.add(p6);

        Paragraph p7= new Paragraph();
		p7.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p7.setFont(FontFactory.getFont("Verdana", 12, Font.NORMAL, BaseColor.BLACK));
		p7.add("Me pongo a sus órdenes para cualquier aclaración.\n\n\n\n\n");
        doc.add(p7);

        Paragraph p8= new Paragraph();
		p8.setAlignment(Paragraph.ALIGN_CENTER);
		p8.setFont(FontFactory.getFont("Verdana", 12, Font.NORMAL, BaseColor.BLACK));
		p8.add("A T E N T A M E N T E\n"
			      		+ "Dr.\n"
			       		+ "Profesor Investigador\n"
			       		+ "Facultad de Ingeniería\n"
			       		+ "UAEM");
        doc.add(p8);
        doc.close();
        } catch (IOException | DocumentException e) {
			e.printStackTrace();
		}


    	 



}
}
