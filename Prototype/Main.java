package Prototype;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();

        // Uusi kello
        Kello kello = new Kello(12, 30, 0);
        Kello kello2 = kello.clone(); // shallow. (samat viisarit mutta eri kello).
        Kello kello3 = kello.copy(); // deep. (Eri viisarit ja eri kellot).

        kello.setMinuutti(1);
        kello2.setMinuutti(22);
        kello3.setMinuutti(12);

        // ajastin sekunnin välein.

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                kello.tick();
                kello2.tick();
                kello3.tick();

                System.out.print("kello1: ");
                kello.printTime();
                System.out.print("kello2: ");
                kello2.printTime();
                System.out.print("kello3: ");
                kello3.printTime();
            }
        }, 0, 1000);

    }

}
