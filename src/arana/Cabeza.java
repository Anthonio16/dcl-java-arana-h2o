package arana;

public class Cabeza extends SegmentoCorporal implements IMovimiento {
    private final Ojo[] ojos; // composición
    private final Colmillo colmilloIzq; // composición
    private final Colmillo colmilloDer; // composición

    public Cabeza() {
        super("Cabeza");
        this.ojos = new Ojo[8];
        for (int i = 0; i < ojos.length; i++) ojos[i] = new Ojo();

        this.colmilloIzq = new Colmillo();
        this.colmilloDer = new Colmillo();
    }

    public Colmillo getColmilloIzq() { return colmilloIzq; }
    public Colmillo getColmilloDer() { return colmilloDer; }

    @Override
    public void mover() {
        System.out.println("La cabeza se orienta y observa con " + ojos.length + " ojos.");
    }

    public void morder() {
        System.out.println("La cabeza ordena morder con ambos colmillos:");
        colmilloIzq.morder();
        colmilloDer.morder();
    }
}

