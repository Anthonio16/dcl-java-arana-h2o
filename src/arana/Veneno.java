package arana;

public class Veneno {
    private final int potencia; // 1..10 por ejemplo

    public Veneno(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void activar() {
        System.out.println("Veneno activado (potencia=" + potencia + ").");
    }
}

