package com.sofka.software.introduccionjava.Ejercicios1al15;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ejercicio13 {
    public static void main(String[] args) {

        LocalDate Fecha = LocalDate.now();
        LocalTime Hora = LocalTime.now();
        System.out.println("Hoy es: " + Fecha  + " Y la hora actual es: " + Hora);
    }
}


//    Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)