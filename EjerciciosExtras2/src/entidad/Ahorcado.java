
package entidad;
/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, 
un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas 
que puede realizar el usuario. Definir los siguientes métodos en AhorcadoService:

*/

public class Ahorcado {
    
    private char[]  palabra;
    private int canLetraEncont;
    private int canJugMax;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int canLetraEncont, int canJugMax) {
        this.palabra = palabra;
        this.canLetraEncont = canLetraEncont;
        this.canJugMax = canJugMax;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public void setCanLetraEncont(int canLetraEncont) {
        this.canLetraEncont = canLetraEncont;
    }

    public void setCanJugMax(int canJugMax) {
        this.canJugMax = canJugMax;
    }

  

    public char[] getPalabra() {
        return palabra;
    }

    public int getCanLetraEncont() {
        return canLetraEncont;
    }

    public int getCanJugMax() {
        return canJugMax;
    }
    
    
    
}
