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
public class ListaOrdenada extends Lista {

    public ListaOrdenada() {
        super();
    }

    public void insertarMedio(Nodo p, Nodo ant, Nodo x) {
        x.setPs(p);
        ant.setPs(x);
    }

    public void insertarFin(Nodo ant, Nodo p, Nodo x) {
        if (p == null) {
            x.setPs(null);
            ant.setPs(x);
        }
    }

    public void insertar(Empleado entrada) {
        Nodo p = inicio();
        Nodo ant = null;
        int b = 0;

        while (p != null && b == 0) {
            if (p.getDato().getDni() > entrada.getDni() ){
                b = 1;
            } else {
                ant = p;
                p = p.getPs();
            }
        }
        Nodo x = new Nodo(entrada);
        if (b == 1) {
            if (p == list) {
                insertarPri(entrada);
            } else {
                insertarMedio(p, ant, x);
            }
        } else {
            if (ant == null) {
                list = x;
            } else {
                insertarFin(ant, p, x);
            }
        }
    }

    
    
    /**METODO ELIMINAR */
    
    public Nodo eliminar(int elem) {
        Nodo x = null;
        Nodo p = inicio();
        Nodo ant = null;
        if (listaVacia()) {
            prt("Lista Vacía!!!");
            return x;
        }
        boolean band = false;
        while (p != null && !band) {
            if (p.getDato().getDni() >= elem) {
                if (p.getDato().getDni() == elem) {
                    x = quitar(p, ant);
                    band = true;
                } else {
                    p = p.getPs();
                }
            
            }
        }
        if (band == true) {

            prt("Elemento eliminado!");
        } else {
            prt("Elemento inexistente!!!");
        }
        return x;
    }
}
