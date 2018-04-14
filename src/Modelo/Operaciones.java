package Modelo;

/*
Operaciones Del Automata De Pila
*/

import Control.Transicion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Operaciones {

    private Map<Character, Integer> simbolosEntrada;
    private Map<Character, Integer> simbolosPila;
    private ArrayList<Estado> estados;
    private String inicial;
    private Map<String, Transicion> transicion;

    public Operaciones() {
        simbolosEntrada = new HashMap<>();
        simbolosPila = new HashMap<>();
        estados = new ArrayList<>();
        inicial = "";
        transicion = new HashMap<>();

    }

    public void anadirSimboloEntrada(char t, int i) {
        simbolosEntrada.put(t, i);
    }

    public void anadirSimboloPila(char t, int i) {
        simbolosPila.put(t, i);
    }



    public void anadirTransicion(String clave, Transicion t) {
        transicion.put(clave, t);
    }

    public int calcularposArreglo(char entrada, char pila) {
        int pos;
        pos = simbolosEntrada.size() * simbolosPila.get(pila) + simbolosEntrada.get(entrada);
        return pos;
    }

    public void agregarEstado(Estado e) {
        estados.add(e);
    }

    public void recorrerEstado() {
        for (Estado x : estados) {
            for (int i = 0; i < x.getTransicion().length; i++) {
                System.out.println(x.getTransicion()[i]);
            }
            System.out.println("fffffffff");
        }
    }

    public void setInicial(String inicial) {
        this.inicial = inicial;
    }

}