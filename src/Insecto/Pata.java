package Insecto;

public class Pata implements IMovimiento {
    private final String lado; // "Izq" o "Der"
    // Agregación: la pata tiene veneno, pero el veneno podría existir aparte
    private Veneno veneno; // puede ser null

    public Pata(String lado) {
        this.lado = lado;
    }

    public void setVeneno(Veneno veneno) {
        this.veneno = veneno;
    }

    public Veneno getVeneno() {
        return veneno;
    }

    @Override
    public void mover() {
        System.out.println("Pata " + lado + " da un paso.");
        if (veneno != null) {
            veneno.activar();
        }
    }
}

