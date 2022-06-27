package com.sofka.software.introduccionjava.Ejercicios1al15;

import java.util.Scanner;

public class Ejercicio3 {


    public static void main (String []args){

        Scanner capture = new Scanner(System.in);
        System.out.println("Escribe el Radio del Circulo que desees averiguar");
        Double R = capture.nextDouble();
        Double Area = Math.pow(R,2)*Math.PI;
        System.out.println("El area es :" + Area );



    }


}
