package AbstractFactory.BossFactory;

import AbstractFactory.Farmarit;
import AbstractFactory.Kengat;
import AbstractFactory.Lippis;
import AbstractFactory.Tpaita;
import AbstractFactory.VaateFactory;

public class BossFactory implements VaateFactory {

    @Override
    public Farmarit luoFarmarit() {
        return new BossFarmarit();
    }

    @Override
    public Kengat LuoKengat() {
        return new BossKengat();
    }

    @Override
    public Lippis luoLippis() {
        return new BossLippis();
    }

    @Override
    public Tpaita luoTpaita() {
        return new BossTpaita();
    }

}
