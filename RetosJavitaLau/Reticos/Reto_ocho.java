package Reticos;

import java.util.Scanner;

public class Reto_ocho {
    public static void main(String[] args) {
        
        int jugadores, minimo, ganador = 0; 
        Scanner lector = new Scanner(System.in); 

        System.out.println("¿Cuantos jugadores son?");
        jugadores = lector.nextInt(); 
        int [] tiempo = new int [jugadores];
        String [] nombres = new String[jugadores]; 
        for (int i = 0; i<jugadores; i++){
            System.out.println("Ingresa el nombre del jugador: ");
            nombres[i] = lector.next(); 
            System.out.println("Ingresa el tiempo de corredor en minutos: ");
            tiempo[i] = lector.nextInt();
        }
        
        for (int r = 0; r<nombres.length; r++){
            System.out.println("Nombre del jugador: " + nombres[r] + " | Tiempo: " + tiempo[r] + " minutos.");
        }
        minimo = tiempo[0];
        for (int j = 0; j<nombres.length; j++ ){
            if (tiempo[j]<minimo){
                minimo = tiempo[j];
            }
            if (tiempo[j] == minimo){
                ganador = j;
            }
        }
        System.out.println("El ganador es: " + nombres[ganador]  + " con: " + minimo + " minutos.");
        lector.close();
    }
}
