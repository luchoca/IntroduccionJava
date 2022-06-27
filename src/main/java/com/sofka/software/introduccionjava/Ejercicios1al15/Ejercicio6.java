package com.sofka.software.introduccionjava.Ejercicios1al15;

public class Ejercicio6 {
    public static void main(String[] args) {
        int Numero = 0;
        for(Numero=0;Numero <=100; Numero ++){
            if(Numero % 2 == 0){
                System.out.println("  Par:"+ Numero ++);
                continue;
            }else{
                System.out.println("Impar:"+ Numero ++);
            }
        }
    }

}
/// falta que se muestren los impares en consola tambien, no se por que no anda como en el While