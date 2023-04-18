package Mediator.Tulokset;

import Mediator.Mediator;

public class Tulostaulu {

    Mediator m;

    public Tulostaulu(Mediator m) {
        this.m = m;
    }

    public void tulosta() {
        System.out.println("Tulokset:");
        for (int i = 0; i < m.getHyppääjät().size(); i++) {
            System.out.println("Kisaaja "+ i+": Isoin hyppy: "+m.getHyppääjät().get(i).getIsoinHyppy()+ " " 
            + "Yhteispisteet " + m.getHyppääjät().get(i).getHyppyPisteet() + " "
            + "Isoimman hypyn pituus " + m.getHyppääjät().get(i).getIsoinHyppyPituus());
        }
    }

}
