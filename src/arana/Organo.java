package arana;

public abstract class Organo {
    protected final String nombre;

    protected Organo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

