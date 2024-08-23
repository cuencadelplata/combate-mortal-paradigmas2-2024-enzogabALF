package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnidadTest {
    private Unidad unidad;

    @BeforeEach
    public void setUp() {
        unidad = new Soldado(); // Usamos Soldado como ejemplo
    }

    @Test
    public void testRecibirDisparoSinEscudo() {
        unidad.recibirDisparo();
        assertFalse(unidad.estaVivo());
    }

    @Test
    public void testRecibirDisparoConEscudo() {
        Escudo escudo = new Escudo(0.5);
        unidad.equiparEscudo(escudo);
        unidad.recibirDisparo();
        assertTrue(unidad.estaVivo());
    }

    @Test
    public void testEstaVivo() {
        assertTrue(unidad.estaVivo());
        unidad.recibirDisparo();
        assertFalse(unidad.estaVivo());
    }
}
