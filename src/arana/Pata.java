package arana;

public class Pata implements IMovimiento {
    private final int indice;   // 1..8
    private final String lado;  // "Izq" o "Der"

    public Pata(int indice, String lado) {
        this.indice = indice;
        this.lado = lado;
    }

    @Override
    public void mover() {
        System.out.println("Pata " + indice + " (" + lado + ") avanza.");
    }
}

