package com.company;

public class Jugador implements Runnable{

    private String nombre = "";
    private Mesa mesa;
    public Jugador(String nombre, Mesa mesa) {
        this.nombre = nombre;
        this.mesa = mesa;
    }

    @Override
    public void run() {
        while (true){
            synchronized (mesa){
                System.out.println(nombre);
                try {
                    mesa.notify();
                    mesa.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
