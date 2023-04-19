/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce 
meses del año, en minúsculas. 

 */
public class Mes {
    private final String[] Meses={"enero", "febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto;

    public Mes() {
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return Meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    
}
