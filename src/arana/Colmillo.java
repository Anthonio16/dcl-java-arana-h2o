package arana;

public class Colmillo {
    // Agregación: puede ser null, y no necesariamente lo crea aquí
    private Veneno veneno;

    public void setVeneno(Veneno veneno) {
        this.veneno = veneno;
    }

    public Veneno getVeneno() {
        return veneno;
    }

    public void morder() {
        System.out.println("Colmillo muerde.");
        if (veneno != null) veneno.activar();
        else System.out.println("Sin veneno.");
    }
}

