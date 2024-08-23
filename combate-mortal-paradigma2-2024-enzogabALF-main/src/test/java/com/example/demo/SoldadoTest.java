package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SoldadoTest {
    private Soldado soldado;

    @BeforeEach
    public void setUp() {
        soldado = new Soldado();
    }

    @Test
    public void testDisparar() {
        soldado.disparar();
        // Aquí podrías verificar la salida en consola si fuera necesario
    }

    @Test
    public void testRecibirDisparo() {
        soldado.recibirDisparo();
        assertFalse(soldado.estaVivo());
    }
}
