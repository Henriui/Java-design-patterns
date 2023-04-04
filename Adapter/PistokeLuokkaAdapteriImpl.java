package Adapter;

public class PistokeLuokkaAdapteriImpl extends Pistoke implements PistokeAdapteri{

    // PistokeLuokkaAdapteriImpl extends Pistoke, joten se saa kaikki Pistoke-luokan metodit, ja
    // toteuttaa PistokeAdapteri-rajapinnan, joten se toteuttaa kaikki PistokeAdapteri-rajapinnan metodit
    // Pistoke-luokan getVoltti()-metodi palauttaa 24-volttisen pistokkeen, joten se voidaan palauttaa suoraan,
    // mutta 12-volttisen ja 3-volttisen pistokkeen voltit muunnetaan pistokkeen voltteihin

    @Override
    public Voltti get24Voltti() {
       return getVoltti();
    }

    @Override
    public Voltti get12Voltti() {
        Voltti v = getVoltti();
        return muunnaVoltit(v, 2);
    }

    @Override
    public Voltti get3Voltti() {
        Voltti v = getVoltti();
        return muunnaVoltit(v, 8);
    }
    
    private Voltti muunnaVoltit(Voltti v, int kerroin){
        return new Voltti(v.getVoltit()/kerroin);
    }
}
