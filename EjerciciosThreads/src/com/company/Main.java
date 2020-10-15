package com.company;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      //ejercicio1();
        ejercicio3();


    }

    private static void ejercicio1(){
        for(int i = 1;i<10;i++){
            Thread t1 = new Thread(new HiloEscritura(i));
            t1.start();
        }
    }

    private static void ejercicio3(){
        File fichero1 = new File("Fichero1.txt");
        File fichero2 = new File("Fichero2.txt");
        File fichero3 = new File("Fichero3.txt");

        ArrayList<File> ficheros = new ArrayList<File>();
        ficheros.add(fichero1);
        ficheros.add(fichero2);
        ficheros.add(fichero3);

        for(int i=0;i<ficheros.size();i++){
            Thread t1 = new Thread(new ManejoFicheros(ficheros.get(i)));
            t1.start();
        }
    }
}
