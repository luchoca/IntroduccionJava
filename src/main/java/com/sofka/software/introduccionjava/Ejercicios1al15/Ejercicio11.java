package com.sofka.software.introduccionjava.Ejercicios1al15;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner caputre = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String Frase = caputre.nextLine();
        char vocales[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
        int NumeroVocales = 0;
        String Voc = "";
        for(int i = 0; i< Frase.toLowerCase().length(); i++) { //RECORRE STRING
            for (int v=0; v<vocales.length; v++){               // RECORRE [VOCALES]
                if(Frase.charAt(i) == vocales[v]){              //va recorriendo la frase y si coincide con alguna [vocal]
                NumeroVocales++;                               //aumenta Numero contador
                    Voc += Frase.charAt(i);
                }
            }
        }
            System.out.println("La Frase tiene: "+ Frase.length() +" caracteres y " + NumeroVocales + " vocales.");
        System.out.println("Las vocales presentes son: "+Voc);

    }
    }


