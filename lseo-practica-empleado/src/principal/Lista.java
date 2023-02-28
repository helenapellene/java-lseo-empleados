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
public class Lista {

    protected Nodo list;

//	************************************* CONSTRUCTOR ******************************************************
    public Lista() {
        list = null;
    }

//	***************************************** INICIO *******************************************************
    public Nodo inicio() {
        return list;
    }

//	***************************************** INICIO *******************************************************
    public boolean listaVacia() {
        return (list == null);
    }

//	********************************** INSERTAR AL PRINCIPIO ***********************************************
    public void insertarPri(Empleado elem) {
        Nodo x = new Nodo(elem);
        if (list == null) {
            list = x;
        } else {
            x.setPs(list);
            list = x;
        }
    }

    public void prt(String s) {
        System.out.println(s);
    }

//	******************************************** QUITAR ****************************************************
    public Nodo quitar(Nodo p, Nodo ant) {
        Nodo x = p;

        if (p == list) {
            list = p.getPs();
        } else {
            ant.setPs(p.getPs());

        }
        return x;
    }

    public Nodo eliminar(Empleado elem) {
        Nodo x = null;
        Nodo p = list;
        Nodo ant = null;
        if(list == null)
            return x;
        boolean band = false;
        while (p != null && !band) {
            if (p.getDato() == elem) {
                band = true;
            } else {
                ant = p;
                p = p.getPs();

            }
        }
        if (band == true) {
            quitar(p, ant);
            x = p;
        }
        return x;
    }

    public void visualizar() {
        Nodo p = inicio();
        while (p != null) {
            prt(p.getDato() + "");
            p = p.getPs();
        }
    }

}