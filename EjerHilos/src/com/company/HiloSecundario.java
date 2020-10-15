package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class HiloSecundario implements Runnable{

    private String[] mensajes = {"Hola Ander!","Hola Iñigo !","Hola Mikel!","Hola Leire!","Hola Jonander!"};
    private float duracion;
    public  HiloSecundario(){};


    @Override
    public void run(){
        duracion = System.currentTimeMillis();
        for(int i=1;i<11;i++){
            escribirMensajes(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    private void escribirMensajes(int i){
        String mensaje = mensajes[(int) (Math.random()*4 + 0)];
        JOptionPane.showMessageDialog(null, mensaje+" "+i+" veces."+duracion);
    }
}

