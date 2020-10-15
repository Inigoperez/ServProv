import java.util.Date;
import java.util.Scanner;

public class Revista extends Ejemplar{

    String Editorial;
    int NumPaginas;

    public Revista (String Titulo, int NumEjemplar, String FechaPublicacion, String Genero, int NumPaginas, String Editorial){
        super(Titulo,NumEjemplar,FechaPublicacion,Genero);
        this.NumPaginas = NumPaginas;
        this.Editorial = Editorial;
    }

    public Revista (Scanner sc){
        super(sc);

        System.out.println("Escribe el nombre del editorial:");
        Editorial = sc.nextLine();

        System.out.println("Escribe el numero de paginas:");
        NumPaginas = sc.nextInt();
        sc.nextLine();
        System.out.println("--------------------------------------------");
    }

    public int getNumPaginas(){
        return NumPaginas;
    }

    public String getEditorial(){
        return Editorial;
    }
}
