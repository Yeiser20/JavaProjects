/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfgenerate;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Victor D Archundia
 */
public class CartaDedicacionExc {
    String ciudad,estado,mesA,titularEs,cargoTitular,nomInstit,nomPosgrado,firma,nomSolicitante;
    int diaA, añoA,grado,numCVU;

    public CartaDedicacionExc(String ciudad, String estado, String mesA, String titularEs, String cargoTitular, String nomInstit, String nomPosgrado, String firma, String nomSolicitante, int diaA, int añoA, int grado, int numCVU) {
        this.ciudad = ciudad;
        this.estado = estado;
        this.mesA = mesA;
        this.titularEs = titularEs;
        this.cargoTitular = cargoTitular;
        this.nomInstit = nomInstit;
        this.nomPosgrado = nomPosgrado;
        this.firma = firma;
        this.nomSolicitante = nomSolicitante;
        this.diaA = diaA;
        this.añoA = añoA;
        this.grado = grado;
        this.numCVU = numCVU;
    }
     public void crearPdf(String dest) throws FileNotFoundException, IOException {
        PdfWriter pw = new PdfWriter(dest);
        PdfDocument pd = new PdfDocument(pw);
        Document doc = new Document(pd);
        PdfFont fuente = PdfFontFactory.createFont(FontConstants.HELVETICA_OBLIQUE);
        Text txv = new Text(ciudad+","+estado+" a "+diaA+" de "+mesA+" de "+añoA).setFontSize(12f);
        Text txv1 = new Text("_                      _\n").setUnderline().setFontSize(12f);
        Paragraph p1 = new Paragraph(ciudad+","+estado+" a "+diaA+" de "+mesA+" de "+añoA).setFontSize(12f);
        p1.setTextAlignment(TextAlignment.RIGHT);
        Paragraph p2 = new Paragraph(titularEs+"\n"+cargoTitular+"\n"+nomInstit+"\n").setFontSize(12f);
        Paragraph p3 = new Paragraph().add("En relación con la postulación a una beca presentada en el marco de la Convocatoria de Becas "
                + "CONACYT Nacionales 2015, para la obtención del grado de ").add(String.valueOf(grado)+"º").add( " en el programa " ).add(nomPosgrado +" ").add(
                 "que se imparte en esta institución, me permito hacer constar bajo protesta de decir "
                + "verdad lo siguiente:").setFontSize(12f);
        Paragraph p4 = new Paragraph("•	Que estoy aceptado e inscrito en el programa de posgrado referido, el cual se imparte de manera presencial convencional de tiempo completo y no es un curso de fin de semana, nocturno, semi-presencial, mixto, en línea, a distancia u otro que utilice tecnologías de información y comunicación para mediar su impartición, que he completado el 100% de los requisitos establecidos en mis estudios del grado anterior, obteniendo el promedio establecido en la convocatoria en las materias cursadas.");
        Paragraph p5 = new Paragraph("•	Que acepto el compromiso de ser estudiante de dedicación exclusiva durante la vigencia de la beca, lo cual significa que debo estar inscrito en el programa de posgrado con la carga académica total por período lectivo que el programa de posgrado haya registrado en el Programa Nacional de Posgrados de Calidad (PNPC), mantener un promedio igual o superior a 8 en cada uno de ellos, aprobar las materias cursadas y cumplir con la obtención del grado al término de la vigencia de la Beca Nacional.");
        Paragraph p6 = new Paragraph("Comunico a ustedes que estoy enterado(a) de los ordenamientos contenidos en el Reglamento de Becas del CONACYT y la convocatoria correspondiente y en las demás disposiciones legales o administrativas aplicables, en particular las obligaciones que adquiriré en caso de ser aceptado como becario(a), las cuales asumo cumplir cabalmente para lograr el propósito de la beca: la obtención del grado. En caso contrario, expreso mi plena conformidad para acatar las disposiciones normativas aplicables.\n" +
"\n" +
"La presente forma parte de los requisitos para la presentación de la postulación de beca en el marco de la convocatoria referida y queda sujeta a la posible verificación por parte del CONACYT.\n");
        Paragraph p7 = new Paragraph().add("ATENTAMENTE \n").add(txv1).add(nomSolicitante+"\n").add(String.valueOf(numCVU)).setFontSize(12f);
        
        doc.add(p1);
        doc.add(p2);
        doc.add(p3);
        doc.add(p4);
        doc.add(p5);
        doc.add(p6);
        doc.add(p7);
        doc.close();
        
     }
}
