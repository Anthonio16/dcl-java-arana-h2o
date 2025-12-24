package arana;

public class AppArana {
    public static void main(String[] args) {
        Arana a = new Arana("Latrodectus");

        // Agregación: el veneno se crea aparte y se asigna al colmillo
        Veneno v = new Veneno(9);
        a.getCabeza().getColmilloIzq().setVeneno(v);
        a.getCabeza().getColmilloDer().setVeneno(v);

        a.mover();
        a.atacar();
    }
}
