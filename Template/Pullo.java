package Template;

public class Pullo {
    private int pelaajamaara;
    public Pullo(int pelaajamaara) {
        this.pelaajamaara = pelaajamaara;
    }
    
    public int pyorita() {
        System.out.println("Pullo pyörii..");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        int arvo = (int) (Math.random() * pelaajamaara);

        return arvo;
    }
}
