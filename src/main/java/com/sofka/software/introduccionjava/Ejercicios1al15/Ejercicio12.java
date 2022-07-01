package com.sofka.software.introduccionjava.Ejercicios1al15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner caputre = new Scanner(System.in);
        System.out.println("Ingrese 1 palabra:");
        String Palabra1 = caputre.nextLine();
        System.out.println("Ingrese otra palabra:");
        String Palabra2 = caputre.nextLine();
        int NumeroDiferencias = 0;
        String Diferencias = "";
        char ListaPalabra2[] = Palabra2.toCharArray();

        for (int p1 = 0; p1 < Palabra1.length(); p1++) {
            for (int p2 = 0; p2 < ListaPalabra2[p2]; p2++) {
                if (Palabra1.charAt(p1) != ListaPalabra2[p2]) {
                    NumeroDiferencias++;
                    Diferencias += Palabra1.charAt(p1);
                    System.out.println("Las diferencias son: " + Diferencias);

                }
            }

        }
    }
}


//Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.