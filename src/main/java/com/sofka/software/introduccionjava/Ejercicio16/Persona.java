package com.sofka.software.introduccionjava.Ejercicio16;

public class Persona {


    //Atributos
    public static final char HOMBRE = 'H';
    public static final char MUJER = 'M';
    public static final int SOBREPESO = 1;
    public static final int INFRAPESO = -1;
    public static final int PESOIDEAL = 0;


    private String nombre = "";
    private int edad = 0;
    private String DNI = "";
    private char sexo = HOMBRE;
    private double peso = 0;
    private double altura = 0;
    //Constantes


    public Persona() {
        this.DNI = generateDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generateDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generateDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;


    }

    public int calcularIMC() {
        int resultado = 0;
        double imc = this.peso / Math.pow(this.altura, 2);
        if (imc < 20) resultado = SOBREPESO;
        else if (imc >= 20 && imc <= 25) {
            resultado = PESOIDEAL;
        } else if (imc > 25) {
            resultado = INFRAPESO;

        }

        return resultado;
    }


    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    public static char comprobarSexo(char sexo) {
        if (sexo == HOMBRE || sexo == MUJER)
            return sexo;
        else return HOMBRE;
    }

    @Override
    public String toString() {
        return "Persona{" +
                ", nombre='" + nombre + '\n' +
                ", edad=" + edad +'\n'+
                ", DNI='" + DNI + '\n' +
                ", sexo=" + sexo +'\n'+
                ", peso=" + peso +'\n'+
                ", altura=" + altura +
                '}';
    }
    //NUMERO ALEATROIO
    public int generateNumeroDNI(){
        double DNI = 10000000 + Math.random() * 90000000;
        return (int)DNI;
    }
    //LETRA ALEATORIA
    public char generateLetra(int numero) {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dif = numero%23;
        return caracteres.charAt(dif);
    }

    //NUMERO ALEATROIO
    public String generateDNI(){
        int numero = generateNumeroDNI();
        String serie = String.valueOf(generateLetra(numero));
        return serie + numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}