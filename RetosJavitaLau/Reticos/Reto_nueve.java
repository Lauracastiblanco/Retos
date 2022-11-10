package Reticos;

import java.util.Scanner;

public class Reto_nueve {
    public static void main(String[] args) {

        String [][] nomProd = new String[2][2];
        double [][] precioProd = new double[2][2];
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i <nomProd.length; i ++){
            for (int j= 0; j<nomProd.length; j++){
                System.out.println("Ingresa el nombre del producto en la posicion ["+i+"]["+j+"]:");
                nomProd [i][j] = lector.next(); 
                System.out.println("ingresa el pecio del producto ["+i+"]["+j+"]:");
                precioProd [i][j] = lector.nextDouble();
            }
        }
        for (int i = 0; i <nomProd.length; i ++){
            for (int j= 0; j<nomProd.length; j++){
                System.out.println("Posicion: ["+i+"]["+j+"]" + "Nombre: " + nomProd[i][j] + " Precio: " + precioProd[i][j]);
            }
        }
        System.err.println("");
    lector.close();
    }
}
