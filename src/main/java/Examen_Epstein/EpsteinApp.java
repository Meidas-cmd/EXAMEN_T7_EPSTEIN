package Examen_Epstein;

import java.util.*;

public class EpsteinApp {

    static ArrayList<Famoso> listaEpstein = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);
    static void main() {

        procesarDatos();
        nuevoFamoso();
        buscarFamoso();
        eliminarMenores();

    }

    public static void procesarDatos(){

        System.out.println("Procesando datos desde EntradaDatos...");
        EntradaDatos.generarDatos();

        EntradaDatos.getDatosActuales();


    }
    public static Famoso insertarDatos(){
        System.out.println("Nombre: ");
        String nom = entrada.nextLine();
        System.out.println("Pais: ");
        String pais = entrada.nextLine();
        System.out.println("Profesion; ");
        String pro = entrada.nextLine();
        System.out.println("Edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        Famoso famoso = new Famoso(nom,pais,pro,edad);

        return famoso;
    }


    public static void nuevoFamoso(){

        System.out.println("*** APP MANTENIMIENTO LISTA EPSTEIN ***");
        System.out.println("Insertando famoso...");
        Famoso famoso = insertarDatos();
        listaEpstein.add(famoso);
        System.out.println("Famoso insertado.");



    }
    public static void buscarFamoso(){

        boolean asistir = false;

        System.out.println("Buscando famoso...");

        Famoso famoso = insertarDatos();

            if (listaEpstein.contains(famoso)){
            asistir = true;
            }


        if (asistir){
            System.out.println("El famoso HA ACUDIDO a la lista");
        }else {
            System.out.println("El famoso no esta en la lista Epstein. No ha acudido a la lista...");

        }


    }

    public static void eliminarMenores(){

        System.out.println("Eliminando menores de edad...");

        ListIterator<Famoso> it = listaEpstein.listIterator();

        while(it.hasNext()){

            Famoso f = it.next();
            if (f.getEdad() < 18){
                it.remove();
            }
            System.out.println("-- " + f.getNombre() + " fulminado.");

        }


    }

    public static Estadistica generarEstadisticas(ArrayList<Famoso> listaEpstein){



        Estadistica estadistica = new Estadistica(listaEpstein);

        System.out.println("Estadisticas generadas: ");

        for (Map.Entry<Famoso,Integer> m : estadistica.getEstadisticas().entrySet() ){

            System.out.println("-- " + m.getKey() +": " + m.getValue() + " visita/s");
        }


        return estadistica;

    }

}
