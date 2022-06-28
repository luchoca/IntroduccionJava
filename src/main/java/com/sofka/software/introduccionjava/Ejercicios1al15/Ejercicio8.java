package com.sofka.software.introduccionjava.Ejercicios1al15;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner caputre = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana, ejemplo `Lunes`:");
        String Dia = caputre.nextLine();
        switch(Dia){
            case "Lunes":
                System.out.println("HOY SE TRABAJA");
            break;
            case "Martes":
                System.out.println("HOY SE TRABAJA");
                break;
            case "Miercoles":
                System.out.println("HOY SE TRABAJA");
                break;
            case "Jueves":
                System.out.println("HOY SE TRABAJA");
                break;
            case "Viernes":
                System.out.println("HOY SE TRABAJA");
                break;
            case "Sabado":
                System.out.println(" HOY DESCANSO");
                break;
            case "Domingo":
                System.out.println(" HOY DESCANSO");
                break;
            default:
                System.out.println("Eso no es un dia de la semana");

        }
    }
}