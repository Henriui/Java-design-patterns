package AbstractFactory.AdidasFactory;

import AbstractFactory.Farmarit;

public class AdidasFarmarit implements Farmarit {

    @Override
    public void pueFarmarit() {
        System.out.println("Puit Addun farmarit\n");
    }
    @Override
    public String toString() {
        return("Adidas farmarit\n");
    }
    
}
