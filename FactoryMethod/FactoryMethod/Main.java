package FactoryMethod;
public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus reksi = new Rehtori();
        AterioivaOtus apuope = new VaraOpettaja();
        opettaja.aterioi();
        reksi.aterioi();
        apuope.aterioi();
    }
}
