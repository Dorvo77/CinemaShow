package service;

import entidades.Cine;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CineService {
    private Scanner sc = new Scanner(System.in);
    public Cine crearCine(){
        return new Cine();
    }

    public void menu(Cine cine) {
        int op=0;
        cine.crearEspectadores();
        while (op!=10){
            System.out.println("\t## MENU CINEMA SHOW ##");
            System.out.println("1. Crear Sala ");
            System.out.println("2. Alta Pelicula ");
            System.out.println("3. Mostrar Sala");
            System.out.println("4. Mostrar Pelicula en exibicion");
            System.out.println("5. Mostrar lista espectadores");
            System.out.println("10. SALIR.");
            System.out.print("> Ingrese una opcion: _");
            op = sc.nextInt();
            switch (op){
                case 1:
                    cine.crearSala();
                    break;
                case 2:
                    cine.altaPelicula();
                    break;
                case 3:
                    cine.mostrarSala();
                    break;
                case 4:
                    System.out.println(cine.getPelicula());
                    break;
                case 5:
                    cine.mostrarEspectadores();
                    break;

                case 10:
                    System.out.println("Gracias por su visita...");
                    break;
                default:
                    System.out.println("> Ingrese una opcion vallida...");
            }
        }

    }
}
