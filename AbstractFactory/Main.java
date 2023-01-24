package AbstractFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import AbstractFactory.AdidasFactory.AdidasFactory;
import AbstractFactory.BossFactory.BossFactory;

public class Main {
    public static void main(String[] args) {
        // Jesper on main

        Class c = null;
        VaateFactory vaatteet = null;
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("AbstractFactory/tehdas.properties"));
        } catch (IOException e) {e.printStackTrace();}
        try{
            c = Class.forName(properties.getProperty("tehdas"));
            vaatteet = (VaateFactory)c.getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

        // VaateFactory vaatteet = new AdidasFactory();
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
