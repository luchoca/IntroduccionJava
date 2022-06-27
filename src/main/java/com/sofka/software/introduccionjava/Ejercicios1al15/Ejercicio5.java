package com.sofka.software.introduccionjava.Ejercicios1al15;

public class Ejercicio5 {
    public static void main(String[] args) {

        int Numero = 0;
        while (Numero <= 100){
            if(Numero % 2 == 0){
                System.out.println("  Par:"+ Numero ++);
            }else{
                System.out.println("Impar:"+ Numero ++);

            }
        }
    }
}