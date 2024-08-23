package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BuqueTest {
    private Buque buque;

    @BeforeEach
    public void setUp() {
        buque = new Buque();
    }

    @Test
    public void testDisparar() {
        buque.disparar();
        // Aquí podrías verificar la salida en consola si fuera necesario
    }

    @Test
    public void testRecibirDisparo() {
        buque.recibirDisparo();
        assertTrue(buque.estaVivo());
        buque.recibirDisparo();
        assertTrue(buque.estaVivo());
        buque.recibirDisparo();
        assertFalse(buque.estaVivo());
    }
}