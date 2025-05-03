package Entidades;

import java.util.*;

public class TenenteDan {
    private List<Soldado> soldados = new ArrayList<>();

    public void adicionarObservador(Soldado s) {
        soldados.add(s);
    }

    public void detectarVietcongue() {
        System.out.println("Tenente Dan grita: 'Movimento à frente!'");

        for (Soldado s : soldados) {
            s.reagir("Movimento detectado!");
        }
    }
}
