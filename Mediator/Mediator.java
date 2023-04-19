package Mediator;

import java.util.ArrayList;

import Mediator.Hyppyjäbä.Hyppy;
import Mediator.Hyppyjäbä.Hyppääjä;
import Mediator.Tulokset.Tulosrivi;
import Mediator.Tulokset.Tulostaulu;
import Mediator.Tuomaristo.Arvostelija;
import Mediator.Tuomaristo.Kisasihteeri;
import Mediator.Tuomaristo.Mittamies;

public class Mediator {
    private Hyppy hyppy;

    ArrayList<Hyppääjä> hy = new ArrayList<>();
    ArrayList<Arvostelija> ar = new ArrayList<>();

    Kisasihteeri kisi = new Kisasihteeri(this);
    Mittamies mimi = new Mittamies(this);

    Tulosrivi turi = new Tulosrivi(this);
    Tulostaulu tuta = new Tulostaulu(this);

    public Mediator(){
        for (int i = 0; i < 5; i++) {
            ar.add(new Arvostelija(this));
        }
    }

    public void aloitaHyppy() {
        hyppy = new Hyppy();
    }

    public ArrayList<Hyppääjä> getHyppääjät() {
        return hy;
    }

    public Hyppy haeHyppy() {
        return hyppy;
    }

    public void addHyppääjä(Hyppääjä h) {
        hy.add(h);
    }

    public double haePituus() {
        return hyppy.getHyppy();
    }
    public double haePisteet() {
        return hyppy.getPisteet();
    }

    public void setPituus(double pituus) {
        hyppy.setHyppy(pituus);
    }

    public void lisääPisteet(double pisteet) {
        hyppy.addPisteet(pisteet);
    }

    public void arvostele() {
        for (Arvostelija arvostelija : ar) {
            arvostelija.arvostele();
        }
    }


    public void kisaa() {
        // Jokainen hyppääjä hyppää, sitten mitataan, lasketaan pisteet ja arvostellaan.

        for (Hyppääjä hyppääjä : hy) {
            for (int i = 0; i < 2; i++) {
                hyppääjä.hyppää();
                mimi.mittaa();
                kisi.laskePisteet();
                arvostele(); // Arvostelijat arvostelevat x5
                hyppääjä.talletaHyppy();
                turi.tulosta();
            }
        }
        tuta.tulosta();
    }

}
