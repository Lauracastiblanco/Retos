package Reticos;

import java.util.Scanner;

public class Reto_siete {
    public static void main(String[] args) {
        
        int cantidad;
        float suma = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuantas notas vas a ingresar?");
        cantidad = lector.nextInt();
        float [] notas = new float[cantidad];

        for (int i=0; i<cantidad; i++){
            System.out.print("Ingresa la nota numero " + (i+1) + ": ");
            notas [i] = lector.nextFloat();
            suma = suma + notas[i];
        }
        System.out.println("Las notas son: ");
        for (int i=0;i<cantidad; i++){
            System.out.print(notas[i] + ",");
        }
        System.out.println(" ");
        System.out.println("La suma de las notas es " + suma);
        float promedio = suma/notas.length;
        System.out.println("El promedio de las notas es: " + promedio);

        if (promedio<3.0){
            System.out.println("Reprobaste");
        }else if (promedio == 3.0 || promedio < 4.0){
            System.out.println("Pasaste raspando");
        }else if(promedio>4.0){
            System.out.println("Aprobaste con buenos resultados");
        }

    lector.close();
    }
}
