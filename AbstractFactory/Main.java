package AbstractFactory;

import AbstractFactory.AdidasFactory.AdidasFactory;
import AbstractFactory.BossFactory.BossFactory;

public class Main {
    public static void main(String[] args) {
        // Jesper on main
        VaateFactory vaatteet = new AdidasFactory();
        // VaateFactory vaatteet = new BossFactory();
        Kengat kengat = vaatteet.LuoKengat();
        Tpaita tpaita = vaatteet.luoTpaita();
        Lippis lippis = vaatteet.luoLippis();
        Farmarit farmarit = vaatteet.luoFarmarit();
        
        kengat.pueKengat();
        tpaita.pueTpaita();
        lippis.pueLippis();
        farmarit.pueFarmarit();

        System.out.println("Jesperillä on päällä:" + kengat.toString() + tpaita.toString() + lippis.toString() + farmarit.toString());
        
    }
}
