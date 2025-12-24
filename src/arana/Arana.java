package arana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Arana extends Artropodo {
    private final Cabeza cabeza;    // composición
    private final Abdomen abdomen;  // composición
    private final List<Pata> patas; // composición (8)

    public Arana(String especie) {
        super(especie);
        this.cabeza = new Cabeza();
        this.abdomen = new Abdomen();
        this.patas = new ArrayList<>();

        // 8 patas: 4 izq, 4 der (modelo simple)
        for (int i = 1; i <= 4; i++) patas.add(new Pata(i, "Izq"));
        for (int i = 5; i <= 8; i++) patas.add(new Pata(i, "Der"));
    }

    public Cabeza getCabeza() { return cabeza; }
    public Abdomen getAbdomen() { return abdomen; }
    public List<Pata> getPatas() { return Collections.unmodifiableList(patas); }

    @Override
    public void mover() {
        System.out.println("Araña (" + getEspecie() + ") se mueve.");
        cabeza.mover();
        for (Pata p : patas) p.mover();
    }

    public void atacar() {
        System.out.println("Araña (" + getEspecie() + ") ataca.");
        cabeza.morder();
    }
}

