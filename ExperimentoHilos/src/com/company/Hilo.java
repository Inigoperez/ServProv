package com.company;
import com.company.Contador;

/* implement Runnable
*       @override
*       public void run(){}
* ----------------------------
*  extends Thread
*/
import com.company.Contador;

public class Hilo implements Runnable{

    private String nombre = "";
    private Barrera barrera = new Barrera();

    public Hilo(String s) {
        this.nombre = s;
    }

    @Override
    public void run() {
            try {
                for(int i=0;i<100;i++){
                    barrera.cerrarBarrera();
                    Contador.incrementa();
                    barrera.abrirBarrera();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    /*private String nombre = "";

    public Hilo(String nombre){
       this.nombre = nombre;
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            Contador.incrementa();
            System.out.println(nombre+" "+Contador.contador);
        }
    }*/

/*
public class Hilo extends Thread {

    private String nombre = "";

    public Hilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ".- Soy el hilo " + nombre);
        }
    }
 }
 */

