
package ejercicioextra1guia9;

import Servicio.MesService;
import entidad.Mes;


public class EjercicioExtra1Guia9 {

  
    public static void main(String[] args) {
        MesService as=new MesService();
        Mes m1=as.eleigirMes();
        as.adivinarMes(m1);
    }
    
}
