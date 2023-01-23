package AbstractFactory.BossFactory;

import AbstractFactory.Farmarit;

public class BossFarmarit implements Farmarit {

    @Override
    public void pueFarmarit() {
        System.out.println("Puit bossin farmarit");
    }
@Override
public String toString() {
    return("Bossin Farmarit");
}
}
