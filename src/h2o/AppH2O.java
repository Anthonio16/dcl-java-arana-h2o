package h2o;

public class AppH2O {
    public static void main(String[] args) {
        MoleculaH2O m = new MoleculaH2O();
        System.out.println("Formula: " + m.formulaOrdenada());
        System.out.println("Angulo: " + m.getAngulo() + " grados");
        System.out.println("Masa molecular aprox: " + m.masaMolecular());
        System.out.println("Enlaces: " + m.getEnlaces().size());
    }
}

