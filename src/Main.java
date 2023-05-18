import entidades.Cine;
import entidades.Pelicula;
import service.CineService;

public class Main {
    public static void main(String[] args) {
        CineService cs = new CineService();
        Cine hoyts = cs.crearCine();
        cs.menu(hoyts);

        /*hoyts.setPrecio(1500.50);
        hoyts.crearSala();
        hoyts.mostrarSala();
        hoyts.crearEspectadores();
        hoyts.mostrarEspectadores();
        Pelicula tiburon = new Pelicula("Tiburon","SP",127.5,16);

        hoyts.ubicarEspectadores(tiburon);
        hoyts.mostrarSala();
        */
    }
}
