package Patters;

import Entidades.Bubba;
import Entidades.ForrestGump;
import Entidades.TenenteDan;

public class VietnaDesacoplado {

    public VietnaDesacoplado(ForrestGump forrest, Bubba bubba) {
        TenenteDan dan = new TenenteDan();

        dan.adicionarObservador(forrest);
        dan.adicionarObservador(bubba);

        dan.detectarVietcongue();
    }
}
