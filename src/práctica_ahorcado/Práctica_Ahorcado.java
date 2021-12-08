/*j
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica_ahorcado;

import java.util.Scanner;

/**
 *
 * @author juanh_hj7z1sj
 */
public class Práctica_Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Juego del ahorcado para 2 jugadores

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre del jugador 1: ");
        String cad = sc.nextLine();
        Jugador j1 = new Jugador(cad);

        System.out.println("Introduzca el nombre del jugador 2: ");
        String cad2 = sc.nextLine();
        Jugador j2 = new Jugador(cad2);
        
                                    
                              // AL MEJOR DE 4 PARTIDAS
                                    
        // Partida 1
        // j2 elige palabra a adivinar y j1 tiene que intentar adivinarla con 5 errores como maximo
        Jugar partida1 = new Jugar(j1, j2);
        partida1.empezarPartida();

        // Partida 2
        Jugar partida2 = new Jugar(j2, j1);
        partida2.empezarPartida();

        // Partida 3
        Jugar partida3 = new Jugar(j1, j2);
        partida3.empezarPartida();

        // Partida 4
        Jugar partida4 = new Jugar(j2, j1);
        partida4.empezarPartida();
        
        // Resultados y ganador de la partida
        if (j1.getVictorias() > j2.getVictorias()) {
            System.out.println("El jugador " + j1.getNombre() + " ha ganado con " + j1.getVictorias() + " victorias");

        } else if (j1.getVictorias() < j2.getVictorias()) {
            System.out.println("El jugador " + j2.getNombre() + " ha ganado con " + j2.getVictorias() + " victorias");

        }else{
            System.out.println("Ambos jugadores han empatado");
        }
    }
    
}
