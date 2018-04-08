/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author elburi
 */
public class Simbolo {

    private Map<Character, Integer> simbolosEntrada;
    private Map<Character, Integer> simbolosPila;

    public Simbolo() {
        simbolosEntrada = new HashMap<>();
        simbolosPila = new HashMap<>();

    }

    void anadirSimboloEntrada(char t, int i) {
        simbolosEntrada.put(t, i);
    }

    void anadirSimboloPila(char t, int i) {
        simbolosPila.put(t, i);
    }
    public int calcularposArreglo(char entrada,char pila){
        int pos;
        pos = simbolosEntrada.size()*simbolosPila.get(pila) +simbolosEntrada.get(entrada);
        return pos;   
    }

}
