package Clases;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class cGenerarPdf2 {

    public void generar(Boleta boleta) {
        // step 1: creation of a document-object        
        Document document = new Document();

        try {
            // step 2: creation of the writer
            PdfWriter writer = PdfWriter.getInstance(document, 
                    new FileOutputStream("Boleta.pdf"));

            // step 3: we open the document
            document.open();
            
            // step 4: we grab the ContentByte and do some stuff with it
            PdfContentByte cb = writer.getDirectContent();
            Graphics g = cb.createGraphicsShapes(PageSize.LETTER.getWidth(), PageSize.LETTER.getHeight());

            //--------------------- pagina 1 --------------------------  
            
           // g.setColor(new Color(154, 171, 237));
            //g.fillOval(290, 90, 280, 100);
                        
            Font font1 = new Font("Tahoma", Font.BOLD + Font.ITALIC, 30);
            g.setFont(font1);

            g.setColor(Color.BLACK);
            g.drawString("Boleta de Pago" + " "+ boleta.Anio+"-"+boleta.Mes, 80, 90);
           
            
            //ImageIcon img1 = new ImageIcon(getClass().getResource("imagenes/play_list_youtube-GUI_Java.jpg"));
            //g.drawImage(img1.getImage(), 200, 250, 200, 200, null);
            
            Font font2 = new Font("Tahoma", Font.PLAIN, 10);
            Font font3 = new Font("Tahoma", Font.PLAIN, 14);
            g.setFont(font2);
            g.setColor(Color.BLACK);
            
            //Columna 1
            g.drawString("Docente: ", 40, 150);
            g.drawString(boleta.Nombres+" "+boleta.Apellidos, 160, 150);
            
            g.drawString("Nro Cuenta: ", 40, 170);
            g.drawString(boleta.CuentaBancaria, 160, 170);
            
             g.drawString("Categoria: ", 40, 190);
            g.drawString(boleta.Categoria, 160, 190);
            
             g.drawString("Monto Categoria: ", 40, 210);
            g.drawString(boleta.MontoDescporCategoria, 160, 210);
            
              g.drawString("Hora Dictadas: ", 40, 230);
            g.drawString(boleta.HorasDictadas, 160, 230);
            
              g.drawString("Bonificación ", 40, 250);
            g.drawString(boleta.TipoBonificacion, 160, 250);
            
               g.drawString("Seguro Salud ", 40, 270);
            g.drawString(boleta.SeguroSalud, 160, 270);
            
            //columna 2
             g.drawString("Deduccion: ", 340, 150);
            g.drawString(boleta.Deduccion, 440, 150);
            
            g.drawString("Monto Deduccion: ", 340, 170);
            g.drawString(boleta.MontoDescporSeguro, 440, 170);
            
             g.drawString("Nivel: ", 340, 190);
            g.drawString(boleta.Nivel, 440, 190);
            
             g.drawString("Costo por Hora: ", 340, 210);
            g.drawString(boleta.SueldoxHora, 440, 210);
            
            int SueldoMes=Integer.parseInt(boleta.SueldoxHora)*Integer.parseInt(boleta.HorasDictadas);
            
            g.drawString("Sueldo Bruto: ", 340, 230);
            g.drawString(String.valueOf(SueldoMes),440, 230);
            
             g.drawString("Monto Bonificación: ", 340, 250);
            g.drawString(boleta.MontoBonificacion, 440, 250);
            
            g.setFont(font3);
            g.setColor(Color.red);
             g.drawString("Monto Neto ", 340, 270);
            g.drawString(boleta.SueldoNeto, 440, 270);
            
            //firma
           g.setFont(font2);
            g.setColor(Color.BLACK);
            g.drawString("_____________________________", 80, 400);
            g.drawString("Nena Gloria Acosta Medina", 100, 420);
            g.drawString("REPRESENTANTE LEGAL", 100, 440);
            
             g.drawString("_____________________________", 320, 400);
            g.drawString(boleta.Nombres+"  "+boleta.Apellidos, 350, 420);
            g.drawString("DOCENTE", 370, 440);
            
            
    
            
            
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }

        // step 5: we close the document
        document.close();

        JOptionPane.showMessageDialog(null, 
                "Se creo el archivo Boleta.pdf en la carpeta del proyecto");
    }

   // public static void main(String[] args) {
        
     //   cGenerarPdf2 obj = new cGenerarPdf2();
      //  obj.prueba();
   // }
}
