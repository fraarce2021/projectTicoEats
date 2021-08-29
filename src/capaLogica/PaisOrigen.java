package capaLogica;

import java.util.ArrayList;

public enum PaisOrigen {
    COSTA_RICA("Costa Rica"),
    PANAMA("Panamá"),
    MEXICO("México"),
    GUATEMALA("Guatemala");
    private String nombre;

    public String getNombre() {
        return nombre;
    }
    private PaisOrigen(String nombre){
        this.nombre = nombre;
    }
}
