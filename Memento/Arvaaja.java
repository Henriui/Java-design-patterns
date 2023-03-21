package Memento;

public class Arvaaja extends Thread {
    private Object obj;
    private Arvuuttaja arvuuttaja;

    public Arvaaja(String num) {
        super(num);
        this.arvuuttaja = new Arvuuttaja();
    }

    public void liityPeliin(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
        this.obj = arvuuttaja.liityPeliin();
    }

    public synchronized boolean arvaa() {
        synchronized (this.arvuuttaja) {
            int guess = heitaArvaus();
            boolean arvaus = arvuuttaja.arvaa(obj, guess);
            return arvaus;
        }
    }

    public int heitaArvaus() {
        return (int) (Math.random() * 5);
    }

    @Override
    public void run() {
        boolean arvaa = false;
        while (!arvaa) {
            arvaa = arvaa();
        }
        System.out.println(this.getName() + " arvasi oikein!" + "\n");
    }

}
