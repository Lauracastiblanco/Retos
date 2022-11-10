package Reticos.Salud;

import java.util.Scanner;

public class Persona {


    String tipoDoc, nombre, apellido, sexo;
    int documento, edad;
    double peso, estatura , imc;
    Scanner lector = new Scanner(System.in);
    public void  pedirDatos() {
    System.out.println("Ingresa el tipo de documento:");
    tipoDoc = lector.next();
    System.out.println("Ingresa el documento:");
    documento = lector.nextInt();
    System.out.println("Ingresa el nombre:");
    nombre = lector.next();
    System.out.println("Ingresa el apellido:");
    apellido = lector.next();
    System.out.println("Ingresa el peso en kg:");
    peso = lector.nextDouble();
    System.out.println("Ingresa la estatura(m):");
    estatura = lector.nextDouble();
    System.out.println("Ingresa la edad:");
    edad = lector.nextInt();
    System.out.println("Ingresa tu sexo:");
    sexo = lector.next();
    }
    public void  mostrarPersona() {
        System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " Tipo Documento: " + tipoDoc + " Documento: " + documento + "\n" + " edad " + edad + " Peso: " + peso + " Estatura: " + estatura + " Sexo: " + sexo);
    }
    public void  calcularImc() {

        imc = peso/(estatura)* 2; 
        if (imc<20){
            System.out.println("el peso está por debajo de lo ideal");
        }else if (imc >= 20 && imc <= 25){
            System.out.println("el peso es ideal");
        }else if(imc>25){
            System.out.println("Sobrepeso");
        }
    }   
    public void mayorEdad(){
        if (edad>= 18){
            System.out.println("Es mayor de edad");
        }else if (edad<18){
            System.out.println("Es menor de edad");
        }
    }
}
