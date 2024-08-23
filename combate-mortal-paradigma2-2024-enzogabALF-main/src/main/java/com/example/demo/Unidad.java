package com.example.demo;


public abstract class Unidad {
    protected int vida;
    protected Escudo escudo;

    public Unidad(int vida) {
        this.vida = vida;
    }

    public void recibirDisparo() {
        int daño = 1;
        if (escudo != null) {
            daño = escudo.reducirDaño(daño);
        }
        vida -= daño;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void equiparEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public abstract void disparar();
}
