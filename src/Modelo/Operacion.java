/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Estado;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author elburi
 */
public class Operacion {

    private Map<Character, Integer> simbolosEntrada;
    private Map<Character, Integer> simbolosPila;
    private ArrayList<Estado> estados;

    public Operacion() {
        simbolosEntrada = new HashMap<>();
        simbolosPila = new HashMap<>();
        estados = new ArrayList<>();

    }

    public void anadirSimboloEntrada(char t, int i) {
        simbolosEntrada.put(t, i);
    }

    public void anadirSimboloPila(char t, int i) {
        simbolosPila.put(t, i);
    }
    public int calcularposArreglo(char entrada,char pila){
        int pos;
        pos = simbolosEntrada.size()*simbolosPila.get(pila) +simbolosEntrada.get(entrada);
        return pos;   
    }
    public void agregarEstado(Estado e){
        estados.add(e);
    }
    public void recorrerEstado(){
        for(Estado x : estados){
            for(int i = 0; i < x.getTransicion().length; i++){
                System.out.println(x.getTransicion()[i]);
            }
            System.out.println("fffffffff");
        }
    }

}
