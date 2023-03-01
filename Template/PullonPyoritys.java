package Template;

public class PullonPyoritys extends Game {

    private Pullo pullo;

    PullonPyoritys() {
        super();
    }

    @Override
    void initializeGame() {
        pullo = new Pullo(playersCount);
    }

    @Override
    void makePlay(int player) {
        int p = pullo.pyorita();
        // Jos sama pelaaja, niin pyöritetään uudestaan.
        while (p == player) {
            p = pullo.pyorita();
        }
    }
    @Override
    boolean endOfGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'endOfGame'");
    }

    @Override
    void printWinner() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printWinner'");
    }
    
}
