package com.sofka.software.introduccionjava.Ejercicio18;

public class VideoJuegos {
    public static final boolean ENTREGADO = false;
    public static final int HORASESTIMADAS = 10;



    //    titulo, horas estimadas, entregado, genero y compañia.

    String titulo = "";
    String genero = "";
    String compania = "";
    int horasEstimadas = HORASESTIMADAS;
    boolean entregado = ENTREGADO;

    public VideoJuegos() {  //Un constructor por defecto.

    }

    public VideoJuegos(String titulo, int horasEstimadas) {
        this.titulo = titulo;                 /////Un constructor con el titulo y horas estimadas.El resto por defecto.

        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuegos(String titulo, String genero, String compania, int horasEstimadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;   ////Un constructor con todos los atributos, excepto de entregado.
        this.horasEstimadas = horasEstimadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    @Override
    public String toString() {
        return "VideoJuegos{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                '}';
    }
}


//Por defecto, las horas estimadas serán de 10 horas
// y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.

//Crearemos una clase Videojuego con las siguientes características:
//
//Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
//Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.
//Los constructores que se implementaran serán:
//Un constructor con el titulo y horas estimadas. El resto por defecto.

//Los métodos que se implementara serán:
//Métodos get de todos los atributos, excepto de entregado.
//Métodos set de todos los atributos, excepto de entregado.
//Sobrescribe los métodos toString.
//Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en común, por eso vamos a hacer una interfaz llamada Entregable con los siguientes métodos:
//
//entregar(): cambia el atributo prestado a true.
//devolver(): cambia el atributo prestado a false.
//isEntregado(): devuelve el estado del atributo prestado.
//Método compareTo (Object a), compara las horas estimadas en los videojuegos y en las series el numero de temporadas. Como parámetro que tenga un objeto, no es necesario que implementes la interfaz Comparable. Recuerda el uso de los casting de objetos.
//
//Implementa los anteriores métodos en las clases Videojuego y Serie. Ahora crea una aplicación ejecutable y realiza lo siguiente:
//
//Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
//Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
//Entrega algunos Videojuegos y Series con el método entregar().
//Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
//Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas. Muéstralos en pantalla con toda su información (usa el método toString()).