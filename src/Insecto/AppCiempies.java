package Insecto;
public class AppCiempies {
    public static void main(String[] args) {
        Ciempies c = new Ciempies("Scolopendra", 3);

        // Ejemplo de agregación: le ponemos veneno a una pata
        Veneno v = new Veneno();
        c.getSegmentos().get(0).getPIzq().setVeneno(v);

        c.mover();
    }
}
