package AbstractFactory.AdidasFactory;

import AbstractFactory.Kengat;

public class AdidasKengat implements Kengat {

    @Override
    public void pueKengat() {
        System.out.println("Puit addun kengät");
    }
    @Override
    public String toString() {
        return("Adidas kengät");
    }
}
