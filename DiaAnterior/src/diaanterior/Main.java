/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diaanterior;

import java.util.*;


/**
 *
 * @author alumne
 */
public class Main {
   
     public static void main(String[] args) {
         
        DiaAnterior fe = new DiaAnterior(2, 1, 2000);// los meses empiezan desde 0,Enero=0; 
        fe.restarDia();
        
         String fecha = fe.fechaAyer();
         System.out.println(fecha);
    }
}
