package h2o;

public class Enlace {
    private final Atomo a1;
    private final Atomo a2;
    private final TipoEnlace tipo;

    public Enlace(Atomo a1, Atomo a2, TipoEnlace tipo) {
        this.a1 = a1;
        this.a2 = a2;
        this.tipo = tipo;
    }

    public Atomo getA1() { return a1; }
    public Atomo getA2() { return a2; }
    public TipoEnlace getTipo() { return tipo; }
}

