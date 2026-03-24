package Examen_Epstein;

import java.util.Comparator;

public class OrdenarPorProfesion implements Comparator<Famoso> {


    @Override
    public int compare(Famoso o1, Famoso o2) {

        int compararProfesion = o1.getPais().compareTo(o2.getPais());

        if (compararProfesion != 0){
            return compararProfesion;
        }

        return o1.getNombre().compareTo(o2.getNombre());
    }
}
