import java.util.*;

public class Libro extends Ejemplar implements Prestable{
    private int NumPaginas;
    private String Editorial;
    private String Autor;

    public Libro (String Titulo,int NumEjemplar,String FechaPublicacion,String Genero,int NumPaginas,String Editorial,String Autor){
        super(Titulo,NumEjemplar,FechaPublicacion,Genero);
        this.NumPaginas = NumPaginas;
        this.Editorial = Editorial;
        this.Autor = Autor;
    }

    public Libro (Scanner sc){
        super(sc);

        System.out.println("Escribe numero de paginas:");
        NumPaginas = sc.nextInt();
        sc.nextLine();

        System.out.println("Escribe la editorial:");
        Editorial = sc.nextLine();

        System.out.println("Escribe el nombre del autor:");
        Autor = sc.nextLine();
        System.out.println("--------------------------------------------");
    }
    public int getNumPaginas(){
        return NumPaginas;
    }

    public String getEditorial(){
        return Editorial;
    }

    public String getAutor(){
        return Autor;
    }

    @Override
    public void prestar() {
        System.out.println("Libro prestado.");
    }
}
