package Insecto;

public class Cabeza implements IMovimiento {
    // Composición: la Cabeza "posee" sus antenas
    private final Antena aIzq;
    private final Antena aDer;

    public Cabeza() {
        this.aIzq = new Antena("Izquierdo");
        this.aDer = new Antena("Derecho");
    }

    public Antena getAIzq() {
        return aIzq;
    }

    public Antena getADer() {
        return aDer;
    }

    @Override
    public void mover() {
        System.out.println("La cabeza se orienta.");
        aIzq.mover();
        aDer.mover();
    }
}

