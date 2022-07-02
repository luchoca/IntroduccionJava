package com.sofka.software.introduccionjava.Ejercicio17;

public class Television {
}


//Crearemos una subclase llamada Television con las siguientes características:
//
//        Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
//        Por defecto, la resolución será de 20 pulgadas y el sintonizador será false.
//        Los constructores que se implementarán serán:
//        Un constructor por defecto.
//        Un constructor con el precio y peso. El resto por defecto.
//        Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados.
//        Recuerda que debes llamar al constructor de la clase padre.
//
//        Los métodos que se implementara serán:
//        Método get de resolución y sintonizador TDT.
//        precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y
//        si tiene un sintonizador TDT incorporado, aumentara 50 €. Recuerda que las condiciones que hemos visto en
//        la clase Electrodomestico también deben afectar al precio.
//
//        Ahora crea una clase ejecutable que realice lo siguiente:
//
//        Crea un array de Electrodomesticos de 10 posiciones.
//        Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
//        Ahora, recorre este array y ejecuta el método precioFinal().
//        Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado,
//        el de las lavadoras por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico,
//        pero recuerda que Television y Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.
//
//        Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, una lavadora de 200 y una
//        televisión de 500, el resultado final sera de 1000 (300+200+500) para electrodomésticos, 200 para lavadora y
//        500 para televisión.