
package Servicio;

import java.util.Date;
import java.util.Scanner;


public class DateServicio {
    //Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
    // Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
    public Date fechaNacimiento(){
          Scanner leer =new Scanner (System.in);
        System.out.println("Digite el dia, mes , año del nacimiento ");
        int dia=leer.nextInt();
        int mes=leer.nextInt();
        int anio=leer.nextInt();
       Date fechaNacimiento = new Date(anio-1900, mes-1,dia);
        return  fechaNacimiento;
      
       
    }
    /*
    Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. 
* Ejemplo: 
El método debe retornar el objeto Date.
*/     
public Date fechaActual() {
    Date fechaActual = new  Date();
        return fechaActual;
        
        
}
//Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
    
public void diferencia(Date FechaActual, Date FechaNacimiento) {
        long diferencia = FechaNacimiento.getTime() -FechaActual.getTime() ;
    
        long dias = diferencia/86400000;// conversion a dias 
        int anios=  (int) dias   / 365;       // aconversion a años
        System.out.println("Los años de la Persona es :" + anios);
    }

     
     
     
}
