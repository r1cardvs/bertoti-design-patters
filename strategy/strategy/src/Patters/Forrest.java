package Patters;

public class Forrest {
    private EstrategiaCorrida estrategia;

    public Forrest(EstrategiaCorrida estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaCorrida estrategia) {
        this.estrategia = estrategia;
    }

    public void correr() {
        estrategia.correr();
    }
}
