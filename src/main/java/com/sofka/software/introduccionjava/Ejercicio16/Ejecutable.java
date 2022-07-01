package com.sofka.software.introduccionjava.Ejercicio16;

import java.util.Scanner;

public class Ejecutable {
    public static void main (String []args){

        Scanner caputre = new Scanner(System.in);
        System.out.println("Ingrese Nombre: ");
        String nombre = caputre.nextLine();
        System.out.println("Ingrese Edad: ");
        int edad = caputre.nextInt();
        System.out.println("Ingrese Sexo:");
        String sexoCaracter = caputre.nextLine();
        char sexo = sexoCaracter.charAt(0);
        System.out.println("Ing1ese Peso ");
        int peso = caputre.nextInt();
        System.out.println("Ingrese Altura: ");
        int altura = caputre.nextInt();



        //Creamos objetos con cada constructor

        Persona persona1 = new Persona();

        Persona persona2 = new Persona(nombre, edad, sexo);

        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);


        //Los datos que no esten completos los insertamos con los metodos set

        persona1.setNombre("Luciano");

        persona1.setEdad(30);

        persona1.setSexo('H');

        persona1.setPeso(90);

        persona1.setAltura(1.70);


        persona2.setPeso(100.5);

        persona2.setAltura(2.00);


        //Usamos metodos para realizar la misma accion para cada objeto

        System.out.println("Persona1");

        MuestraMensajePeso(persona1);

        MuestraMayorDeEdad(persona1);

        System.out.println(persona1.toString());


        System.out.println("Persona2");

        MuestraMensajePeso(persona2);

        MuestraMayorDeEdad(persona2);

        System.out.println(persona2.toString());


        System.out.println("Persona3");

        MuestraMensajePeso(persona3);

        MuestraMayorDeEdad(persona3);

        System.out.println(persona3.toString());

    }


    public static void MuestraMensajePeso(Persona p) {

        int IMC = p.calcularIMC();

        switch (IMC) {

            case Persona.PESOIDEAL:

                System.out.println("La persona esta en su peso ideal");

                break;

            case Persona.INFRAPESO:

                System.out.println("La persona esta por debajo de su peso ideal");

                break;

            case Persona.SOBREPESO:

                System.out.println("La persona esta por encima de su peso ideal");

                break;

        }

    }


    public static void MuestraMayorDeEdad(Persona p) {


        if (p.esMayorDeEdad()) {

            System.out.println("La persona es mayor de edad");

        } else {

            System.out.println("La persona no es mayor de edad");

        }

    }


}



//Ahora, crea una clase ejecutable que haga lo siguiente:

//Pide por teclado el nombre, la edad, sexo, peso y altura.
// Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado,
//el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último
// utiliza los métodos set para darle a los atributos un valor.
//Para cada objeto, deberá comprobar si está en su peso ideal, 4
// tiene sobrepeso o por debajo de su peso ideal con un mensaje.
//Indicar para cada objeto si es mayor de edad.
//Por último, mostrar la información de cada objeto.