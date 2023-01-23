package AbstractFactory.AdidasFactory;

import AbstractFactory.Farmarit;
import AbstractFactory.Kengat;
import AbstractFactory.Lippis;
import AbstractFactory.Tpaita;
import AbstractFactory.VaateFactory;

public class AdidasFactory implements VaateFactory {
    @Override
    public Farmarit luoFarmarit() {
        return new AdidasFarmarit();
    }

    @Override
    public Kengat LuoKengat() {
        return new AdidasKengat();
    }

    @Override
    public Lippis luoLippis() {
        return new AdidasLippis();
    }

    @Override
    public Tpaita luoTpaita() {
        return new AdidasTpaita();
    }

}
