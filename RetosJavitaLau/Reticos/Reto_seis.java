package Reticos;

import java.util.Random;
import java.util.Scanner;

public class Reto_seis {
    public static void main(String[] args) {

        double apostar, contador = 0;
        int eleccion , jugar , seguirjugando; 
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenido al juego carisellazo");
        System.out.println("Elige 1 para Iniciar y 2 para salir");
        jugar = lector.nextInt();
        switch (jugar) {
            case 1:
            System.out.println("-------Comenzamos el juego-----------");
            do {

                System.out.println("Por favor digite cuanto va a apostar");
                apostar = lector.nextDouble(); 
                Random rand = new Random();
                int aleatorio = Math.abs(rand.nextInt(2)+1);
                System.out.println("La maquina eligio "+ aleatorio);
                System.out.println("Elija  1 para Sello y 2 para Cara");
                eleccion = lector.nextInt();
                
                
                    if (eleccion==1  && aleatorio==1)
                    {
                        System.out.println("Ganaste");
                        contador = contador +(apostar*2);
                        System.out.println("Usted ha ganado " + contador);

                    }else if (eleccion==2 && aleatorio==2){
                        System.out.println("Ganaste");
                        contador = contador +(apostar*2);
                        System.out.println("Usted ha ganado " + contador);
                    }else {
                        System.out.println("Perdiste:(");
                        contador = contador - apostar;
                        System.out.println("Usted ha pedido "+ contador);
                    }

                System.out.println("¿Desea seguir apostando? Digite 1 para continuar y 2 para salir");
                seguirjugando = lector.nextInt();
                
            }while(seguirjugando==1);
            break;
            case 2: 
            System.out.println("Saliendo del juego");
            break;
            default:
            System.out.println("elige un numero correcto");
                break;
        }
        lector.close();
}
}
