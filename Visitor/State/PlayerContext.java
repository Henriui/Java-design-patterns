package Visitor.State;

public class PlayerContext {

    private State state = new LevelOne(this);

    public void setState(State state) {
        this.state = state;
    }

    public void playGame() {
        state.playGame();
    }

    public void currentLevel() {
        state.currentLevel();
    }
}
