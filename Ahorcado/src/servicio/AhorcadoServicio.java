package servicio;
import entidad.Ahorcado;

import java.util.Arrays;
import java.util.Scanner;
/*
 Definir los siguientes métodos en AhorcadoService:







 */


/*
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector.
Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.

 */
public class AhorcadoServicio {
    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {
        Ahorcado ahorcado = new Ahorcado();
        System.out.println("Ingrese la palabra que desea adivinar");
        String palabra = leer.nextLine().toLowerCase();
        ahorcado.setPalabra(new char[palabra.length()]);//creo el vector para poder pasarle la palabra ingresada por el usuario
        for (int i = 0; i < palabra.length(); i++) {
            ahorcado.getPalabra()[i] = palabra.charAt(i);
        }
        System.out.println("Ingrese la cantidad de intentos");
        ahorcado.setCantidadMaxima(leer.nextInt());

        return ahorcado;
    }

    /*
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
     */
    public int longitud(Ahorcado ahorcado) {
        System.out.println("La palabra tiene " + ahorcado.getPalabra().length + " letras");
        return ahorcado.getPalabra().length;
    }

    /*
    Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada
    es parte de la palabra o no. También informará si la letra estaba o no.
     */

    public boolean buscar(Ahorcado ahorcado, char letra) {
        boolean encontrado = false;


        for (int i = 0; i < ahorcado.getPalabra().length; i++) {// busco dentro del vector si esta la letra
            if (ahorcado.getPalabra()[i] == letra) {
                encontrado = true;
            }
        }



        return encontrado;


    }

    /*
    Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido
     encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y
     false si la letra no estaba, ya que, cada vez que se busque una letra que no esté,
      se le restará uno a sus oportunidades.
     */
    public boolean encontradas(Ahorcado ahorcado, char letra, boolean encontrado, int longitud) {

        int cont=0;
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {// busco dentro del vector si esta la letra
            if (ahorcado.getPalabra()[i] == letra)// con el condicional lo compruebo
                cont++; //agrego un contador por la dudas que existan mas de una letra en la palabra

        }
        if (encontrado) {

            System.out.println("La letra " + letra + " esta en la palabra y se encontro " + cont + " veces");
            ahorcado.setLetrasEncontrada(ahorcado.getLetrasEncontrada() + cont);
            System.out.println(" encontradas:" + ahorcado.getLetrasEncontrada() );
            System.out.println(" faltan : " + (longitud - ahorcado.getLetrasEncontrada()));

            return true;

        }else{
            System.out.println("La letra no se encontro en la palabra ");
            ahorcado.setCantidadMaxima(ahorcado.getCantidadMaxima()-1);// resto un intento si no se encontro la letra en la plabra

            return false;
        }
    }

    /*
    Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
     */
    public void intentos(Ahorcado ahorcado) {
        System.out.println("Te quedan " + ahorcado.getCantidadMaxima() + " intentos");

        }

/*
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando
 el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
 */
    public void juego(Ahorcado ahorcado) {
        do {

                System.out.println("ingrese una letra");
                char letra = leer.next().toLowerCase().charAt(0);

                    boolean encontrado = buscar(ahorcado, letra);
                    encontradas(ahorcado, letra, encontrado, longitud(ahorcado));// le
                    intentos(ahorcado);
                    System.out.println("*****************************************************************");


                }
                while (ahorcado.getCantidadMaxima() != 0 && ahorcado.getPalabra().length != ahorcado.getLetrasEncontrada())
                    ;

                if (ahorcado.getPalabra().length == ahorcado.getLetrasEncontrada()) {
                    System.out.println("El juego termino usted ah ganado");
                    System.out.println("La palabra encontrada es : " + Arrays.toString(ahorcado.getPalabra()));

                } else {
                    System.out.println("Se terminaron los intentos Game over");
                }


            }
            }





