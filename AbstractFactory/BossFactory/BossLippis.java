package AbstractFactory.BossFactory;

import AbstractFactory.Lippis;

public class BossLippis implements Lippis {

    @Override
    public void pueLippis() {
        System.out.println("Puit bossin lippiksen");
        
    }
    @Override
    public String toString() {
        return("Bossin Lippis");
    }   
}
