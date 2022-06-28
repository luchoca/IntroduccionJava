package com.sofka.software.introduccionjava.Ejercicios1al15;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner caputre = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor: ");
        for(int Numero= caputre.nextInt(); Numero<=1000; Numero += 2){
            System.out.println(Numero);

        }
    }

    }



//    Crear un programa que pida un numero por teclado y que imprima por pantalla
//    los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
