/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia9;

import Servicio.StringServer;
import entidad.Cadena;

/**
 *
 * @author BeluS
 */
public class Ejercicio1guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      StringServer ss=new StringServer();
      Cadena frase=ss.crearFrase();
      ss.mostrarVocales(frase);
     ss.invertirFrase(frase);
      ss.vecesRepetido(frase);
      ss.comparaLongitud(frase);
      ss.unirFrase(frase);
      ss.remplazarLetra(frase);
       System.out.println(ss.contieneLetra(frase));
  
    }
    
}
