package com.company;

public class HiloEscritura implements Runnable{

    private int numero = 0;
    public HiloEscritura(int numero){
        this.numero = numero;
    }

    @Override
    public void run() {
            System.out.println("Hola mundo "+numero);
            try {
                Thread.sleep(numero*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
