/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica_ahorcado;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

/**
 *
 * @author juanh_hj7z1sj
 */
public class Jugador {
   private String nombre;
    private int victorias;

    public Jugador(String n) {
        this.nombre = n;
        this.victorias = 0;
    }

    public int getVictorias() {
        return victorias;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
