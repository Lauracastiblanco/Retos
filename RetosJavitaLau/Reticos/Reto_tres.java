package Reticos;

import java.util.Random;
import java.util.Scanner;

public class Reto_tres {
    public static void main(String[] args) {
        
        Random rand = new Random(); 
        Scanner lector = new Scanner(System.in);
        int nrand = Math.abs(rand.nextInt(2));
        // System.out.println("el numero random es: " + nrand);
        System.out.println("Ingresa 0 si es Cara o 1 si es Sello");
        int num = lector.nextInt();
    
        if (nrand == 0 && num == 0)
        {
            System.out.println("Ganaste");
        }else if(nrand == 1 && num == 1)
        {
            System.out.println("Ganaste");
        }
        else {
            System.out.println("Perdiste");
        }
        lector.close();
    }
}
