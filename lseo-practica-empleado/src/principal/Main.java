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

import java.util.Scanner;
public class Main {

       Scanner ingreso = new Scanner(System.in);

    ListaOrdenada miLista;

    public Main() {
        miLista = new ListaOrdenada();
    }
    
    
    
    /*Generar una lista encadenada ordenada. La lista almacena la información personal de un 
grupo de empleados: nombre, apellido, dni, domicilio. Listar la lista obtenida. Desarrollar la 
rutina necesaria para insertar la información de un nuevo empleado.*/

    public void generar() {
        int dni = -1;
        String nombre;
        String apellido;
        String dom;
        while (dni != 0) {
            System.out.println("Ingrese DNI de empleado (0 p/cancelar): ");
            dni = ingreso.nextInt();
            if (dni != 0) {
                System.out.print("Ingrese nombre de empleado: ");
                nombre = ingreso.next();
                System.out.print("Ingrese apellido de empleado: ");
                apellido = ingreso.next();
                System.out.print("Ingrese domicilio de empleado: ");
                dom = ingreso.next();
                
                Empleado x = new Empleado(dni, nombre, apellido, dom);
                miLista.insertar(x);
            }
          
        }
    }
    
     public void imprimir() {
        Nodo p = miLista.inicio();
        System.out.println("LISTA DE EMPLEADOS: ");
        while (p != null) {
            System.out.println("DNI: "+p.getDato().getDni() + " ");
            System.out.println("NOMBRE: "+p.getDato().getNombre() + " ");
            System.out.println("APELLIDO: "+p.getDato().getApellido() + " ");
            System.out.println("DOMICILIO: "+p.getDato().getDom() + " ");
            System.out.println(" ");
            p = p.getPs();
        }
    }
    
     public boolean verificar() {
        if (miLista.listaVacia()) {
            System.out.println("Lista vacia");
            return false;
        }
        return true;
    }
     
    public void menu() {
        int opcion = 9;
        do {
            switch (opcion) {
                case 1:
                    generar();
                    break;
                case 2:
                    if (verificar()) {
                        imprimir();
                    }
                    break;
                case 3:
                    if (verificar()) {
                        generar();
                    }
                    break;

            }
            mostrarOpciones();
            opcion = ingreso.nextInt();
            System.out.println("--------->");

        } while (opcion != 0);
    }
    
    public void mostrarOpciones() {
        System.out.println("Manejo de listas simples enlazadas");
        System.out.println("1- Generar lista empleados");
        System.out.println("2- Imprimir lista");
        System.out.println("3- Ingresar nuevo empleado a la lista)");
        System.out.println("0- Salir");
        System.out.println("--------->");

    }
    
    public static void main(String[] args) {

        Main miListaApp = new Main();
        miListaApp.menu();

    }
    
    
    
    
    
    
}
