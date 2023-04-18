package Mediator.Tuomaristo;

import Mediator.Mediator;

public class Mittamies {
    Mediator m;

    public Mittamies(Mediator m) {
        this.m = m;
    }

    public void mittaa() {
        // Hyppy jonnekkin 50-200 väliin.
        m.setPituus( (Math.random() * 150) + 50);
    }
}
