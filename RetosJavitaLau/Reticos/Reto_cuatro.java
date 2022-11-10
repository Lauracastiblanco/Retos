package Reticos;

import java.util.Random;
import java.util.Scanner;

public class Reto_cuatro {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Random numrand = new Random();
        int maquina = numrand.nextInt(3)+1;
        System.out.println("Elija el numero de su seleccion \n1.Piedra \n2.Papel \n3.Tijera ");
        int elige = lector.nextInt();
        switch (maquina)
        {
            case 1:
                System.out.println("La computadora habia escogido piedra");
                switch (elige)
                {
                   case 1: System.out.println("Empate!"); break;
                   case 2: System.out.println("Ganaste!"); break;
                   case 3: System.out.println("Perdiste:("); break;
                }
                break;
 
            case 2:
                System.out.println("La computadora habia escogido papel");
                switch (elige)
                {
                   case 1: System.out.println("Perdiste:("); break;
                   case 2: System.out.println("Empate!"); break;
                   case 3: System.out.println("Ganaste!"); break;
                }
                break;
 
            case 3:
                System.out.println("La computadora habia escogido Tijera");
                switch (elige)
                {
                   case 1: System.out.println("Ganaste!"); break;
                   case 2: System.out.println("Perdiste:("); break;
                   case 3: System.out.println("Empate!"); break;
                }
                break;
        }
        
        lector.close();
    }
}
