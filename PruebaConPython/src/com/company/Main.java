package com.company;

import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        ProcessBuilder pb = new ProcessBuilder("cmd.exe");
        pb.redirectErrorStream(true);

        try{
            Process process = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));


            String linea = "";

            bw.write("python Ejer.py\n");
            bw.flush();

            linea = br.readLine();
            System.out.println(linea);
            //System.out.println("Escribe tu nombre: ");
            String nombre = sc.nextLine();

            bw.write(nombre+"\n");
            bw.flush();

            bw.write("Exit\n");
            bw.flush();

            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        }catch (Exception e)
        {

            System.out.println(e);

        }

    }
}
