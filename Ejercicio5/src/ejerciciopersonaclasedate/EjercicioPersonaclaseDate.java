
package ejerciciopersonaclasedate;

import PersonaService.PersonaService;
import entidad.Persona;
import java.util.Scanner;



public class EjercicioPersonaclaseDate {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();
        ps.calcularEdad(p1);
        System.out.println("Digite los años  a comparar ");
        int anio=leer.nextInt();
        System.out.println("Los años de la persona1 es menor que los años ingresados ? "+ps.menorQue(p1, anio));

        ps.mostrarPersona(p1);

    }

}
