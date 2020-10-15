package com.company;

import com.company.Contador;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		final int numThread = 100;
		Thread[] Lista = new Thread[numThread];

		for(int i=0;i<numThread;i++){
			Lista[i] = new Thread(new Hilo("hilo"+i));
		}
		for(Thread t : Lista){
			t.start();
		}
		try {
			for (Thread t : Lista) {
				t.join();
			}
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Contador.contador);
	}

	/*public static void main(String[] args) {

		final int numThread = 100;
		Thread[] Lista = new Thread[numThread];

	    for(int i=0;i<numThread;i++){
	    	Lista[i] = new Thread(new Hilo("hilo"+i));
		}
	    for(Thread t : Lista){
	    	t.start();
		}
	    try {
			for (Thread t : Lista) {
				t.join();
			}
		}catch (InterruptedException e){
	    	e.printStackTrace();
		}
		System.out.println(Contador.contador);
    }*/

	/*
	public static void main(String[] args) {
		Hilo hilo1, hilo2, hilo3;

		hilo1 = new Hilo("hilo 1");
		hilo2 = new Hilo("hilo 2");
		hilo3 = new Hilo("hilo 3");

		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
	*/
}
