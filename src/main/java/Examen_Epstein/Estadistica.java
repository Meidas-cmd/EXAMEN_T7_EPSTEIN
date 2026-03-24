package Examen_Epstein;

import java.util.*;

public class Estadistica implements Informes{


    @Override
    public String toString() {
        return "Estadistica{" +
                "estadisticas=" + estadisticas +
                '}';
    }

    private Map<Famoso,Integer> estadisticas;


    public Estadistica(Collection<Famoso> estadistica) {
        this.estadisticas = new HashMap<>();

        for (Map.Entry<Famoso,Integer> m : estadisticas.entrySet()) {
            for (Famoso f : estadistica) {

                if (m.getKey().getNombre().equalsIgnoreCase(f.getNombre())) {
                    estadisticas.put(f, m.getValue() + 1);
                } else {
                    estadisticas.put(f, 1);
                }
            }
        }
    }
    public Map<Famoso, Integer> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Map<Famoso, Integer> estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estadistica that = (Estadistica) o;
        return Objects.equals(estadisticas, that.estadisticas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(estadisticas);
    }

    @Override
    public void verPoliticos() {

        System.out.println("Identificando a la clase politica...");

        for (Map.Entry<Famoso, Integer> m : estadisticas.entrySet()) {

            if (m.getKey().getProfesion().equalsIgnoreCase("politico")){
                System.out.println("-- " + m.getKey().getNombre() + " representando a " + m.getKey().getPais());
            }

        }
    }

    @Override
    public void informeJuzgado() {

        System.out.println("Listado ordenado por paises: ");

        ArrayList<Famoso> lsitafamoso = new ArrayList<>(estadisticas.keySet());

            Collections.sort(lsitafamoso, new OrdenarPorProfesion());

            for (Famoso f : lsitafamoso){

                System.out.println(f);

            }




    }

    @Override
    public void verRanking() {


    }
}
