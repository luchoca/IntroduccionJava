package com.sofka.software.introduccionjava.Ejercicio17;

public class Electrodomesticos {
    //constantes
    private final static double PRECIOBASE = 100;
    private final static String COLOR = "blanco";
    private final static char CONSUMO = 'F';
    private final static int PESO = 5;
    //atributos

    double precioBase = PRECIOBASE;
    String color = COLOR;
    char ConsumoEnergetico = CONSUMO;
    int peso = PESO;


    //COSTRUCTORES
    public Electrodomesticos() { //DEFECTO
    }

    public Electrodomesticos(double precioBase, int peso) { //CON DOS PARAMETROS  (PRECIOBASE Y PESO )
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomesticos(double precioBase, String color, char consumoEnergetico, int peso) { //CON TODOS LOS PARAMETROS
        this.precioBase = precioBase;
        this.color = color;
        ConsumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }


    //METODOS
    char comprobarConsumoEnergetico(char letra) {
        return 0;  /// hacer un if
    }

    String comprobarColor(String color) {
        return "0";
    }

    int precioFinal() {
        return 0;
    }

//    según el consumo energético, aumentara su precio, y según su tamaño,
//    también. Esta es la lista de precios:


//    comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra por defecto. Se invocará al crear el objeto y no será visible.
//    comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto. Se invocará al crear el objeto y no será visible.
//    precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:
}


//        Los colores disponibles son blancos, negro, rojo, azul y gris.
//        No importa si el nombre está en mayúsculas o en minúsculas.
//