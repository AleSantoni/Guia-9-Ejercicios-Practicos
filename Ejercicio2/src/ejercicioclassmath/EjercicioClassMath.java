/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclassmath;

import Matematica.entidad.Matematica;
import Matematicaserver.MatServer;

/**
 *
 * @author BeluS
 */
public class EjercicioClassMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatServer ms=new MatServer();
        Matematica op1=ms.crearNumeros();
        System.out.println(op1.getNum1());
        System.out.println(op1.getNum2());
        ms.devolverMayor(op1);
        ms.calcularPotencia(op1);
        ms.calculaRaiz(op1);
    }
    
}
