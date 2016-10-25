/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diaanterior;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;



/**
 *
 * @author José Giménez
 */
public class DiaAnterior {
    
   private String convertido;
   private int mes;
   private int dia;
   private int año;
   
   private GregorianCalendar hoy = new GregorianCalendar();
   
    public DiaAnterior(int dia, int mes, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }
    
    /**
     * 
     * descripcion recoje fecha introducida y resta un dia a dicha fecha
     */
    
    public void restarDia(){
        
         hoy.set(año, mes, dia);
         hoy.add(Calendar.DAY_OF_MONTH,-1);
    }
    /**
     * 
     * description cambia formato de fecha  y devuelve la fecha del dia anterior
     * @param  fecha  objeto para dar formato deseado 
     * @return String 
     */
    public String fechaAyer(){
        
             DateFormat fecha = new SimpleDateFormat("dd/M/yyyy");
            convertido = fecha.format(hoy.getTime());
            return convertido;     
    }
}
