package FactoryMethod;

public class VaraOpettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new PepeMake();
    };

}
