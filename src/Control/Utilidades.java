package Control;

import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField; //Crear Un Campo De Texto


public class Utilidades {
    
    // Funcion Para Cargar Un Archivo De Texto A un Text_Area
    public String cargar_Archivo (JTextField txtpath, TextArea txtGeneral){
        String ruta;
        ruta = "";
        String textoPila = new String(); // Variable Donde Se Guarda El Texto De La Pila
        JFileChooser FC = new JFileChooser(); //Instancia del File Chooser
        int result = FC.showOpenDialog(FC);
        if(result == JFileChooser.APPROVE_OPTION) {
            File Archivo = FC.getSelectedFile(); //Obtencion Del Archivo
            ruta = Archivo.getPath();
            txtpath.setText(ruta); // Asigna La Ruta Al Campo De Texto
             
             try {
                     
                     FileReader r = new FileReader(Archivo.getPath()); 
                     BufferedReader leer = new BufferedReader(r);
                        while(leer.ready()){ // Lee Hasta Que El Campo De Texto Este Vacio
                                    textoPila += (leer.readLine() + "\n") ;
				}
              } catch (Exception e ) {
                     JOptionPane.showMessageDialog(null, "Error Importando - " + e);
              }
             txtGeneral.setText(textoPila); // Asignacion Del Texto al Txt_Area
        }
        return ruta;
    }
    
    public void generarCombobox(){
        
    }
    
}
