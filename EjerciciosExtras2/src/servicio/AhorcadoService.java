
package servicio;


import entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;




public class AhorcadoService {
    Scanner leer =new Scanner(System.in).useDelimiter("\n");
    /*
    • Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas
    
    */

    public void crearJuego() {
        Ahorcado ah = new Ahorcado();
        System.out.println("Digite la palabra a adivinar ->");
        String palabraBuscada = leer.next().toLowerCase();
        System.out.print("Ingrese la cantidad de jugada maxima :  ");
        do {

            if (leer.hasNextInt()) {// verifica si un numero ingresado es un numero entero
                ah.setCanJugMax(leer.nextInt());

                break;
            } else {
                System.out.println("El valor ingresado no es un numero . Intente de nuevo.");
                leer.next(); // Descartar el valor ingresado que no es numérico
            }
        } while (true);

        char[] vector = new char[palabraBuscada.length()];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = palabraBuscada.charAt(i);
        }

        ah.setPalabra(vector);
        longitud(ah);

        boolean palabraEncontrada;
        boolean intentosFinal;
        do {
            System.out.println("Ingrese la letra a buscar");
            char letra = leer.next().charAt(0);
            encontrada(letra, ah);
            System.out.println("********************************************************");
            intentosFinal = ah.getCanJugMax() > 0;
            palabraEncontrada = ah.getCanLetraEncont() == ah.getPalabra().length;
            if (palabraEncontrada) {
                System.out.println("   GANASTE ADIVINASTE LA PALABRA ");
                System.out.println("La palabra es : ");
                System.out.println(Arrays.toString(ah.getPalabra()));
                break;
            } else if (!intentosFinal) {
                System.out.println("GAME OVER HAS PERDIDO ");
                break;
            }
        } while (true);

        
        
        
    }
    
    /*
        • Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
    
    */
    public void longitud(Ahorcado ah){
        System.out.println("La longitud  de la palabra a buscar es  : " +ah.getPalabra().length);
        
    }
    /*
    • Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    */
    
    public boolean buscar(char letra, Ahorcado ah){
        
        boolean letraEncontrada = false;
        char[] palabra = ah.getPalabra();
        for (int i = 0; i <ah.getPalabra().length; i++) {
            if (letra == palabra[i]) {
                letraEncontrada = true;
                break;
            }
        }
        if (letraEncontrada) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra NO pertenece a la palabra");
        }
        return letraEncontrada;
    } 
    /*
     Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
    */
    
    public boolean encontrada( char letra, Ahorcado ah){
      boolean letraEncontrada = buscar(letra, ah);
        char[] palabra =ah.getPalabra();
        
       

        if (letraEncontrada) {
            for (int i = 0; i < ah.getPalabra().length; i++) {
                if (letra == palabra[i]) {
                
                   ah.setCanLetraEncont(ah.getCanLetraEncont()+1);
                    letraEncontrada = true;
                  
                }
            }
        } else {
           ah.setCanJugMax(ah.getCanJugMax()-1);
            intentos(ah);
        }
        int faltantes = ah.getPalabra().length - ah.getCanLetraEncont();
        System.out.println(" Encontradas  "+ah.getCanLetraEncont()+ "  Faltan " + faltantes );

        return letraEncontrada;
    }
         /*
    • Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    */
    
    public void intentos(Ahorcado ah) {
        System.out.println("Te quedan " + ah.getCanJugMax() + "  cantidad de intentos");
    }
 /*
    • Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main
    */
    
public void juego(){
    crearJuego();
}
   
        
    }
 

   
        
        
        
