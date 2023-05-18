package entidades;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Cine {
    private Pelicula pelicula;
    private ArrayList<Butaca> sala = new ArrayList<>();
    private Double precio;

    public Cine() {
    }


    public Cine(Pelicula pelicula, ArrayList<Butaca> sala, Double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Butaca> getSala() {
        return sala;
    }

    public void setSala(ArrayList<Butaca> sala) {
        this.sala = sala;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public void crearSala(){
        String[] columna = {"A","B","C","D","E","F"};
        for (int i = 8; i >0 ; i--) {
            for (String col: columna) {
                Butaca aux = new Butaca();
                aux.setUbicacion(i+col);
                sala.add(aux);
            }
        }
    }

    public  void mostrarSala(){
        int cont=1;
        System.out.print("\t");
        for (Butaca butaca: sala) {
            System.out.print(butaca);
            if(cont%6 == 0){
                System.out.println();
                System.out.print("\t");

            }
            cont++;
        }
        System.out.println("******************************");
        System.out.println("             PANTALLA");
        System.out.println("\t******************************");
    }
    ArrayList<Cliente> espectadores = new ArrayList<>();
    Random rand = new Random();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public void crearEspectadores(){
        //Random rand = new Random();

        for (int i = 1; i < 61 ; i++) {
            String nombre = "Espectador " +i;
            Integer edad = rand.nextInt(85)+1; // Edad entre 1 y 85
            Double dinero = rand.nextDouble(5000)+1; // Dinero entre 0 y 5000
            Cliente espectador = new Cliente(nombre, edad, dinero);
            espectadores.add(espectador);
        }
    }

    public void mostrarEspectadores() {
        for (Cliente espectador:espectadores) {
            System.out.println(espectador);
        }

    }

    public void ubicarEspectadores(Pelicula peli) {
        Iterator it = espectadores.iterator();
        Iterator st = sala.iterator();
        while (it.hasNext()){
            Cliente aux = (Cliente) it.next();
            if(aux.getEdad()>peli.getEdad() && aux.getDinero()>precio){

                int indice = rand.nextInt(47);

                System.out.println("Muestra butaca->"+sala.get(indice));
                if (sala.get(indice).getEstado() == ' '){
                    sala.get(indice).setEstado('X');
                    System.out.println("Puede entrar ->> "+aux.getNombre()+", Asiento: "+sala.get(indice).getUbicacion());
                }else {
                    boolean flag = false;
                    for (Butaca seat : sala) {
                        if (seat.getEstado() == ' ') {
                            seat.setEstado('X');
                            System.out.println("Nueva ubicacion: " + seat.getUbicacion());
                            flag = true;
                            break;
                        }
                    }
                    if (!flag){
                        System.out.println("\tNO HAY ASIENTOS DISPONIBLES");
                        mostrarSala();
                    }
                }

            }else{
                System.out.println("\tNo puede ingresar"+aux.getNombre());
            }
        }
    }

    public void altaPelicula() {
        System.out.println("\tAlta de pelicula");
        System.out.print("_Ingrese Titulo: >");
        String tit = sc.next();
        System.out.print("_Ingrese Director: >");
        String dir = sc.next();
        System.out.print("_Ingrese Duracion en minutos: >");
        Double dur = sc.nextDouble();
        System.out.print("_Ingrese Edad proteccion al menor: >");
        Integer edad = sc.nextInt();
        pelicula = new Pelicula(tit, dir, dur, edad);
    }
}
