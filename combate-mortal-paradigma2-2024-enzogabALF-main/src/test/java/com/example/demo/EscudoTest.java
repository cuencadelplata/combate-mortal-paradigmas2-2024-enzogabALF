package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EscudoTest {
    @Test
    public void testReducirDaño() {
        Escudo escudo = new Escudo(0.5);
        int dañoReducido = escudo.reducirDaño(2);
        assertEquals(1, dañoReducido);
    }
}
