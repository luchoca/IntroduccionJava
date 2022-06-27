package com.sofka.software.introduccionjava.Ejercicios1al15;

import java.util.Scanner;


public class Ejercicio2 {

//    int NumeroConsola1 = 1;
//    int NumeroConsola2 = 2;

    public static void main (String [] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Escribe un Numero");
        int NumeroConsola1 = reader.nextInt();
        System.out.println("Escribe otro Numero");
        int NumeroConsola2 = reader.nextInt();

        if(NumeroConsola1 > NumeroConsola2 ){
            System.out.println("El " + NumeroConsola1 + " es el mayor");
        }else if(NumeroConsola1 < NumeroConsola2){
            System.out.println("El " + NumeroConsola2 + " es el mayor");
        }else{
            System.out.println("Los Numeros son Iguales");

        }
    }

}
