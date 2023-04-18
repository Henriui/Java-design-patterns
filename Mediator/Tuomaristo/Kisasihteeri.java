package Mediator.Tuomaristo;

import Mediator.Mediator;

public class Kisasihteeri {
    private double pisteet;
    private int kpiste = 100;

    private Mediator m;

    public Kisasihteeri(Mediator m){
        this.m = m;
    }

    public void laskePisteet(){
        // En jaksanut laskea wikipedian mukaan niin kotisäännöt
        double hyppy = m.haePituus();
        pisteet = 60  + (hyppy - (kpiste + 30));
        if (pisteet < 0) {
            pisteet = 0;
        }

        m.lisääPisteet(pisteet);
    }
}
