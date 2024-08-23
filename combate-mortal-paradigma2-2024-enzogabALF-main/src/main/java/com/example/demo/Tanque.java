package com.example.demo;

public class Tanque extends Unidad {
    public Tanque() {
        super(2); // El tanque tiene 2 puntos de vida
    }

    @Override
    public void disparar() {
        System.out.println("Tanque dispara");
    }
}