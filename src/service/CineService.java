package service;

import entidades.Butaca;
import entidades.Cine;
import entidades.Cliente;

import java.util.Iterator;
import java.util.Scanner;

public class CineService {
    private Scanner sc = new Scanner(System.in);
    public Cine crearCine(){
        return new Cine();
    }

    public void menu(Cine cine) {
        int op=0;
        cine.crearEspectadores();
        cine.setPrecio(125.1);
        while (op!=10){
            System.out.println("\t## MENU CINEMA SHOW ##");
            System.out.println("1. Crear Sala ");
            System.out.println("2. Alta Pelicula ");
            System.out.println("3. Mostrar Sala");
            System.out.println("4. Mostrar Pelicula en exibicion");
            System.out.println("5. Mostrar lista espectadores");
            System.out.println("6. Ubicacion aleatoria de espectadores");
            System.out.println("7. Compra de entrada ");
            System.out.println("10. SALIR.");
            System.out.print("> Ingrese una opcion: _");
            op = sc.nextInt();
            switch (op) {
                case 1 -> cine.crearSala();
                case 2 -> cine.altaPelicula();
                case 3 -> cine.mostrarSala();
                case 4 -> System.out.println(cine.getPelicula());
                case 5 -> cine.mostrarEspectadores();
                case 6 -> cine.ubicarEspectadores(cine.getPelicula());
                case 7 -> compraEntrada(cine);
                case 10 -> System.out.println("Gracias por su visita...");
                default -> System.out.println("> Ingrese una opcion vallida...");
            }
        }

    }

    private void compraEntrada(Cine cine) {
        Cliente c1 =new Cliente("Nico",23,3500.55);
        System.out.println("Ingreso datos de Cliente..");
        System.out.print(".....Cliente- "+c1);
        System.out.println("--ASIENTOS DISPONIBLES--");
        cine.mostrarSala();
        System.out.print("Selecione una ubicacion.(X ocupado| 8A) >_  ");
        String ubic = sc.next();

        for (Butaca seat: cine.getSala()){

            if(seat.getUbicacion().equalsIgnoreCase(ubic) && seat.getEstado()==' '){
                seat.setEstado('X');
                System.out.println("Asiento-> "+seat.getUbicacion()+", asignado.-");

            }

        }


    }
}
