
package arreglo;

import java.io.IOException;


public class PruebaArreglo {

  
    public static void main(String[] args) throws IOException {
       
 int [] enteros = new int[10];
 Arreglo.sumarLista(enteros);
    
 
 
 
 
 int [][] enterosBi = new int[10][10];
 
 Arreglo.buscarMayor(enterosBi);
 
 
 
 
 
 Arreglo.cuentaVocales();
 
 
 
 
 Arreglo.contarCaracteres("Este es un ejemplo típico que se plantea para trabajar con cadenas de caracteres y hacer uso de los métodos de la clase String de Java.",'e');
 
    }

   
    
    
    
}
