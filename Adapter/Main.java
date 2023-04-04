package Adapter;

public class Main {
    public static void main(String[] args) {

        /*
         * Adapteri tehty luokasta Pistoke, joka palauttaa pistokkeen voltit (12).
         * Luokka ei tee muuta, mutta halutaan käyttää pistoketta, joka palauttaa 24 volttia ja 3 volttia.
         */
        System.out.println("Pistoke luokka \n");

        Pistoke pistoke = new Pistoke();
        System.out.println(pistoke.getVoltti().getVoltit()); // 24 volttia

        /*
         * Esimerkissä 1 Pistoke-luokka muunnetaan implementoimalla PistokeAdapteri ja perimällä Pistoke.
         */
        
        System.out.println("\n Luokka-adapteri \n");

        // Luo pistokkeen luokka-adapteri ja printtaa sen muunnetut voltit
        PistokeAdapteri pistokeAdapteri = new PistokeLuokkaAdapteriImpl();
        System.out.println(pistokeAdapteri.get24Voltti().getVoltit()); // Sama kuin pistokkeen oma voltti
        System.out.println(pistokeAdapteri.get12Voltti().getVoltit()); // Adapteri muuntaa pistokkeen voltit
        System.out.println(pistokeAdapteri.get3Voltti().getVoltit()); // Adapteri muuntaa pistokkeen voltit
        
        System.out.println("\n Olio-adapteri \n");

        /*
         * Esimerkissä 2 pistoke-luokka muunnetaan implementoimalla PistokeAdapteri ja luomalla Pistoke-luokan olio, 
         * josta muunnos tehdään.
         */

        // Luo pistokkeen olio-adapteri ja printtaa sen muunnetut voltit
        pistokeAdapteri = new PistokeOlioAdapteriImpl();
        System.out.println(pistokeAdapteri.get24Voltti().getVoltit()); // Sama kuin pistokkeen oma voltti
        System.out.println(pistokeAdapteri.get12Voltti().getVoltit()); // Adapteri muuntaa pistokkeen voltit
        System.out.println(pistokeAdapteri.get3Voltti().getVoltit()); // Adapteri muuntaa pistokkeen voltit
    }
}
