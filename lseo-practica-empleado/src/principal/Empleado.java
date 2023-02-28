/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
Generar una lista encadenada ordenada. La lista almacena la información personal de un 
grupo de empleados: nombre, apellido, dni, domicilio. Listar la lista obtenida. Desarrollar la 
rutina necesaria para insertar la información de un nuevo empleado.
*/
package principal;

/**
 *
 * @author Helena
 */
public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private String dom;

    public Empleado(int dni, String nombre, String apellido,String dom) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dom = dom;
    }
    
    public Empleado(){
        dni=0;
        nombre="";
        apellido="";
        dom="";
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

  
    
    
    
    
    
    
}
    