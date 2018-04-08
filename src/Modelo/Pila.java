/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Map;
import java.util.Stack;

/**
 *
 * @author elburi
 */
public class Pila {

    private Stack<Character> pila;
    private Map<String, String> transiciones;

    public Pila(String inicial) {
        pila = new Stack<>();
        for (int i = 0; i < inicial.length(); i++) {
            pila.push(inicial.charAt(i));
        }

    }

    public void apilar(char t) {
        pila.push(t);
    }

    public void desapilar() {
        pila.pop();
    }

    public void replace(String a) {
        pila.pop();
        for (int i = 0; i < a.length(); i++) {
            pila.push(a.charAt(i));
        }

    }
    public char tope(){
        return pila.peek();
    }

}
