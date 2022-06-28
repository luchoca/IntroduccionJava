package com.sofka.software.introduccionjava.Ejercicios1al15;

import javafx.scene.text.Text;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner caputre = new Scanner(System.in);
        String Frase = "La sonrisa sera la mejor arma contra la tristeza";
        String FraseCambiada = Frase.replace("a", "e");
        System.out.println(Frase +". Si le cambio la a por la e quedaria: " + FraseCambiada);
        System.out.println("Ingrese algo para continuar la frase: " + Frase);
        String NuevaFrase = caputre.nextLine();
        System.out.println(""+Frase +","+ NuevaFrase+".");
    }
}


//        Del texto, “La sonrisa sera la mejor arma contra la tristeza”
//        Reemplaza todas las a del String anterior por una e, adicionalmente
//        concatenar a esta frase una adicional que ustedes quieran incluir
//        por consola y las muestre luego unidas.