package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Mesa mesa = new Mesa();

        Thread t1 = new Thread(new Jugador("Ping",mesa));
        Thread t2 = new Thread(new Jugador("Pong",mesa));

        t1.start();
        t2.start();
    }
}

