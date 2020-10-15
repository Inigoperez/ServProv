import java.util.Date;
import java.util.Scanner;

public abstract class Multimedia extends Ejemplar{

    private double Duracion;
    private String Productor;

    public Multimedia (String Titulo, int NumEjemplar, String FechaPublicacion, String Genero,double Duracion,String Productor){
        super(Titulo,NumEjemplar,FechaPublicacion,Genero);
        this.Duracion = Duracion;
        this.Productor = Productor;
    }

    public Multimedia(Scanner sc) {
        super(sc);

        System.out.println("Escribe la duración del disco:");
        Duracion = sc.nextDouble();
        sc.nextLine();

        System.out.println("Escribe el nombre del productor:");
        Productor = sc.nextLine();

    }

    public double getDuracion(){
        return Duracion;
    }

    public String getProductor(){
        return Productor;
    }
}
