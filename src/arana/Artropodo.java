package arana;

public abstract class Artropodo implements IMovimiento {
    private final String especie;

    protected Artropodo(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }
}

