package Insecto;

public class Antena implements IMovimiento {
    private final String lado; // "Izq" o "Der"

    public Antena(String lado) {
        this.lado = lado;
    }

    @Override
    public void mover() {
        System.out.println("Antena " + lado + " se mueve/escanea el entorno.");
    }
}

