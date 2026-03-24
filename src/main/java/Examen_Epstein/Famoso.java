package Examen_Epstein;

import java.util.Objects;

public class Famoso {

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Famoso famoso = (Famoso) o;
        return edad == famoso.edad && Objects.equals(nombre, famoso.nombre) && Objects.equals(pais, famoso.pais) && Objects.equals(profesion, famoso.profesion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, pais, profesion, edad);
    }

    private String nombre;
    private String pais;
    private String profesion;
    private Integer edad;

    public Famoso(String nombre, String pais, String profesion, int edad) {
        this.nombre = nombre;
        this.pais = pais;
        this.profesion = profesion;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Famoso{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", profesion='" + profesion + '\'' +
                ", edad=" + edad +
                '}';
    }

}
