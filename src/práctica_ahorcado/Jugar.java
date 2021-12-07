/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica_ahorcado;

import java.util.Scanner;
//import javax.swing.JPasswordField; 

/**
 *
 * @author juanh_hj7z1sj
 */
public class Jugar {
    private int intentos = 5;
    Jugador j1, j2;

    public Jugar(Jugador j1, Jugador j2) {

        this.j1 = j1;
        this.j2 = j2;
    }

    public void empezarPartida() {

        Scanner sc = new Scanner(System.in);
        System.out.println(j2.getNombre() + ", introduzca palabra a adivinar: ");
        String palabra_adivinar = sc.nextLine();
       // palabra_adivinar.replaceAll(palabra_adivinar,"*"); NO SE LLEGA A LEER
       
        
     
        boolean acertado = false;

        char[] guionesPalabra = new char[palabra_adivinar.length()];

        for (int i = 0; i < guionesPalabra.length; i++) {
            guionesPalabra[i] = '-';
        }

        //System.out.println(guionesPalabra);
        System.out.println("Jugador " + j1.getNombre() + " , intente adivinar la palabra");

        while (!acertado && intentos > 0) {

            for (int i = 0; i < guionesPalabra.length; i++) {

                System.out.print(guionesPalabra[i]);
            }

            System.out.println(" ");

            System.out.println("Introduzca una letra");
            char letra = sc.next().charAt(0);
            boolean encontrado = false;
            for (int i = 0; i < guionesPalabra.length; i++) {

                if (palabra_adivinar.charAt(i) == letra) {
                    guionesPalabra[i] = letra;
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("La palabra no contiene esa letra");
                intentos--;
                System.out.println("Te quedan " + intentos + " intentos");

            } else {

                boolean noGuiones = true;
                for (int i = 0; i < guionesPalabra.length; i++) {
                    if (guionesPalabra[i] == '-') {
                        noGuiones = false;
                    }
                }

                if (noGuiones) {
                    acertado = true;
                }
            }

        }

        if (acertado) {
            System.out.println("Acertaste la palabra");
            this.j1.setVictorias(this.j1.getVictorias() + 1);
            
        } else {           
            System.out.println("Has perdido la partida");
            System.out.println("La palabra secreta era: " + palabra_adivinar);

            this.j2.setVictorias(this.j2.getVictorias() + 1);
        }

    }
}
