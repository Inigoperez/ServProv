package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ManejoFicheros implements Runnable{

    public ManejoFicheros(File archivo){
        this.fichero=archivo;
    }
    File fichero ;

    @Override
    public void run() {
        System.out.println(fichero);
        try(Scanner sc = new Scanner(fichero)){
            int count_palabras=0;
            while(sc.hasNext()){
                sc.next();
                count_palabras++;
            }
            System.out.println(fichero);
            System.out.println("Number of words: " + count_palabras);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
