package Pdf;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {
    /**
     * @param args the command line arguments
     */
    public static final String DEST ="C:\\Users\\danie\\OneDrive\\Documentos\\NetbeansProjects\\PdfGenerate\\Ejemplo1.pdf"; 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        SolicitudAdmision sa = new SolicitudAdmision("20/07/18","Computacion 1");
        sa.crearPdf(DEST);
}
}
