package AbstractFactory.BossFactory;

import AbstractFactory.Tpaita;

public class BossTpaita implements Tpaita{

    @Override
    public void pueTpaita() {
        System.out.println("Puit bossin tpaita");
        
    }
    @Override
public String toString() {
    return("Bossin T-paita");
}
}
