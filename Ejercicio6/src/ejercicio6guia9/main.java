/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6guia9;

import Servicio.CursoServicio;
import entidad.Curso;


/**
 *
 * @author BeluS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CursoServicio cs= new CursoServicio();
       Curso c1= new Curso();
       cs.crearCurso(c1, cs);
       cs.calcularGananciaSemanal(c1);
 
        
      
        
      
            
        }
       
    }
    

