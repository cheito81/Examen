/*
 * recoge una letra y crea la palabra a acertar
 */
package examen;

import java.util.Random;

/**
 *
 * @author José Giménez
 */
public class adivina {
    
    private String paraula = null;
    private char c;

    public adivina(char c) {
        this.c = c;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }
    
public void iniciaPalabra(){

         String[] paraules={"ATOM","MOLECULA","BIO", "PERL"};
    
         //se usa la clase random para asignar un int y asi escojer una palabra entre el array de paraules
            Random rnd = new Random();
            int endevina=(int)(rnd.nextDouble()*paraules.length);
            
          
          paraula=paraules[endevina];
               System.out.println("La paraula que has d'encertar té "+paraula.length()+" lletres");
}

public void adivinaPalabra(){
    
     String resposta, llegit="";
    boolean valid;
    int count = 0, encerts = 0, pos;
        boolean salir = false;
    
        
   
              pos = paraula.indexOf(c);
              
              //COMENTARI VOSTRE
              if (pos == -1) {
                   count++;
                   System.out.println("Aquesta lletra no es troba dins de la paraula. Ara et queden "+ (10-count)+ " intents");
                  
                   if(count == 10) System.out.println("Has esgotat tots els intents");
               } else {
                        
                         char lletres[]=new char[paraula.length()]; 
                       for(int i=0;i<lletres.length;i++){
                           if(paraula.charAt(i) == c){
                               
                               lletres[i] =c;
                              
                               encerts +=1;
                           }
                           System.out.print(lletres[i]+" ");
                           
                       }
                  System.out.println("Molt bé!!! Torna a intentar-ho");
                  
                  if(encerts == paraula.length()){
                      System.out.println("Has acabat encertant la paraula. Felicitats!!!!");
                      count =10;
                  }

               }

}

    public adivina() {
    }
}