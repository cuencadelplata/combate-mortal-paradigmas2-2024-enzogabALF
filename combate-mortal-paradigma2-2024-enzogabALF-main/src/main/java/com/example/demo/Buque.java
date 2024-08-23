package com.example.demo;

public class Buque extends Unidad {
    public Buque() {
        super(3); // El buque tiene 3 puntos de vida
    }

    @Override
    public void disparar() {
        System.out.println("Buque dispara");
    }
}