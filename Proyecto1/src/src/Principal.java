package src;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {
    public static final String DEST ="C:\\Users\\danie\\OneDrive\\Documentos\\NetbeansProjects\\PdfGenerate\\Document.pdf"; 
    public static final String DEST2 ="C:\\Users\\danie\\OneDrive\\Documentos\\NetbeansProjects\\PdfGenerate\\Document3.pdf";
    
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        ArrayList<Alumnos> alumnos = new ArrayList<>();
        Alumnos al = new Alumnos("123456", "Acentuacion", "nombre", "paisO", "colonia", "nombre de la institucion", "nombre de la escuela", "nombre de la carrera", "campus", "correo preferencia", "correo Institucional", "codigo Pais", "pais", "estado civil", "municipio", "apellido paterno", "codigo de area", "apellido materno", "estado ", "fecha dia actual", "genero ", "generoF", "no se", "n", "n", "n", 1, 2, 3,20,"mes",2001);
        alumnos.add(al);
        SolicitudAdmision sa = new SolicitudAdmision(al.getRfc(), al.getlAcentuacion(), al.getNombre(),al.getPaisO(),al.getColonia(), al.getNomInstit(),al.getNomEscuela(), al.getNomCarrera(), al.getCampus(), al.getCorreoPref(), al.getCorreoInstit(), al.getCodigoPais(), al.getPais(), al.getEciv(), al.getMunicipio(), al.getApellidoP(), al.getCodArea(), al.getApellidoM(),al.getEstado(), al.getFecha(), al.getGm(), al.getGf(), al.getCurp(), al.getCalle(), al.getNumCalle(), al.getCp(), 0, 0, 0,al.getMesN(),al.getDiaN(),al.getAñoN());
        sa.crearPdf(DEST);
       /* CartaDedicacionExc cde = new CartaDedicacionExc("Toluca", "Estado de Mexico", "AGOSTO", "DANIEL ARCHUNDIA SANCHEZ ", "EN CARGADO DE LABORATORIO", "FACULTAD DE INGENIERIA", "POSGRADO", "FIRMA", "VICTOR DANIEL ARCHUNDIA SANCHEZ", 12,8, 7, 1612051);
        cde.crearPdf(DEST2);*/
    }
}
