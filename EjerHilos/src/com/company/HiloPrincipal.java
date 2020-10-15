package com.company;

import com.company.HiloSecundario;

public class HiloPrincipal implements Runnable{

    int paciencia = 30000;

    public void run(){
        Thread t1 = new Thread(new HiloSecundario());
        t1.start();

        if(t1.isAlive()){
            System.out.println("Quieren matar el hilo");
            t1.interrupt();
        }
    }
}

