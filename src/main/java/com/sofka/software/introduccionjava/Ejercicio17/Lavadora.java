package com.sofka.software.introduccionjava.Ejercicio17;

public class Lavadora extends Electrodomesticos {
    private final static int CARGA = 5;
    int carga = CARGA;


    //constructores
    public Lavadora() {
    }

    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }


    int precioFinal(){

        return 0;
    }


//PONERLE LOS ATRIBUTOS HEREDADOS

//    Su atributo es carga, además de los atributos heredados.
//    Por defecto, la carga es de 5 kg. Usa una constante para ello.
//    Los constructores que se implementarán serán:
}


//        Un constructor por defecto.
//        Un constructor con el precio y peso. El resto por defecto.
//        Un constructor con la carga y el resto de atributos heredados.
//        Recuerda que debes llamar al constructor de la clase padre.
//
//        Los métodos que se implementara serán:
//        Método get de carga.

//        precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €,
//        sino es así no se incrementara el precio.
//        Llama al método padre y añade el código necesario.
//        Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
//
//