import java.util.Date;
import java.util.Scanner;

public class DVD extends Multimedia{
    String actor;
    String director;

    public DVD (String Titulo, int NumEjemplar, String FechaPublicacion, String Genero, double Duracion, String Productor, String actor, String director){
        super(Titulo,NumEjemplar,FechaPublicacion,Genero,Duracion,Productor);
        this.actor = actor;
        this.director = director;
    }

    public DVD (Scanner sc){
        super(sc);

        System.out.println("Escribe el nombre del actor:");
        actor = sc.nextLine();

        System.out.println("Escribe el nombre del director:");
        director = sc.nextLine();
        System.out.println("--------------------------------------------");
    }
}
