/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo;

/**
 *
 * @author Nathalia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Implementación insertion sort
        
       int numero = (int) (Math.random() * 20) + 1;
        
        System.out.println("Se imprimiran " + numero + " números");
        System.out.println("Los números que se ordenaran son: ");
        int[] arregloN = new int[numero];
        
        for(int i=0;i<numero;i++){
            int numeroLlenado = (int) (Math.random() * 20) + 1;
            arregloN[i]=numeroLlenado;
        }
        
        for(int i=0;i<numero;i++){
            System.out.print("| "+ arregloN[i] + "| ");
        }
       System.out.println(" ");
       System.out.println("Los números ordenados por insertion sort : ");
        
        //Implementación insertion sort
        for(int i=1;i<arregloN.length;i++){
            int itemp=i;
         for(int j=0;j<itemp;j++){
             if(arregloN[i]<arregloN[i-1]){
                 int ref=arregloN[i];
                 arregloN[i] = arregloN[i-1];
                 arregloN[i-1] = ref;
                 i--;
             }
         }
        }
        
        
        for(int i=0;i<arregloN.length;i++){
            System.out.print("| "+ arregloN[i] + "| ");}
        
        
        //Implementación selection sort
        
        int min = 0;
        int posn = 0;
       for(int i=0;i<arregloN.length;i++){
            min=arregloN[i];
            for(int j=i;j<arregloN.length;j++){
                if(arregloN[j]<=min){
                    min=arregloN[j];
                    posn=j;
                }
         }
           // System.out.println(min);
            arregloN[posn]=arregloN[i];
            arregloN[i]=min;
        }
       System.out.println(" ");
       System.out.println("Los números ordenados por selection sort : ");
      for(int i=0;i<arregloN.length;i++){
           System.out.print("| "+ arregloN[i] + "| ");}
        
    }
    
}
