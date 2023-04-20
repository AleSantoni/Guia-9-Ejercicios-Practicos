/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Mes;
import java.util.Scanner;

/*
 A continuación, declara una variable mesSecreto de tipo String, 
y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario 
que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a 
intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 
 */
public class MesService {

    Scanner leer = new Scanner(System.in);

    // crear el objeto 
    public Mes eleigirMes() {
        Mes m1 = new Mes();
        String mesSecreto = m1.getMeses()[9];
        m1.setMesSecreto(mesSecreto);
        
        return m1;
    }
    
    public void adivinarMes(Mes m1) {
       
        int intentos=3;
        System.out.println("Adivine el mes secreto. Digite un mes en minusculas");
        do {
           
            String mesIngresado = leer.next();
            if (mesIngresado.equals(m1.getMesSecreto())) {
                System.out.println("Felicitaciones ADIVINASTE MES SECRETO");
                break;

            }else{
                intentos--;
                
                if(intentos==0){
                    System.out.println("Se acabaron los intentos GAME OVER");
                    break;
                }
                
                System.out.println("NO HA ACERTADO. Intente adivinarlo introduciendo otro mes:");
              
            }

        } while (intentos!=0);

    }
}
