package AbstractFactory.AdidasFactory;

import AbstractFactory.Tpaita;

public class AdidasTpaita implements Tpaita{

    @Override
    public void pueTpaita() {
        System.out.println("Puit adidaksen t-paidan\n");
    }
    @Override
    public String toString() {
        return("Adidaksen t-paita\n");
    }    
}
