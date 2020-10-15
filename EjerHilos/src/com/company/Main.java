package com.company;

public class Main {

    public static void main(String[] args) {
        Thread t2 = new Thread(new HiloSecundario());
        t2.start();
    }
}
