/*
 * Programa que guarda en un arrailist los empleados y aumenta el sueldo base.
 * 
 * 
 */
package Empresa;

/**
 *
 * @author José Giménez
 */
public class Empresa {
    
    private final int sueldo=1000;
    
    Empleados su = new Empleados(); // declaro 'su' para llamar al metodo 'aumento' de la clase Empleado
    
    Empleados ListaEmpleados[]=new Empleados[10];
    
    public void AnadirEmpleados(){
        ListaEmpleados[0]= new Empleados("Pedro",su.aumento(sueldo, 100));
        ListaEmpleados[1]= new Empleados("Susana",su.aumento(sueldo, 200));
        ListaEmpleados[2]= new Empleados("Amparo",su.aumento(sueldo, 300));
        ListaEmpleados[3]= new Empleados("Jose",su.aumento(sueldo, 400));
        ListaEmpleados[4]= new Empleados("Hector",su.aumento(sueldo, 500));
        ListaEmpleados[5]= new Empleados("Marc",su.aumento(sueldo, 600));
        ListaEmpleados[6]= new Empleados("Cristian",su.aumento(sueldo, 700));
        ListaEmpleados[7]= new Empleados("Guille",su.aumento(sueldo, 800));
        ListaEmpleados[8]= new Empleados("Antonio",su.aumento(sueldo, 900));
        ListaEmpleados[9]= new Empleados("Nacho",su.aumento(sueldo, 1000));
    }
    
    public void printar(){
        
        for(Empleados e: ListaEmpleados){
            
            System.out.println("Nombre Empleado: "+e.getNombre()+" Sueldo: "+e.getAumento());
        }
    }
    
}
