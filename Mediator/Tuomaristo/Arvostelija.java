package Mediator.Tuomaristo;
import Mediator.Mediator;

public class Arvostelija {
    Mediator m;

    public Arvostelija(Mediator m) {
        this.m = m;
    }

    public void arvostele() {
        // Pisteitä jonnekkin 0-20 väliin.
        m.lisääPisteet(Math.random() * 20);
    }
}
