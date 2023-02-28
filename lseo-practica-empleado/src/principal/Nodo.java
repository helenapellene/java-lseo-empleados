/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Helena
 */
public class Nodo {
    private Empleado dato;
    private Nodo ps;
    
    public Nodo(Empleado dato){
        this.dato=dato;
    }
    
    
    public Nodo(Empleado dato, Nodo ps) {
        this.dato = dato;
        this.ps = ps;
    }

    public Empleado getDato() {
        return dato;
    }

    public void setDato(Empleado dato) {
        this.dato = dato;
    }

    public Nodo getPs() {
        return ps;
    }

    public void setPs(Nodo ps) {
        this.ps = ps;
    }

    
    
    
}
