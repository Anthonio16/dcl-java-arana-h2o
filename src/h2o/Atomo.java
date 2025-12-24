package h2o;

public abstract class Atomo {
    private final String simbolo;
    private final int numeroAtomico;
    private final double masaAtomica;

    protected Atomo(String simbolo, int numeroAtomico, double masaAtomica) {
        this.simbolo = simbolo;
        this.numeroAtomico = numeroAtomico;
        this.masaAtomica = masaAtomica;
    }

    public String getSimbolo() { return simbolo; }
    public int getNumeroAtomico() { return numeroAtomico; }
    public double getMasaAtomica() { return masaAtomica; }
}

