/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author elburi
 */
public class Estado {
    private String nombre;
    private String [] transicion;

    public Estado(String nombre, String[] transicion) {
        this.nombre = nombre;
        this.transicion = transicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getTransicion() {
        return transicion;
    }

    public void setTransicion(String[] transicion) {
        this.transicion = transicion;
    }
    
    
}
