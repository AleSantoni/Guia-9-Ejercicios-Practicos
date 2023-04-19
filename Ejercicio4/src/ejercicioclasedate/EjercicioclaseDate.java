
package ejercicioclasedate;

import Servicio.DateServicio;
import java.util.Date;


/**
 *
 * @author BeluS
 */
public class EjercicioclaseDate {

    

    public static void main(String[] args) {
      
      
            DateServicio fechaServicio = new DateServicio();
    
    Date fechaNacimiento = fechaServicio.fechaNacimiento();
    Date fechaActual = fechaServicio.fechaActual();
    
   fechaServicio.diferencia(fechaNacimiento, fechaActual);
   
       
    }
    
}
