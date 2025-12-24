package arana;

public abstract class SegmentoCorporal {
    protected final String nombre;

    protected SegmentoCorporal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

