/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematicaserver;

import Matematica.entidad.Matematica;
import java.util.Scanner;

/**. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:

20

• 
 *
 * @author BeluS
 */
public class MatServer {
    
    Scanner leer =new Scanner (System.in);
    
    public static  Matematica crearNumeros(){
       int num1 = (int) (Math.random() * 10);
       
       int num2= (int) (Math.random() * 10);
      
               return   new Matematica(num1,num2);
    }
    
    /*
    • Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
    */
    public void devolverMayor(Matematica operacion){
        
     
        System.out.println("El mayor numero es " + Math.max(operacion.getNum1(), operacion.getNum2()));
        
         
        
    }
    /*
    • Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
    */
    public void calcularPotencia(Matematica operacion){
    double mayor = Math.max(operacion.getNum1(), operacion.getNum2());
        double menor = Math.min(operacion.getNum1(), operacion.getNum2());
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        System.out.println("La potencia del mayor valor de la clase es : " +Math.pow(mayor, menor));
    }
    
  /*Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.  
*/
    public void calculaRaiz(Matematica operacion){
          
        double menor = Math.min(operacion.getNum1(), operacion.getNum2());
        
        menor = Math.abs(menor);
        System.out.println("La raiz cuadrada del menor de los dos valores es : "+Math.sqrt(menor));
       
        
    }
}
