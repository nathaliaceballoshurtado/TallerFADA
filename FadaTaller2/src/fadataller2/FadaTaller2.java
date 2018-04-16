/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadataller2;

import java.util.Arrays;

/**
 *
 * @author Nathalia
 */
public class FadaTaller2 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = retornaArreglo();
     //   int[] arregloFrecuencias = 
        int j = arreglo.length-1;
        arreglo = modaDivEnce(arreglo, 0, j);
        
       
        
}
 
 static int[] retornaArreglo(){
      int numero = 8; //Tamaño del arreglo
        
        int[] arregloN = new int[numero];
        
        
            for(int i=0;i<numero;i++){
            int numeroLlenado = (int) (Math.random() * 10) + 1; //Se crean números aleatorios del 1 al 10
            arregloN[i]=numeroLlenado;  
            }
       
        System.out.println("Se imprimiran " + numero + " números");
        System.out.println("Los números que se sacaran la moda son: ");

        
        for(int i=0;i<numero;i++){
            System.out.print("| "+ arregloN[i] + "| ");
        }
        System.out.println("");
        return arregloN;
     
 }
    
    public static int[] modaDivEnce(int[] A, int p, int r){
          if (p < r){
            int q = (p+r)/2;
            
            modaDivEnce(A, p, q);
            modaDivEnce(A,q+1,r);
            frecuencia(A,p,q,r);
      
        return A;
        }
          return A;
    }
    
      static void frecuencia(int[] A, int p, int q, int r){
        int primerArreglo[] = new int[(q-p+1)];
        System.out.println("p " + p + "q " + q);
     
        int count = 0;
        for(int i = p; i<=q; i++){
            primerArreglo[count] = A[i];
            count++;
        }
        int pivote = primerArreglo[0];
        int frecuencia =0;
        System.out.println("número " + pivote);
        for(int i=0;i<primerArreglo.length-1;i++){
            if(pivote == primerArreglo[i]){
                 frecuencia+=1;
            }
        }
         System.out.println("frecuencia " + frecuencia);
    }

}