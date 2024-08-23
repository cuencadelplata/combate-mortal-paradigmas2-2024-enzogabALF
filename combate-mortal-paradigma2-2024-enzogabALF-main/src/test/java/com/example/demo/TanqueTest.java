package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TanqueTest {
    private Tanque tanque;

    @BeforeEach
    public void setUp() {
        tanque = new Tanque();
    }

    @Test
    public void testDisparar() {
        tanque.disparar();
        // Aquí podrías verificar la salida en consola si fuera necesario
    }

    @Test
    public void testRecibirDisparo() {
        tanque.recibirDisparo();
        assertTrue(tanque.estaVivo());
        tanque.recibirDisparo();
        assertFalse(tanque.estaVivo());
    }
}
