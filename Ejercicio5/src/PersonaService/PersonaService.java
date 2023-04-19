/*
Crear una clase PersonaService, 
en el paquete servicio, con los siguientes métodos:

Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y 
la fecha actual.

Método mostrarPersona que muestra la información de la persona deseada.
*/
package PersonaService;


import entidad.Persona;
import java.util.Date;
import java.util.Scanner;


public class PersonaService {

    Scanner leer = new Scanner(System.in);
/*
    Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
Retornar el objeto Persona creado.
    */
    public Persona crearPersona() {
        System.out.println("Digite el nombre de la persona ");
        String nombre = leer.next();
        System.out.println("Digite la fecha de nacimiento dia, mes añio ");
        int dia = leer.nextInt();
        int mes = leer.nextInt() - 1;
        int anio = leer.nextInt() - 1900;
        Date fecha = new Date(anio, mes, dia);
        Persona persona=new Persona(nombre, fecha);

        return persona;

    }

    /* • Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
     */
    public int calcularEdad(Persona persona) {
        Date fechaactual = new Date();// creo la fecha acual
        long diferencia = fechaactual.getTime() - persona.getFechaDeNacimiento().getTime();
        long dias = diferencia / 86400000; // Conversión a días
        int anios = (int) dias / 365;// conversion a años
        
        return  anios;

    }

    /*
    •Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad 
consultada o false en caso contrario.
     */
    public boolean menorQue(Persona persona, int años) {
        PersonaService ps =new PersonaService();

        int anios1=ps.calcularEdad(persona);
        return anios1<años;
        

    }
    //• Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.

    public void mostrarPersona(Persona persona) {

        System.out.println("Nombre " + persona.getNombre() + " Fecha de nacimiento " + persona.getFechaDeNacimiento());
    }

}
