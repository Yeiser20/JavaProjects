package Pdf;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import java.io.FileNotFoundException;
import java.io.IOException;
	/**
	 *
	 * @author Victor D Archundia
	 */
	public class SolicitudAdmision {

	    String rfc,lAcentuacion,nombre,colonia,pais,eciv,municipio,apellidoP,apellidoM,estado,fechaNac,fecha,gm,gf,curp,calle,numCalle;

	    public SolicitudAdmision(String fecha, String acentuacion) {
	        this.fecha = fecha;
	        this.lAcentuacion = acentuacion;
	    }

	    public void crearPdf(String dest) throws FileNotFoundException, IOException {
	        PdfWriter pw = new PdfWriter(dest);
	        PdfDocument pd = new PdfDocument(pw);
	        Document doc = new Document(pd);
	        PdfFont fuente = PdfFontFactory.createFont(FontConstants.COURIER_BOLDOBLIQUE);
	        Paragraph p1 = new Paragraph("DOCTORADO EN CIENCIAS DE LAINGENIERÍA\n" + "FACULTADDE INGENIERÍA").setFont(fuente);
	        p1.setTextAlignment(TextAlignment.CENTER);
	        doc.add(p1);
	        Paragraph p2 = new Paragraph("SOLICITUD DE ADMISIÓN").setFont(fuente);
	        p2.setTextAlignment(TextAlignment.CENTER);
	        doc.add(p2);
	        Paragraph p3 = new Paragraph("Llenarcon letra de molde\n" + "Fecha:" + fecha + "\n" + "Línea de Acentuación:" + lAcentuacion).setFont(fuente);
	        Paragraph p4 = new Paragraph("Datos Generales\n"
	                + "Nombre(s):"+nombre+"\n"
	                + "Apellido paterno:"+apellidoP+"\n"
	                + "Apellido materno:"+apellidoM+"\n"
	                + "Fecha de nacimiento (dd/mm/aaaa):"+fechaNac+ "\n"
	                + "Género(X):Masculino "+gm+" Femenino"+gf+"\n"
	                + "CURP:"+curp+"\n"
	                + "RFC: "+rfc+"\n"
	                + "País de origen:"+pais+"\n"
	                + "Estado Civil:"+eciv+"\n"
	                + "Domicilio permanente\n"
	                + "Calle y número:"+calle+numCalle+ "\n"
	                + "Colonia:"+colonia+"\n"
	                + "Delegación o Municipio:"+municipio+"\n"
	                + "Estado:"+estado+"\n"
	                + "Código Postal:"+"\n"
	                + "País:Mexico\n"
	                + "Teléfono e email\n"
	                + "Teléfono particularcon clavelada 7222966721 Código delPaís +50\n"
	                + "Teléfono celular: 7224323760 Código delPaís +52 Código delÁrea 25\n"
	                + "Email de preferencia: daniel.das24681@gmail.com\n"
	                + "Emailalternativo: varchundias051@alumno.uaemex.mx\n"
	                + "Antecedentes académicos\n"
	                + "Grado: 6ª\n"
	                + "Nombre delacarrera o posgrado :ingenieriaenComputacion\n"
	                + "Nombre delaInstitución:UAEM\n"
	                + "Nombre dela Facultado o Escuela:Facultad deIngenieria\n"
	                + "Campus:Toluca\n"
	                + "Promedio: 8.0 Firma danie").setFont(fuente);
	        doc.add(p3);

	        doc.close();

	    }
	}

