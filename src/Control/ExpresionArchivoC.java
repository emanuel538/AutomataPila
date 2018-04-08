/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Estado;
import Modelo.Operacion;

/**
 *
 * @author elburi
 */
public class ExpresionArchivoC {

    private Operacion operacion;

    public ExpresionArchivoC() {
        operacion = new Operacion();

    }



    void agregarSimboloEntrada(String cadena) {
        cadena = cadena.replace("]", "");
        cadena = cadena.replace(",", "");
        cadena = cadena.replace("\"", "");
        for(int i = 0; i< cadena.length();i++){
            operacion.anadirSimboloEntrada(cadena.charAt(i), i);
        }
    }
    void agregarSimboloPila(String cadena) {
        cadena = cadena.replace("]", "");
        cadena = cadena.replace(",", "");
        cadena = cadena.replace("\"", "");
        for(int i = 0; i< cadena.length();i++){
            operacion.anadirSimboloPila(cadena.charAt(i), i);
        }
    }
    void agregarEstado(String nombre,String tansicion){
        tansicion = tansicion.replace("[","");
        tansicion = tansicion.replace("]","");
        tansicion = tansicion.replace(";",",");
        String transiciones [] = tansicion.split(",");
        Estado e;
        e = new Estado(nombre, transiciones);
        operacion.agregarEstado(e);
    }
    void imprimir(){
        operacion.recorrerEstado();
    }

}
