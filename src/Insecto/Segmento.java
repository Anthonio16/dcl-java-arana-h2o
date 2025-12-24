package Insecto;

public class Segmento {
    // Composición: el segmento posee 2 patas
    private final Pata pIzq;
    private final Pata pDer;

    public Segmento() {
        this.pIzq = new Pata("izquierda");
        this.pDer = new Pata("derecha");
    }

    public Pata getPIzq() {
        return pIzq;
    }

    public Pata getPDer() {
        return pDer;
    }

    // No aparece como IMovimiento en el DCL, pero es útil para delegar movimiento
    public void avanzar() {
        pIzq.mover();
        pDer.mover();
    }
}
