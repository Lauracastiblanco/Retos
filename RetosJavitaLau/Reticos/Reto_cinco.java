package Reticos;

import java.util.Scanner;

public class Reto_cinco {
    public static void main(String[] args) {
        int n;
        double precio;
        double contador = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuantos productos desea comprar?");
        n = lector.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println("Ingresa el precio del producto " + i);
            precio = lector.nextDouble(); 
            contador = contador + precio;
        }
        System.out.println("El total de sus productos es: " + contador);
        lector.close();
    }
}
