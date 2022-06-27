package com.sofka.software.introduccionjava.Ejercicios1al15;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner capture = new Scanner(System.in);
        System.out.println("Ingrese el precio:");
        Double Precio = capture.nextDouble();
        Double IVA = Precio * 0.21;
        System.out.println("El IVA de este prodcuto es: " + "$"+IVA);

    }
}