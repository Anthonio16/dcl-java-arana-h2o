package Insecto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ciempies implements IMovimiento {
    private final String especie;   // +Especie: String
    // Composición: el ciempiés posee una cabeza y varios segmentos
    private final Cabeza cabeza;
    private final List<Segmento> segmentos;

    public Ciempies(String especie, int cantidadSegmentos) {
        if (cantidadSegmentos <= 0) {
            throw new IllegalArgumentException("Debe tener al menos 1 segmento.");
        }
        this.especie = especie;
        this.cabeza = new Cabeza();
        this.segmentos = new ArrayList<>();

        for (int i = 0; i < cantidadSegmentos; i++) {
            segmentos.add(new Segmento());
        }
    }

    public String getEspecie() {
        return especie;
    }

    public Cabeza getCabeza() {
        return cabeza;
    }

    public List<Segmento> getSegmentos() {
        return Collections.unmodifiableList(segmentos);
    }

    @Override
    public void mover() {
        System.out.println("Ciempiés " + especie + " comienza a moverse.");
        cabeza.mover();
        for (Segmento s : segmentos) {
            s.avanzar();
        }
        System.out.println("Ciempiés " + especie + " terminó el movimiento.");
    }
}
