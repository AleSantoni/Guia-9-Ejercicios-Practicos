/*
     Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
.





 */
package Servicio;


import java.util.Random;




public class ArregloService {
   
    //Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios
    
    
   public static void inicializarA(double[] arregloA) {
    Random random = new Random();
    for (int i = 0; i < arregloA.length; i++) {
        arregloA[i] = random.nextDouble() * 100;
    }
   }
    
    //Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    
    public static void mostrar(double[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[ " + arreglo[i] + " ]");
            
        }

    }
    
    // Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    
    public static void ordenarArreglo(double[] arreglo){
  
        
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length-i-1; j++) {
                if (arreglo[j]<arreglo[j+1]) {
                    double aux=arreglo[j+1];
                    arreglo[j+1]=arreglo[j];
              arreglo[j]=aux;
                    
                    
                }
                
            }
            
        }
    
    }
 /*
    Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
    Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    */   
    
    public static void inicializaB(double []  arregloA, double[] arregloB){
        for (int i = 0; i < 10; i++) {
            arregloB[i]=arregloA[i];
            
        }
        for (int i = 10; i < 20; i++) {
            arregloB[i]=0.5;
        }
        
    }
    
    
    
}
