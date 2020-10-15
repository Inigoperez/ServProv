import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Ejemplar> Lista = new ArrayList<>();
        System.out.println("Libro");
        Lista.add(new Libro(sc));
        Lista.add(new Libro(sc));
        System.out.println("DVD");
        Lista.add(new DVD(sc));
        System.out.println("Revista");
        Lista.add(new Revista(sc));

        for (Ejemplar ejemplar : Lista){
            //if(ejemplar instanceof  Libro){
             if(ejemplar instanceof Prestable)
                ((Prestable) ejemplar).prestar();
            }
        }
    }
