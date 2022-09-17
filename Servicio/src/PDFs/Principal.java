package PDFs;

import java.io.FileNotFoundException;
import java.io.IOException;
import com.itextpdf.text.BadElementException;



public class Principal {
	
    public static void main(String[] args) throws IOException, BadElementException {
        CartadePresentacion carta = new CartadePresentacion();
        System.out.println("Listo");
        carta.crearPdf();
    //    carta.crearPdf(DEST);
       

}
    
}
