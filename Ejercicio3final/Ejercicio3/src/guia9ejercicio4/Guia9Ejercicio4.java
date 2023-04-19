
package guia9ejercicio4;

import Servicio.ArregloService;


public class Guia9Ejercicio4 {
/*
    Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
    */

    public static void main(String[] args) {
        double [] arregloA= new double[50];
        double [] arregloB=new double[20];
       
        ArregloService.inicializarA(arregloA);
       
        System.out.println("************");
        ArregloService.ordenarArreglo(arregloA);
         ArregloService.mostrar(arregloA);
           System.out.println("************");
        ArregloService.inicializaB(arregloA, arregloB);
        ArregloService.mostrar(arregloB);
        
        
    }
    
}
