import java.util.Date;
import java.util.Scanner;

public class CD extends Multimedia{
    String artista;

    public CD (String Titulo, int NumEjemplar, String FechaPublicacion, String Genero, double Duracion, String Productor,String artista){
        super(Titulo,NumEjemplar,FechaPublicacion,Genero,Duracion,Productor);
        this.artista = artista;
    }

    public CD (Scanner sc){
        super(sc);

        System.out.println("Escribe el nombre del artista:");
        artista = sc.nextLine();
        System.out.println("--------------------------------------------");
    }
}
