/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.ExpresionArchivoC;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author elburi
 */
public class ArchivoC {

    public ArchivoC(String ruta) {
        ExpresionArchivoC expresion = new ExpresionArchivoC();
        String nombre;
        nombre = "";
        try {
            BufferedReader f = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = f.readLine()) != null) {
                linea = linea.replaceAll("\\s", "");
                String a[] = linea.split("\\[");
                if (a[0].equalsIgnoreCase("\"Simbolosdeentrada\":")) {
                    expresion.agregarSimboloEntrada(a[1]);

                } else {
                    if (a[0].equalsIgnoreCase("\"Simbolosenlapila\":")) {
                        expresion.agregarSimboloPila(a[1]);

                    } else {
                        if (a[0].equalsIgnoreCase("\"Estados\":")) {
                            while ((linea = f.readLine()) != null) {
                                linea = linea.replaceAll("\\s", "");
                                if (linea.equalsIgnoreCase("],")) {
                                    break;
                                }
                                a = linea.split(":");
                                if (a[0].equalsIgnoreCase("\"nombre\"")) {
                                    nombre = a[1].replace("\"", "");

                                }
                                if (a[0].equalsIgnoreCase("\"transiciones\"")) {
                                    expresion.agregarEstado(nombre, a[1]);

                                }

                            }

                        }
                    }
                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Ruta equivocada");
        } catch (IOException ex) {
            System.out.println("Error");
        }
        expresion.imprimir();

    }

}
