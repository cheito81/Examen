/*
 * El juego del ahorcado
 */
package examen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author José Giménez
 */
public class Examen {

    
    public static void main(String[] args) {
        // TODO code application logic here
        paraula();
    }
    /**
     * pide al usuario una letra
     */
    public static void paraula() {
         Scanner lector = new Scanner (System.in);
         
        String llegit="";
        String resposta;
        char c;
        boolean valid = false;  
        adivina in = new adivina();
         in.iniciaPalabra();
        do{
       
        
                
                /**Pide al usuario una letra la convierte a mayusculas y compara 
                  *si es una letra valida
                  */
              do{
                System.out.println ("Si us plau, Escriu una lletra valida");
             llegit = lector.nextLine().toUpperCase();
                if(llegit.matches("[ABCDEFGHIJKLMNÑOPQRSTUVWXYZ ]")) valid=true;
              }while(valid == false || llegit.isEmpty() || llegit==null);
              
              //guarda la letra llegit en c crea un objeto la clase adivina y le pasa c
              c=llegit.toUpperCase().charAt(0);
              adivina ad = new adivina(c);
             
              ad.adivinaPalabra();
        
        System.out.println("Vols continuar?(S/N)");
           resposta = lector.nextLine().toUpperCase();
       }while(resposta.equals("S"));
    
   } 
 }
 

