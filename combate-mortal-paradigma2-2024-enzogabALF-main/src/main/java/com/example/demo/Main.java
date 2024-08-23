package com.example.demo;

public class Main {
    public static void main(String[] args) {
        Soldado soldado = new Soldado();
        Tanque tanque = new Tanque();
        Buque buque = new Buque();

        Escudo escudo50 = new Escudo(1);

        soldado.equiparEscudo(escudo50);
        tanque.equiparEscudo(escudo50);
        buque.equiparEscudo(escudo50);

        System.out.println("Soldado está vivo: " + soldado.estaVivo());
        soldado.recibirDisparo();
        System.out.println("Soldado está vivo después de un disparo: " + soldado.estaVivo());

        System.out.println("Tanque está vivo: " + tanque.estaVivo());
        tanque.recibirDisparo();
        System.out.println("Tanque está vivo después de un disparo: " + tanque.estaVivo());
        tanque.recibirDisparo();
        System.out.println("Tanque está vivo después de dos disparos: " + tanque.estaVivo());

        System.out.println("Buque está vivo: " + buque.estaVivo());
        buque.recibirDisparo();
        System.out.println("Buque está vivo después de un disparo: " + buque.estaVivo());
        buque.recibirDisparo();
        System.out.println("Buque está vivo después de dos disparos: " + buque.estaVivo());
        buque.recibirDisparo();
        System.out.println("Buque está vivo después de tres disparos: " + buque.estaVivo());
    }
}
