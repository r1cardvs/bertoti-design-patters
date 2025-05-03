package AntiPatters;

import Entidades.*;

public class VietnaAcoplado {
    private ForrestGump forrest;
    private Bubba bubba;

    public VietnaAcoplado(ForrestGump forrest, Bubba bubba) {
        this.forrest = forrest;
        this.bubba = bubba;
    }

    public void detectarVietcongue() {
        System.out.println("Tenente Dan grita: 'Movimento à frente!'");
        forrest.reagir("Movimento detectado!");
        bubba.reagir("Movimento detectado!");
    }
}

