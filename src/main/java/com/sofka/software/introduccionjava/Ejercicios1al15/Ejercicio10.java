package com.sofka.software.introduccionjava.Ejercicios1al15;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner caputre = new Scanner(System.in);
        System.out.println("Ingrese una frase de mas de 5 palabras:");
        String Frase = caputre.nextLine();
        String FraseSinEspacios = Frase.replace(" ","");
        System.out.println("La Frase sin espacios sera: "+FraseSinEspacios + ".");
    }
    }
