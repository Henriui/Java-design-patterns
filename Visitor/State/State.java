package Visitor.State;

public interface State {
    public void nextLevel();
    public int currentLevel();
    public int playGame();
    public State calcBonus();

}
