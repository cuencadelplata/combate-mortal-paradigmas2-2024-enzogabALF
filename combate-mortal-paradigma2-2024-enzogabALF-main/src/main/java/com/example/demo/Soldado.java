package com.example.demo;


public class Soldado extends Unidad {
    public Soldado() {
        super(1); // El soldado tiene 1 punto de vida
    }

    @Override
    public void disparar() {
        System.out.println("Soldado dispara");
    }
}
