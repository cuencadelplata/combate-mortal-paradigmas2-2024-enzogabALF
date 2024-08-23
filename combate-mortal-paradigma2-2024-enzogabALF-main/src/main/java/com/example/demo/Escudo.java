package com.example.demo;

public class Escudo {
    private double porcentajeProteccion;

    public Escudo(double porcentajeProteccion) {
        this.porcentajeProteccion = porcentajeProteccion;
    }

    public int reducirDaño(int daño) {
        return (int) Math.ceil(daño * (1 - porcentajeProteccion));
    }
}
