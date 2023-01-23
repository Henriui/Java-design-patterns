package AbstractFactory.AdidasFactory;

import AbstractFactory.Lippis;

public class AdidasLippis implements Lippis {

    @Override
    public void pueLippis() {
        System.out.println("Puit adidaksen lippiksen");
        
    }
    @Override
    public String toString() {
        return("Adidaksen lippis");
    }    
}
