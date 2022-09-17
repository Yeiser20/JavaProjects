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
public class SolicitudAdmision {

    String rfc, lAcentuacion, nombre, paisO, colonia, nomInstit, nomEscuela, nomCarrera, campus, correoPref, correoInstit, codigoPais, pais, eciv, municipio, apellidoP, codArea, apellidoM, estado, fecha, gm, gf, curp, calle, numCalle, cp, mesN;
    int telefono, telefonoP, grado, diaN, añoN;

    SolicitudAdmision(String rfc, String lAcentuacion, String nombre, String paisO, String colonia, String nomInstit, String nomEscuela, String nomCarrera, String campus, String correoPref, String correoInstit, String codigoPais, String pais, String eciv, String municipio, String apellidoP, String codArea, String apellidoM, String estado, String fecha, String gm, String gf, String curp, String calle, String numCalle, String cp, int telefono, int telefonoP, int grado, String mesN, int diaN, int añoN) {
        this.rfc = rfc;
        this.lAcentuacion = lAcentuacion;
        this.nombre = nombre;
        this.paisO = paisO;
        this.colonia = colonia;
        this.nomInstit = nomInstit;
        this.nomEscuela = nomEscuela;
        this.nomCarrera = nomCarrera;
        this.campus = campus;
        this.correoPref = correoPref;
        this.correoInstit = correoInstit;
        this.codigoPais = codigoPais;
        this.pais = pais;
        this.eciv = eciv;
        this.municipio = municipio;
        this.apellidoP = apellidoP;
        this.codArea = codArea;
        this.apellidoM = apellidoM;
        this.estado = estado;
        this.fecha = fecha;
        this.gm = gm;
        this.gf = gf;
        this.curp = curp;
        this.calle = calle;
        this.numCalle = numCalle;
        this.cp = cp;
        this.telefono = telefono;
        this.telefonoP = telefonoP;
        this.grado = grado;
        this.diaN = diaN;
        this.mesN = mesN;
        this.añoN = añoN;
    }

    public void crearPdf(String dest) throws FileNotFoundException, IOException {
        PdfWriter pw = new PdfWriter(dest);
        PdfDocument pd = new PdfDocument(pw);
        Document doc = new Document(pd);
        doc.setMargins(20f, 80f,20f,80f);
        PdfFont fuente = PdfFontFactory.createFont(FontConstants.HELVETICA_OBLIQUE);
        //textos con underline
        Text txv = new Text(fecha + "____________________________________________").setUnderline().setFontSize(12f);
        Text tx = new Text(lAcentuacion + "______________________________________ ").setUnderline().setFontSize(12f);
        Text txv1 = new Text(nombre + "                                 _\n").setUnderline().setFontSize(12f);
        Text txv2 = new Text(apellidoP + "                               _\n").setUnderline().setFontSize(12f);
        Text txv3 = new Text(apellidoM + "                              _\n").setUnderline().setFontSize(12f);
        Text txv4 = new Text(diaN + " /").setUnderline();
        Text txv5 = new Text(" "+mesN + "   /").setUnderline();
        Text txv6 = new Text(" "+añoN).setUnderline();
        Text txv7 = new Text(gm).setUnderline();
        Text txv8 = new Text(gf).setUnderline();
        Text txv9 = new Text(curp + "__________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv10 = new Text(rfc + "__________________        \n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv11 = new Text(paisO + "_________________        \n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv12 = new Text(eciv + "_________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv13 = new Text(calle).setUnderline().setFont(fuente).setFontSize(11f);
        Text txv14 = new Text(numCalle + " ________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv15 = new Text(colonia + "__________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv16 = new Text(municipio + "__________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv17 = new Text(estado + "__________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv18 = new Text(cp + "_________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv19 = new Text(pais + "_____________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv20 = new Text(telefonoP + "________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv21 = new Text(codigoPais + "___________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv22 = new Text(codArea + "________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv23 = new Text(correoPref + "________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv24 = new Text(correoInstit + "____________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv25 = new Text(grado + "__________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv26 = new Text(nomCarrera + "___________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv27 = new Text(nomInstit + " _______________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv28 = new Text(nomEscuela + "__________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv29 = new Text(nomEscuela + " _________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        Text txv30 = new Text(campus + "___________________\n").setUnderline().setFont(fuente).setFontSize(11f);
        //textos en negritas
        Text tx1 = new Text("\n"+"LLENAR CON LETRA DE MOLDE \n\n").setBold().setFontSize(8f);
        Text tx2 = new Text("\n"+"Daros Generales \n\n").setBold();
        Text tx3 = new Text("\n"+"Domicilio Permanente \n\n").setBold();
        Text tx4 = new Text("\n"+"Teléfono e email \n\n").setBold();
        Text tx5 = new Text("\n"+"Antescedentes académicos \n\n").setBold();
        //crear parrafos
        Paragraph p1 = new Paragraph("DOCTORADO EN CIENCIAS DE LAINGENIERÍA\n" + "FACULTADDE INGENIERÍA").setFontSize(11f);
        p1.setTextAlignment(TextAlignment.CENTER);
        Paragraph titulo = new Paragraph("SOLICITUD DE ADMISIÓN").setBold().setFontSize(12f);
        titulo.setTextAlignment(TextAlignment.CENTER);
        Paragraph p3 = new Paragraph().add(tx1).add("" + "Fecha:").add(txv).add("\n" + "Línea de Acentuación: ").add(tx);
        Paragraph p4 = new Paragraph().add(tx2).add(
                "Nombre(s):").add(txv1).add(
                "Apellido paterno:").add(txv2).add(
                "Apellido materno:").add(txv3).add(
                "Fecha de nacimiento: ").add(txv4).add(" ").add(txv5).add(" ").add(txv6).add(" (dd/mm/aaaa)\n").add("Género:").add(txv7).add("Masculino ").add(txv8).add(" Femenino" + "\n"
                + "CURP:").add(txv9).add("RFC: ").add(txv10).add(
                "País de origen:").add(txv11).add(
                "Estado Civil:").add(txv12).add(tx3).add(
                "Calle y número:").add(txv13).add(txv14).add(
                "Colonia:").add(txv15).add(
                "Delegación o Municipio:").add(txv16).add(
                "Estado:").add(txv17).add(
                "Código Postal:").add(txv18).add(
                "País:").add(txv19).add(tx4).add(
                "Teléfono particular con clave lada:  ").add(txv20).add("Código delPaís:  ").add(txv21).add(
                "Teléfono celular: ").add(txv22).add("Código del País: ").add(txv21).add("Código del Área: ").add(txv23).add("Email de preferencia: ").add(txv24).add(
                "Email alternativo: ").add(txv25).add(tx5).add(
                "Grado: ").add(txv26).add("Nombre de la carrera o posgrado : ").add(txv27).add(
                "Nombre de la Institución: ").add(txv28).add("Nombre de la Facultado o Escuela: ").add(txv29).add("Campus: ").add(
                txv30).add("Promedio: 8.0 Firma danie: ").setFontSize(11f).setFixedLeading(15f);
        //agregar parrafos al documento  
        doc.add(p1);
        doc.add(titulo);
        doc.add(p3);
        doc.add(p4);
        doc.close();

    }
}
