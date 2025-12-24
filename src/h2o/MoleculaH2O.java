package h2o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoleculaH2O {
    // Composición: la molécula "posee" sus átomos
    private final Oxigeno o;
    private final Hidrogeno h1;
    private final Hidrogeno h2;

    // Agregación: enlaces referencian átomos (los enlaces pueden modelarse aparte)
    private final List<Enlace> enlaces;

    // Propiedad típica del H2O (aprox. 104.5°)
    private final double angulo;

    public MoleculaH2O() {
        this.o = new Oxigeno();
        this.h1 = new Hidrogeno();
        this.h2 = new Hidrogeno();
        this.angulo = 104.5;

        this.enlaces = new ArrayList<>();
        enlaces.add(new Enlace(o, h1, TipoEnlace.COVALENTE_SIMPLE));
        enlaces.add(new Enlace(o, h2, TipoEnlace.COVALENTE_SIMPLE));
    }

    public String formula() {
        return o.getSimbolo() + h1.getSimbolo() + h2.getSimbolo(); // "OHH" (simple)
    }

    public String formulaOrdenada() {
        return "H2O";
    }

    public double masaMolecular() {
        return o.getMasaAtomica() + h1.getMasaAtomica() + h2.getMasaAtomica();
    }

    public double getAngulo() { return angulo; }

    public List<Enlace> getEnlaces() {
        return Collections.unmodifiableList(enlaces);
    }
}

