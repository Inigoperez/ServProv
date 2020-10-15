package com.company;

public class Barrera {

    boolean estadoBarrera=true; //Barrera abierta => True

    public void abrirBarrera(){

    }

    public void cerrarBarrera() throws InterruptedException {
        while (!estadoBarrera){
            wait();
        }
        estadoBarrera = false;
    }
}
