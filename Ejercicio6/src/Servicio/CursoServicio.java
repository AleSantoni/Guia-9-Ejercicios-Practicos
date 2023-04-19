
package Servicio;

import entidad.Curso;
import java.util.Arrays;

import java.util.Scanner;


public class CursoServicio {
    Scanner leer = new Scanner(System.in);
      
    /*
    Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando
en cada repetición que se ingrese el nombre de cada alumno.
    */
    public void cargarAlumnos(Curso c1){
        
       
           String[] alumnos = c1.getAlumnos();
        System.out.println("Digite el nombre del alumno ->");
        for (int i = 0; i  < c1.getAlumnos().length; i++) {
            System.out.print("Alumno " + (i+1) + ": ");
         alumnos[i]= leer.next();
             
        }
        c1.setAlumnos(alumnos);
        
        
        
       
    }
    /*
    Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le 
asignan a sus respectivos atributos para llenar el objeto Curso. 
En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
    */
    public void crearCurso(Curso c1, CursoServicio cs){
        System.out.println("Digite el nombre del curso ->");
        c1.setNombreCurso(leer.nextLine());
        System.out.println("Digitr las cantidad de horas por dia que se dica el curso->");
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Digite las cantidad de dias de la semana que se dicata el curso ->");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        boolean bandera= true;
        do {
              System.out.println("Digite cual es el Turno (M para Mañana /T para Tarde) ->");
        c1.setTurno(leer.next().toLowerCase());
        if(c1.getTurno().equalsIgnoreCase("T")|| c1.getTurno().equalsIgnoreCase("M")){
            bandera =false;
            
        } else{
            System.out.println("Caracter ingresado incorrecto digite nuevamente la opcion ");
        }
        
        }while (bandera);
        System.out.println("Digite el precio por hora ->");
        c1.setPrecioPorHora(leer.nextDouble());
        cs.cargarAlumnos(c1);
        
    }
    /*
    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad 
de alumnos y la cantidad de días a la semana que se repite el encuentro.
    */
    public void calcularGananciaSemanal(Curso c1){
        
        double gananciaSemanal=(((c1.getCantidadHorasPorDia()*c1.getPrecioPorHora())*c1.getCantidadDiasPorSemana())*c1.getAlumnos().length);
        
        System.out.println("La ganancia semanal por el dictado del curso es  $ : "+gananciaSemanal );
        System.out.println("La lista de alumos que asisten al curso es ");
        System.out.println(Arrays.toString(c1.getAlumnos()));


        
        
    }

}


