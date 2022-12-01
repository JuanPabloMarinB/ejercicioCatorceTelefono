import Entidades.Movil;
import Servicios.MovilServicios;

public class Main {
    public static void main(String[] args) {

        MovilServicios ms = new MovilServicios();
        Movil m1 = ms.crearMovil();
        System.out.println(m1);

    }
}