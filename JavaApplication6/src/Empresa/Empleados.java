/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author José Giménez
 */
public class Empleados {
    
    private String nombre;
    private double  aumento;
    
    public Empleados(String nombre, double aumento) {
        this.nombre = nombre;
        this.aumento= aumento;
    }

    Empleados() {
        
    }
    /**
     * Metodo para sumar el sueldo base mas el aumento.
     * @param sueldo le paso el sueldo base de la clase Empresa.
     * @param aumento le paso el aumento de sueldo.
     * @return retorna el sueldo fijo mas el aumento
     */
    public double aumento(double sueldo,double aumento){
        this.aumento=sueldo+aumento;
        return aumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    
   
}
