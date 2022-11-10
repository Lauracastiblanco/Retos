package Reticos;

import java.util.Scanner;

public class Reto_uno {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double F, C; 
        System.out.println("Ingresa la cantidad de grados Fahrenheit a convertir: ");
        F =  lector.nextDouble();

        C = (F - 32)/1.8;
        System.out.println( F + " grados Fahrenheit equivalen a " + C + " grados Centigrados");
        lector.close();
    }
}
