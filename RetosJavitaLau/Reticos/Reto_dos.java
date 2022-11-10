package Reticos;

import java.util.Scanner;

public class Reto_dos {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double P, M, dosisvacuna;
        System.out.println("Ingresa el peso del bebé: ");
        P = lector.nextDouble();
        System.out.println("Ingresa la edad del bebé: ");
        M =  lector.nextDouble();

        dosisvacuna = (P + 10) / M * 10 * 8;
        System.out.println( "La dosis de la vacuna que se le debe aplicar al bebé es: " + dosisvacuna);
        lector.close();
    }
}
