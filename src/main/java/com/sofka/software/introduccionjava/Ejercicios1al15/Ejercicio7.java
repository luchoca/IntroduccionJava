package com.sofka.software.introduccionjava.Ejercicios1al15;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);
        int Numero = 0;
        do{
            System.out.println("Ingrese un Numero:");
            Numero = capture.nextInt();
            System.out.println("El numero elegido es :" + Numero);

        }while(Numero >= 0);
    }
    }
