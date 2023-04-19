/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclasearrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author BeluS
 */
public class EjercicioClaseArrays {

    /**Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand=new Random();
        double  [] A=new double[50];
        double [] B= new double[20];
        // lleno el primer arreglo con numeros del 0 al 100
        for (int i = 0; i < A.length; i++) {
            A[i]=  Math.round(rand.nextDouble() * 100.0) / 100.0; //solamente pone 2 decimales 
               
            }
         System.out.println("Arreglo A sin ordenar: " + Arrays.toString(A));
          // lleno el segundo arreglo con numeros del 0 al 100
          for (int i = 0; i < B.length; i++) {
              B[i]=Math.round(rand.nextDouble() * 100.0) / 100.0;
            
        }
          // ordeno el arreglo en forma acendente 
          
          Arrays.sort(A);
            // Copiar los primeros 10 elementos del arreglo A al arreglo B
            // usamos System.arraycopy(A, origen, B, destino, longitud);
        System.arraycopy(A, 0, B, 0, 10);
        
        // Rellenar los últimos 10 elementos del arreglo B con el valor 0.5
        Arrays.fill(B, 10, 20, 0.5);
        
        // Imprimir el arreglo A ordenado y el arreglo B combinado
        System.out.println("Arreglo A ordenado: " + Arrays.toString(A));
        System.out.println("Arreglo B combinado: " + Arrays.toString(B));
          
    }
    
}
