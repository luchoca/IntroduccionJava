package com.sofka.software.introduccionjava.Ejercicio16;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner caputre = new Scanner(System.in);
        Scanner caputre2 = new Scanner(System.in);
        ///INGRESAR DATOS POR CONSOLA
        System.out.println("Ingrese Nombre: ");
        String nombre = caputre.nextLine();
        System.out.println("Ingrese Edad: ");
        int edad = caputre2.nextInt();
        System.out.println("Ingrese Sexo:");
        String sexoCaracter = caputre.nextLine();
        char sexo = sexoCaracter.charAt(0);
        System.out.println("Ingrese Peso ");
        double peso = caputre.nextDouble();
        System.out.println("Ingrese Altura: ");
        double altura = caputre2.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

        if (persona1.calcularIMC() == 1)
            System.out.println("TIENE SOBREPESO");
        else if (persona1.calcularIMC() == -1) {
            System.out.println("ESTA POR DEBAJO DE SU PESO");
        } else if (persona1.calcularIMC() == 0) {
            System.out.println("PESO IDEAL");

        }
        if (persona1.esMayorDeEdad())
            System.out.println("ES MAYOR");    //llamo a la funcion esa
        else System.out.println("ES MENOR");

        System.out.println(persona1.toString());
         //muestro los metodos
                /////PERSONA 2

        ///INGRESAR DATOS POR CONSOLA
        Scanner caputre3 = new Scanner(System.in);

        System.out.println("Ingrese Nombre: ");
        String nombre2 = caputre3.nextLine();
        System.out.println("Ingrese Edad: ");
        int edad2 = caputre3.nextInt();
        System.out.println("Ingrese Sexo:");
        String sexoCaracter2 = caputre3.nextLine();
        char sexo2 = sexoCaracter.charAt(0);

        Persona persona2 = new Persona(nombre2, edad2, sexo2);


        if (persona2.calcularIMC() == 1)
            System.out.println("TIENE SOBREPESO");
        else if (persona2.calcularIMC() == -1) {
            System.out.println("ESTA POR DEBAJO DE SU PESO");
        } else if (persona2.calcularIMC() == 0) {
            System.out.println("PESO IDEAL");

        }
        if (persona2.esMayorDeEdad())
            System.out.println("ES MAYOR");
        else System.out.println("ES MENOR");
        System.out.println(persona2.toString());

//        persona2.toString();


        ////PERSONA 3

        Persona persona3 = new Persona();
        persona3.setNombre("Luciano");
        persona2.setEdad(30);                       // le mando info
        persona3.setSexo('H');
        persona3.setAltura(1.80);
        persona3.setPeso(90.5);

        if (persona3.calcularIMC() == 1)
            System.out.println("TIENE SOBREPESO");
        else if (persona3.calcularIMC() == -1) {
            System.out.println("ESTA POR DEBAJO DE SU PESO");
        } else if (persona3.calcularIMC() == 0) {
            System.out.println("PESO IDEAL");

        }
        if (persona3.esMayorDeEdad())
            System.out.println("ES MAYOR");
        else System.out.println("ES MENOR");


        System.out.println(persona3.toString());


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