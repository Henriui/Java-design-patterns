package Mediator.Tulokset;
import Mediator.Mediator;
import Mediator.Hyppyjäbä.Hyppy;

public class Tulosrivi {
    
    private Mediator m;

    public Tulosrivi(Mediator m) {
        this.m = m;
    }

    public void tulosta() {
        System.out.println("Pituus: " + m.haePituus() + " Pisteet: " + m.haePisteet());
    }
}
