package com.sofka.software.introduccionjava.Ejercicio18;

public class Serie implements Entregable{
//atributos van como privado

    public static final boolean ENTREGADO = false;
    public static final int NUMEROTEMPORADA = 3;


    String titulo = "";
    int numeroTemporada = NUMEROTEMPORADA;
    boolean entregado = ENTREGADO;
    String genero = "";
    String creador = "0";

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporada, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporada = numeroTemporada;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporada=" + numeroTemporada +
                ", entregado='" + entregado + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {

        return this.entregado;  //devuelvo el estado de entregado
    }

    @Override
    public int compareTo(Object a) {
        return 0;
    }
}
