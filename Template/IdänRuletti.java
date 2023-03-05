package Template;

public class IdänRuletti extends Game {

    private RulettiKone rk;
    private int p;
    private boolean x;

    IdänRuletti() {
        super();
    }

    @Override
    void initializeGame() {
        rk = new RulettiKone();
    }

    @Override
    void makePlay(int player) {
        // pyöritä rulettia
        x = rk.pyorita();
        
        if (endOfGame()) {
            // lopeta peli
            this.p = player;
        } else {
            System.out.println("pelaaja " + player + " ei voittanut. Vuoro vaihtuu.");
        }
    }
    @Override
    boolean endOfGame() {
        return x;
    }

    @Override
    void printWinner() {
        System.out.println("Pelaaja " + p + " voitti!");
    }
    
}
