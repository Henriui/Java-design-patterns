package Prototype;

public class Kello implements Cloneable {

    private Viisari tuntiviisari;
    private Viisari minuuttiviisari;
    private Viisari sekuntiViisari;

    public Kello(int tunti, int minuutti, int sekunti) {
        tuntiviisari = new Viisari(tunti);
        minuuttiviisari = new Viisari(minuutti);
        sekuntiViisari = new Viisari(sekunti);

    }

    public void tick() {
        int sekunti = sekuntiViisari.addArvo(1);
        if (sekunti >= 59) {
            sekuntiViisari.setArvo(0);
            int minuutti = minuuttiviisari.addArvo(1);
            if (minuutti >= 59) {
                minuuttiviisari.setArvo(0);
                int tunti = tuntiviisari.addArvo(1);
                if (tunti >= 23) {
                    tuntiviisari.setArvo(0);
                }
            }
        }
    }

    // Java-clone metodi (shallow copy)
    @Override
    public Kello clone() {
        try {
            Kello kello = (Kello) super.clone();
            // Shallow copy
            kello.sekuntiViisari = this.sekuntiViisari;
            kello.minuuttiviisari = this.minuuttiviisari;
            kello.tuntiviisari = this.tuntiviisari;

            // Deep copy
            // kello.sekuntiViisari = new Viisari(this.sekuntiViisari.getArvo());
            // kello.minuuttiviisari = new Viisari(this.minuuttiviisari.getArvo());
            // kello.tuntiviisari = new Viisari(this.tuntiviisari.getArvo());

            return kello;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return (Kello) null;
        }
    }

    // Oma implementaatio (Deep copy)
    public Kello copy() {
        /*
         * Voisi tehdä myös clone ja asettaa viisarit uudelleen niinkuin ylempänä, mutta tämä on parempi
         * tapa.
         */
        return new Kello(this.tuntiviisari.getArvo(), this.minuuttiviisari.getArvo(),
                this.sekuntiViisari.getArvo());
    }

    public void printTime() {
        System.out.println(tuntiviisari.getArvo() + ":" + minuuttiviisari.getArvo() + ":" + sekuntiViisari.getArvo());
    }

    public void setTunti(int tunti) {
        tuntiviisari.setArvo(tunti);
    }

    public void setMinuutti(int minuutti) {
        minuuttiviisari.setArvo(minuutti);
    }

    public void setSekunti(int sekunti) {
        sekuntiViisari.setArvo(sekunti);
    }
}

class Viisari implements Cloneable {
    int arvo;

    public Viisari(int arvo) {
        this.arvo = arvo;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public int getArvo() {
        return arvo;
    }

    public int addArvo(int arvo) {
        this.arvo += arvo;
        return this.arvo;
    }
}
