import java.util.*;

public abstract class Ejemplar {
    private String Titulo;
    private int NumEjemplar;
    private String FechaPublicacion;
    private String Genero;

    public Ejemplar(String Titulo,int NumEjemplar,String FechaPublicacion,String Genero){
        this.Titulo = Titulo;
        this.NumEjemplar = NumEjemplar;
        this.FechaPublicacion = FechaPublicacion;
        this.Genero = Genero;
    }

    public Ejemplar (Scanner sc){
        System.out.println("Escribe el titulo:");
        Titulo = sc.nextLine();

        System.out.println("Escribe el Numero de ejemplar:");
        NumEjemplar = sc.nextInt();
        sc.nextLine();

        System.out.println("Escribe la Fecha de publicación:");
        FechaPublicacion = sc.nextLine();

        System.out.println("Escribe el genero del producto:");
        Genero = sc.nextLine();

    }

    public String getTitulo(){
        return Titulo;
    }

    public int getNumEjemplar(){
        return NumEjemplar;
    }

    public String getFechaPublicacion(){
        return FechaPublicacion;
    }

    public String getGenero(){
        return Genero;
    }
}
