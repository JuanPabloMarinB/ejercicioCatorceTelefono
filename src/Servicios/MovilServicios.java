package Servicios;

import Entidades.Movil;

import java.util.Scanner;

public class MovilServicios {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    int[] arregloCodigos = new int[7];

    public void ingresarCodigo() {

        for (int i = 0; i < arregloCodigos.length; i++) {
            System.out.println("Ingresa el dígito N° " + (i + 1) + "  del código");
            arregloCodigos[i] = sc.nextInt();

            while (arregloCodigos[i] > 9 || arregloCodigos[i] < 0) {
                System.out.println("Recuerda que es un solo dígito");
                System.out.println("Ingresa un código válido, por favor");
                arregloCodigos[i] = sc.nextInt();
            }

        }

    }

    public Movil crearMovil() {

        Movil m1 = new Movil();

        System.out.println("Ingresa la marca del movil");
        m1.setMarca(sc.next());

        System.out.println("Ingresa el modelo de tu " + m1.getMarca());
        m1.setModelo(sc.next());

        System.out.println("Ingresa el precio del nuevo " + m1.getMarca() + " " + m1.getModelo());
        m1.setPrecio(sc.nextDouble());

        System.out.println("Ingresa la memoria Ram (en Gbs) que tiene el " + m1.getMarca() + " " + m1.getModelo());
        m1.setMemoriaRam(sc.nextInt());

        System.out.println("Ingresa el espacio de almacenamiento (en Gbs) que tiene el " + m1.getMarca() + " " + m1.getModelo());
        m1.setAlmacenamiento(sc.nextInt());

        ingresarCodigo();

        m1.setCodigo(arregloCodigos);

        return m1;
    }

}
