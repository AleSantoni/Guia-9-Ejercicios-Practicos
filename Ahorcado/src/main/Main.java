package main;
import entidad.Ahorcado;
import servicio.AhorcadoServicio;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AhorcadoServicio as = new AhorcadoServicio();
        Ahorcado juego1 = as.crearJuego();
        as.juego(juego1);


}
}